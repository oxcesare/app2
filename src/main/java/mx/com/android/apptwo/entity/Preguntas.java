package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Preguntas {

	@Id
	@GeneratedValue
	private Integer idPregunta;

	@Column(name = "ST_NOMBRE")
	private String stNombre;

	@Column(name = "ST_PREGUNTA")
	private String stPregunta;

	@OneToOne
	private Nivel idNivel;

	@OneToOne
	private Temas idTema;

	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getStNombre() {
		return stNombre;
	}

	public void setStNombre(String stNombre) {
		this.stNombre = stNombre;
	}

	public String getStPregunta() {
		return stPregunta;
	}

	public void setStPregunta(String stPregunta) {
		this.stPregunta = stPregunta;
	}

	public Nivel getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Nivel idNivel) {
		this.idNivel = idNivel;
	}

	public Temas getIdTema() {
		return idTema;
	}

	public void setIdTema(Temas idTema) {
		this.idTema = idTema;
	}

	
	
	


}
