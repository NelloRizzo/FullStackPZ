package corso.java.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import corso.java.DTO.DTO_software;
import corso.java.services.SoftwareService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/softwares")

public class SoftwareController {
	private final SoftwareService softwareService;

	public SoftwareController(SoftwareService softwareService) {
		this.softwareService = softwareService;
	}

	@GetMapping("/allsoftwares")
	public List<DTO_software> getAllSoftwares() {
		return softwareService.getAllSoftwares();

	}

	@PostMapping("/generate")
	public void generaSoftware(@RequestBody DTO_software softwaredto) {
		softwareService.generaSoftware(softwaredto);

	}

}
