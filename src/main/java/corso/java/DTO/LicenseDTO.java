package corso.java.DTO;

import java.time.LocalDate; 

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LicenseDTO {
	String serialCode;
	LocalDate date;
	String type;

	
}
