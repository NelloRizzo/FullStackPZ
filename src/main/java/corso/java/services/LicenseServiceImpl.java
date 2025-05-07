package corso.java.services;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Service;

import corso.java.DTO.LicenseDTO;
import corso.java.entities.LicenseEntity;
import corso.java.models.LicenseModel;
import corso.java.repository.LicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {

	LicenseRepository licenseRepository;

	@Override
	public void addLicense(LicenseModel model) {
		LicenseEntity license= new LicenseEntity().builder()
				.withDate(LocalDate.now())
				.withSerialCode("")
				.withModel(model)
				.build();
		licenseRepository.save(null);
	}

	@Override
	public List<LicenseDTO> showAll() {

		return null;
	}
}