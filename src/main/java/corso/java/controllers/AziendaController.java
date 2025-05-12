package corso.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import corso.java.DTO.DTO_azienda;
import corso.java.services.AziendaService;

@RestController
@RequestMapping("/api/azienda")
public class AziendaController {
	@Autowired
	private AziendaService aziendaService;

	@GetMapping("/all")
	public ResponseEntity<List<DTO_azienda>> getAllAziende() {
		List<DTO_azienda> aziende = aziendaService.getAllAziende();
		return ResponseEntity.ok(aziende);
	}

	@GetMapping("/{idCompany}")
	public ResponseEntity<DTO_azienda> getAziendaById(@PathVariable int idCompany) {
		DTO_azienda company = aziendaService.getCompanyById(idCompany);
		return ResponseEntity.ok(company);
	}

	@PostMapping
	public ResponseEntity<String> addAzienda(@RequestBody DTO_azienda a) {
		aziendaService.addAzienda(a);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	/*
	 * public ResponseEntity<DTO_azienda> addAzienda(@RequestBody DTO_azienda a){
	 * aziendaService.addAzienda(a); return ResponseEntity.ok(a); }
	 */

	@DeleteMapping("/delete/{idCompany}")
	public ResponseEntity<Void> deleteItem(@PathVariable int idCompany) {
		boolean deleted = aziendaService.deleteCompany(idCompany);
		if (deleted) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}

	}
}