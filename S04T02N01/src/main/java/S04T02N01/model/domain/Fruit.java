package S04T02N01.model.domain;
import jakarta.persistence.*;

@Entity //Entitat amb la que tractarem
@Table(name = "Fruits") //Definim nom de la taula

public class Fruit {

	@Id // Definim quina serà la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Indiquem que l'Id serà incrementable
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Kg")
	private int kg;

//Getters & Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitatQuilos() {
		return kg;
	}

	public void setQuantitatQuilos(int quantitatQuilos) {
		this.kg = quantitatQuilos;
	}

}
