package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Respondidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRespondidas;

	@Column(name = "ST_ESTADO_REGISTRO")
	private String stEstadoRegistro;

	@ManyToOne
	private Preguntas idPregunta;

	@ManyToOne
	private Estatus idStatus;

	@ManyToOne
	private Temas idTema;

	@ManyToOne
	private Usuarios idUsuario;

	public Integer getIdRespondidas() {
		return idRespondidas;
	}

	public void setIdRespondidas(Integer idRespondidas) {
		this.idRespondidas = idRespondidas;
	}

	public String getStEstadoRegistro() {
		return stEstadoRegistro;
	}

	public void setStEstadoRegistro(String stEstadoRegistro) {
		this.stEstadoRegistro = stEstadoRegistro;
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

	public Temas getIdTema() {
		return idTema;
	}

	public void setIdTema(Temas idTema) {
		this.idTema = idTema;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	

	
	
}
