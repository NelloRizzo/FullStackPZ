package corso.java.services;

import java.util.List;


import org.springframework.stereotype.Service;

import corso.java.DTO.LicenseDTO;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;

public interface LicenseService {
	public void addLicense(LicenseEntity model);
	public List<LicenseDTO> showAll();
	public BoughtLicenseEntity addBoughtLicense(LicenseEntity model,int id);
	

}
