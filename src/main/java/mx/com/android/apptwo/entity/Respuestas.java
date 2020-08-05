package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

@Entity
public class Respuestas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRespuesta;

	@Column(name = "ST_RESPUESTA")
	private String stRespuesta;

	
	private Integer idCorrect;

	@ManyToOne
	private Preguntas idPregunta;

	
   public Integer getIdCorrect() {
		return idCorrect;
	}

	public void setIdCorrect(Integer idCorrect) {
		this.idCorrect = idCorrect;
	}

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
