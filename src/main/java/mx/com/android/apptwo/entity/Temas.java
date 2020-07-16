package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Temas {

	@Id
	@GeneratedValue
	private Long id;
	private String stNombre;
	private String stDescripcion;

	@OneToOne
	private Nivel idNivel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStNombre() {
		return stNombre;
	}

	public void setStNombre(String stNombre) {
		this.stNombre = stNombre;
	}

	public String getStDescripcion() {
		return stDescripcion;
	}

	public void setStDescripcion(String stDescripcion) {
		this.stDescripcion = stDescripcion;
	}

	public Nivel getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Nivel idNivel) {
		this.idNivel = idNivel;
	}

	@Override
	public String toString() {
		return "Temas [id=" + id + ", stNombre=" + stNombre + ", stDescripcion=" + stDescripcion + ", idNivel="
				+ idNivel + "]";
	}

}
