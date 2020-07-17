package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pistas {

	@Id
	@GeneratedValue
	private Integer idPista;

	@Column(name = "ST_PISTA")
	private String stPista;

	@ManyToOne
	private Preguntas idPregunta;

	public Integer getIdPista() {
		return idPista;
	}

	public void setIdPista(Integer idPista) {
		this.idPista = idPista;
	}

	public String getStPista() {
		return stPista;
	}

	public void setStPista(String stPista) {
		this.stPista = stPista;
	}

	public Preguntas getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Preguntas idPregunta) {
		this.idPregunta = idPregunta;
	}

	

}
