package corso.java.services;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import corso.java.DTO.DTO_azienda;
import corso.java.entities.Azienda_Entity;
import corso.java.repository.AziendaRepository;

@Service
public class AziendaService implements AziendaServiceInter{
	@Autowired
	private AziendaRepository aziendaRepository;

	public AziendaService(AziendaRepository aziendaRepository) {
		this.aziendaRepository = aziendaRepository;
	}

	@Override
	public List<DTO_azienda> getAllAziende() {
		try {
			List<Azienda_Entity> aziende = aziendaRepository.findAll();
			return aziende.stream().map(a -> DTO_azienda.builder()
					.withId(a.getId())
					.withNome(a.getNome())
					.withPartitaIva(a.getPartitaIva())
					.build()).toList();
		}catch(Exception e) {
			throw new ServiceException ("Errore!");
		}
	}
	@Override
	public void addAzienda(DTO_azienda aziendaDto) {
		Azienda_Entity azienda = Azienda_Entity.builder()
				.withId(aziendaDto.getId())
				.withNome(aziendaDto.getNome())
				.withPartitaIva(aziendaDto.getPartitaIva())
				.build();
		aziendaRepository.save(azienda);
	}
	
	
	
}