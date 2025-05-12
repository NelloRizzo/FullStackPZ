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

	@Override
	public List<DTO_azienda> getAllAziende() {
		try {
			List<Azienda_Entity> aziende = aziendaRepository.findAll();
			return aziende.stream()
					.map(a -> DTO_azienda.builder().withId(a.getId()).withNome(a.getNome())
							.withPartitaIva(a.getPartitaIva()).withIndirizzo(a.getIndirizzo()).withEmail(a.getEmail())
							.build())
					.toList();
		} catch (Exception e) {
			throw new ServiceException("Errore!");
		}
	}

	@Override
	public void addAzienda(DTO_azienda aziendaDto) {
		Azienda_Entity azienda = Azienda_Entity.builder().withId(aziendaDto.getId()).withNome(aziendaDto.getNome())
				.withPartitaIva(aziendaDto.getPartitaIva()).withIndirizzo(aziendaDto.getIndirizzo())
				.withEmail(aziendaDto.getEmail()).build();
		String pi = azienda.getPartitaIva();
		if(!(aziendaRepository.existsByPartitaIva(pi))) {;
			aziendaRepository.save(azienda);
		}
	}

	@Override
	public DTO_azienda getCompanyById(int idCompany) {

		Azienda_Entity company = aziendaRepository.findById(idCompany)
				.orElseThrow(() -> new RuntimeException("Azienda non trovata!"));

		return DTO_azienda.builder().withId(company.getId()).withNome(company.getNome())
				.withPartitaIva(company.getPartitaIva()).build();
	}

	@Override
	public boolean deleteCompany(int idCompany) {
		if (aziendaRepository.existsById(idCompany)) {
			aziendaRepository.deleteById(idCompany);
			return true;
		} else
			return false;
	}

}