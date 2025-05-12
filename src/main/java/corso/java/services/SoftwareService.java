package corso.java.services;

import java.util.List;

import corso.java.DTO.DTO_software;

public interface SoftwareService {
	
	public List<DTO_software> getAllSoftwares();
	public void  generaSoftware(DTO_software softwaredto);
	public void eliminaSoftware(Integer id);

}
