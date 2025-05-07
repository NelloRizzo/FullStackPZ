package corso.java.services;

import java.util.List;

import corso.java.DTO.DTO_azienda;

public interface AziendaServiceInter {
	public List<DTO_azienda> getAllAziende();

	public void addAzienda(DTO_azienda aziendaDto);
}
