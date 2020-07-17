package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evaluacion {
	
	@Id
	@GeneratedValue
	private Integer idEvaluacion;
	
	
	@ManyToOne
	private Usuarios idUsuario;


	public Integer getIdEvaluacion() {
		return idEvaluacion;
	}


	public void setIdEvaluacion(Integer idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}


	public Usuarios getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}


	


	
	
	

}
