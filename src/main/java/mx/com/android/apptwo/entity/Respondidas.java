package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Respondidas {

	@Id
	@GeneratedValue
	private Long id;
	
	private String stEstadoRegistro;
	
	@OneToMany
	private Usuarios idUsuario;
	
	@OneToMany
	private Temas idTema;
	
	
	@OneToMany
	private Preguntas idPregunta;
	
	@OneToMany
	private Estatus idStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStEstadoRegistro() {
		return stEstadoRegistro;
	}

	public void setStEstadoRegistro(String stEstadoRegistro) {
		this.stEstadoRegistro = stEstadoRegistro;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Temas getIdTema() {
		return idTema;
	}

	public void setIdTema(Temas idTema) {
		this.idTema = idTema;
	}

	public Preguntas getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Preguntas idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Estatus getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Estatus idStatus) {
		this.idStatus = idStatus;
	}

	@Override
	public String toString() {
		return "Respondidas [id=" + id + ", stEstadoRegistro=" + stEstadoRegistro + ", idUsuario=" + idUsuario
				+ ", idTema=" + idTema + ", idPregunta=" + idPregunta + ", idStatus=" + idStatus + "]";
	}
	
	
	
	
	
	
}
