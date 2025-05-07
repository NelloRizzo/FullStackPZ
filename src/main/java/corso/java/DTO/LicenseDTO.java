package corso.java.DTO;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix="with")
public class LicenseDTO {
	String serialCode;
	LocalDate date;
	String type;

	
}
