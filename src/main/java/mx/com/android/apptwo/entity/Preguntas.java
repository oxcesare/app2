package mx.com.android.apptwo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Preguntas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPregunta;

	@Column(name = "ST_PREGUNTA", columnDefinition = "TEXT")
	private String pregunta;

	@ManyToOne(cascade = {CascadeType.MERGE})
	private Temas idTema;
	
	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Temas getIdTema() {
		return idTema;
	}

	public void setIdTema(Temas idTema) {
		this.idTema = idTema;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

}
