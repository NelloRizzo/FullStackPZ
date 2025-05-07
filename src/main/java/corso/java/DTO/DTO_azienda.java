package corso.java.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class DTO_azienda {
	private int id;
	private String nome;
	private String partitaIva;
}
