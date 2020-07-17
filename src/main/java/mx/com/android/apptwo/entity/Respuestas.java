package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Respuestas {

	@Id
	@GeneratedValue
	private Integer idRespuesta;

	@Column(name = "ST_RESPUESTA")
	private String stRespuesta;

	@ManyToOne
	private Preguntas idPregunta;

	public Integer getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getStRespuesta() {
		return stRespuesta;
	}

	public void setStRespuesta(String stRespuesta) {
		this.stRespuesta = stRespuesta;
	}

	public Preguntas getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Preguntas idPregunta) {
		this.idPregunta = idPregunta;
	}
	
	

	
}
