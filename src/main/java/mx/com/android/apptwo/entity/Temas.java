package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Temas {

	@Id
	@GeneratedValue
	private Integer idTema;

	@Column(name = "ST_NOMBRE")
	private String stNombre;

	@Column(name = "ST_DESCRIPCION")
	private String stDescripcion;

	@ManyToOne
	private Nivel idNivel;

	public Integer getIdTema() {
		return idTema;
	}

	public void setIdTema(Integer idTema) {
		this.idTema = idTema;
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

	
	
	

}
