package corso.java.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import corso.java.DTO.DTO_software;
import corso.java.entities.Software_Entity;
import corso.java.repository.SoftwareRepository;

@Service
public class SoftwareServiceImpl implements SoftwareService{
	private final SoftwareRepository softwareRepository;

	public SoftwareServiceImpl(SoftwareRepository softwareRepository) {
		this.softwareRepository = softwareRepository;
	}

	public List<DTO_software> getAllSoftwares() {
		List<DTO_software> softwareList = softwareRepository.findAll().stream()
				.map(
				software -> DTO_software.builder()
				.withName(software.getName())
				.withVersion(software.getVersion()).build())
				.collect(Collectors.toList());

		return softwareList;

	}

	public void  generaSoftware(DTO_software softwaredto) {
		Software_Entity software = Software_Entity.builder()
				.withName(softwaredto.getName())
				.withVersion(softwaredto.getVersion())
				.build();
		softwareRepository.save(software);
	}

	@Override
	public void eliminaSoftware(int id) {
		if (!softwareRepository.existsById(id)) {
			throw new IllegalArgumentException("Software non presente in Database");
			
		}
		softwareRepository.deleteById(id);
		
	}


	
}
