package corso.java.services;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corso.java.DTO.DTO_azienda;
import corso.java.entities.Azienda_Entity;
import corso.java.repository.AziendaRepository;

@Service
public class AziendaService implements AziendaServiceInter {
	@Autowired
	private AziendaRepository aziendaRepository;

	public AziendaService(AziendaRepository aziendaRepository) {
		this.aziendaRepository = aziendaRepository;
	}
	
	private DTO_azienda costruisciDaEntity(Azienda_Entity a) {
		return DTO_azienda.builder()
		.withId(a.getId())
		.withNome(a.getNome())
		.withPartitaIva(a.getPartitaIva())
		.withIndirizzo(a.getIndirizzo())
		.withEmail(a.getEmail())
		.build();
	}
	
	private Azienda_Entity costruisciDaDto(DTO_azienda a) {
		return Azienda_Entity.builder()
				.withId(a.getId())
				.withNome(a.getNome())
				.withPartitaIva(a.getPartitaIva())
				.withIndirizzo(a.getIndirizzo())
				.withEmail(a.getEmail())
				.build();
	}

	@Override
	public List<DTO_azienda> getAllAziende() {
		try {
			List<Azienda_Entity> aziende = aziendaRepository.findAll();
			return aziende.stream().map(a -> costruisciDaEntity(a)).toList();
		} catch (Exception e) {
			throw new ServiceException("Errore!");
		}
	}

	@Override
	public void addAzienda(DTO_azienda aziendaDto) {
		Azienda_Entity azienda = costruisciDaDto(aziendaDto);
		if(!(aziendaRepository.existsByPartitaIva(azienda.getPartitaIva()))) {;
			aziendaRepository.save(azienda);
		}
	}

	@Override
	public DTO_azienda getCompanyById(int idCompany) {
		Azienda_Entity company = aziendaRepository.findById(idCompany)
				.orElseThrow(() -> new RuntimeException("Azienda non trovata!"));
		return costruisciDaEntity(company);
	}

	@Override
	public boolean deleteCompany(int idCompany) {
		if (aziendaRepository.existsById(idCompany)) {
			aziendaRepository.deleteById(idCompany);
			return true;
		}
		return false;
	}

}