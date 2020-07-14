package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Respuestas {

	
	@Id
	@GeneratedValue
	private Long id;
	
	
	private String stRespuesta;
	

	@ManyToOne
	private Preguntas idPregunta;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Respuestas [id=" + id + ", stRespuesta=" + stRespuesta + ", idPregunta=" + idPregunta + "]";
	}
	
	
	
	
	
	
}
