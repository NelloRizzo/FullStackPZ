package corso.java.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aziende")
@Builder(setterPrefix = "with")
public class Azienda_Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "nome",nullable = false,length=50)
	private String nome;
	@Column(name = "partita_iva", nullable = false,length=11)
	private String partitaIva;
	@Column(name="indirizzo", nullable=false, length=55)
	private String indirizzo;
	@Column(name="email", nullable=false, length=55)
	private String email;
}

