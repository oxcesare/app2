package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Preguntas {
	
	@Id
	@GeneratedValue
	private Long id;
	private String stNombre;
	private String stPregunta;
	
	@OneToOne
	private Nivel idNivel;
	
	
	@OneToOne
	private Temas idTema;


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


	@Override
	public String toString() {
		return "Preguntas [id=" + id + ", stNombre=" + stNombre + ", stPregunta=" + stPregunta + ", idNivel=" + idNivel
				+ ", idTema=" + idTema + "]";
	}
	
	
	
	  
}
