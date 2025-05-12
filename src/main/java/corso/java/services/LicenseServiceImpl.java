package corso.java.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corso.java.DTO.DTO_azienda;
import corso.java.DTO.LicenseDTO;
import corso.java.DTO.LicenseOutputDTO;
import corso.java.entities.Azienda_Entity;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;
import corso.java.repository.AziendaRepository;
import corso.java.repository.LicenseEntityRepository;
import corso.java.repository.SoftwareRepository;
import corso.java.repository.BoughtLicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {
	@Autowired
	SoftwareRepository softwareRepository;
	@Autowired
	BoughtLicenseRepository licenseBoughtRepository;
	@Autowired
	LicenseEntityRepository licenseEntityRepository;
	@Autowired
	AziendaRepository aziendaRepository;

	@Override
	public LicenseEntity addLicense(LicenseDTO model) {

		LicenseEntity license = LicenseEntity.builder().withLife(model.getLife()).withPrice(model.getPrice())
				.withType(model.getType())
				.withSoftware(softwareRepository.findById(model.getSoftwareId()).orElseThrow()).build();
		licenseEntityRepository.save(license);
		return license;
	}

	@Override
	public List<LicenseOutputDTO> showAll() {
		return licenseEntityRepository.findAll().stream().map(l -> LicenseOutputDTO.builder().withLife(l.getLife())
				.withPrice(l.getPrice()).withSoftware(l.getSoftware()).withType(l.getType()).withId(l.getId()).build())
				.toList();
	}

	public BoughtLicenseEntity addBoughtLicense(BoughtLicenseEntity bLicense) {
		int idA = bLicense.getCompany().getId();
		int idL = bLicense.getModel().getId();
		BoughtLicenseEntity license = BoughtLicenseEntity.builder().withDate(LocalDate.now())
				.withSerialCode(createSerialCode()).withModel(licenseEntityRepository.findById(idL).orElseThrow())
				.withCompany(aziendaRepository.findById(idA).orElseThrow(() -> new IllegalArgumentException())).build();
		licenseBoughtRepository.save(license);
		return license;
	}

	public String createSerialCode() {
		Random rnd = new Random();
		String s = "";
		for (int i = 0; i < 8; i++) {
			s = s + rnd.nextInt(9);
		}
		if (licenseBoughtRepository.findBySerialCode(s)) {
			s = createSerialCode();
		}
		return s;
	}

	@Override
	public LicenseDTO deleteLicense(int id) {
		LicenseEntity license= licenseEntityRepository.findById(id).orElseThrow();
		LicenseDTO licenseToDelete=LicenseDTO.builder()
				.withLife(license.getLife())
				.withPrice(license.getPrice())
				.withSoftwareId(license.getSoftware().getId())
				.withType(license.getType())
				.build();
		licenseEntityRepository.deleteById(id);
		return licenseToDelete;
		
	}

}