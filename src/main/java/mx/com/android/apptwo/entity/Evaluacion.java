package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evaluacion {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Usuarios idUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Evaluacion [id=" + id + ", idUsuario=" + idUsuario + "]";
	}
	
	
	
	

}
