package corso.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import corso.java.DTO.LicenseDTO;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;
import corso.java.services.LicenseService;
import corso.java.services.LicenseServiceImpl;

@RestController
@RequestMapping("/license")
public class LicenseController {

	@Autowired
	LicenseService licenseService;

	@PostMapping("/add")
	public ResponseEntity<LicenseEntity> addLicense(@RequestBody LicenseEntity license) {
		licenseService.addLicense(license);
		return ResponseEntity.ok(license);
	}

	@PostMapping("/bought")
	public ResponseEntity<BoughtLicenseEntity> addBoughtLicense(@RequestBody LicenseEntity model,@RequestParam int id) {
		BoughtLicenseEntity bought= licenseService.addBoughtLicense(model, id);
		return ResponseEntity.ok(BoughtLicenseEntity.builder()
				.withSerialCode(bought.getSerialCode())
				.withCompany(bought.getCompany())
				.withDate(bought.getDate())
				.withModel(model)
				.build()
				);
	}

	@GetMapping("/showAll")
	public ResponseEntity<List<LicenseDTO>> showAll() {
		return ResponseEntity.ok(licenseService.showAll());

	}

}
