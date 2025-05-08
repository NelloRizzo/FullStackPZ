package corso.java.services;

import java.util.List;


import org.springframework.stereotype.Service;

import corso.java.DTO.LicenseDTO;
import corso.java.DTO.LicenseOutputDTO;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;

public interface LicenseService {
	public LicenseEntity addLicense(LicenseDTO model);
	public List<LicenseOutputDTO> showAll();
	public BoughtLicenseEntity addBoughtLicense(BoughtLicenseEntity bLicense);
	

}
