package corso.java.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder (setterPrefix = "with")

public class DTO_software {
	private double version;
	private String name;
	
}
