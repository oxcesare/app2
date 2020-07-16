package mx.com.android.apptwo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pistas {
	
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String stPista;
	
	@ManyToOne
	private Preguntas idPregunta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Pistas [id=" + id + ", stPista=" + stPista + ", idPregunta=" + idPregunta + "]";
	}
	
	
	
	
	  
	
}
