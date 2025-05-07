package corso.java.services;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corso.java.DTO.DTO_azienda;
import corso.java.DTO.LicenseDTO;
import corso.java.entities.Azienda_Entity;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;
import corso.java.repository.AziendaRepository;
import corso.java.repository.LicenseModelRepository;
import corso.java.repository.LicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {

	@Autowired
	LicenseRepository licenseRepository;
	@Autowired
	LicenseModelRepository licenseModelRepository;
	@Autowired
	AziendaRepository aziendaRepository;

	@Override
	public void addLicense(LicenseEntity model) {
		licenseModelRepository.save(model);
	}

	@Override
	public List<LicenseDTO> showAll() {
		return licenseRepository.findAll().stream().map(a -> LicenseDTO.builder().withSerialCode(a.getSerialCode())
				.withDate(a.getDate()).withType(a.getModel().getType()).build()).toList();
	}
	
	public BoughtLicenseEntity addBoughtLicense(LicenseEntity model,int id) {
		BoughtLicenseEntity license = BoughtLicenseEntity.builder().withDate(LocalDate.now()).withSerialCode("").withModel(model)
				.withCompany(aziendaRepository.findById(id).orElseThrow(()->new IllegalArgumentException()))
				.build();
		licenseRepository.save(license);
		return license;
	}
	
}