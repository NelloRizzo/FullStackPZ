package corso.java.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import corso.java.DTO.LicenseDTO;
import corso.java.DTO.LicenseOutputDTO;
import corso.java.entities.BoughtLicenseEntity;
import corso.java.entities.LicenseEntity;
import corso.java.services.LicenseService;
import corso.java.services.LicenseServiceImpl;

@RestController
@RequestMapping("/api/license")
public class LicenseController {
private static final Logger log = LoggerFactory.getLogger(LicenseController.class);
	@Autowired
	LicenseService licenseService;

	@PostMapping("/add")
	public ResponseEntity<LicenseEntity> addLicense(@RequestBody LicenseDTO license) {
		LicenseEntity l=licenseService.addLicense(license);
		return ResponseEntity.ok(l);
	}

	@PostMapping("/bought")
	public ResponseEntity<BoughtLicenseEntity> addBoughtLicense(@RequestBody BoughtLicenseEntity bLicense) {
		BoughtLicenseEntity bought= licenseService.addBoughtLicense(bLicense);
		log.info("{}",bought);
		return ResponseEntity.ok(bought);
	}

	@GetMapping("/showAll")
	public ResponseEntity<List<LicenseOutputDTO>> showAll() {
		return ResponseEntity.ok(licenseService.showAll());

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<LicenseDTO> deleteLicense(@PathVariable int id){
		LicenseDTO license=licenseService.deleteLicense(id);
		return ResponseEntity.ok().body(license);
	}

}
