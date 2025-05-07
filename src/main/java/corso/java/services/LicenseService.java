package corso.java.services;

import java.util.List;


import org.springframework.stereotype.Service;

import corso.java.DTO.LicenseDTO;
import corso.java.models.LicenseModel;

public interface LicenseService {
	public void addLicense(LicenseModel model);
	public List<LicenseDTO> showAll();

}
