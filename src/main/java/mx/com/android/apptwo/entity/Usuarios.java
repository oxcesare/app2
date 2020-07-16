package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String stNombre;
	
	private String stApellidoPaterno;
	
	private String stApellidoMaterno;
	
	private String stUsuario;
	
	private String stPassword;
	
	
	private String stCorreo;
	
	@OneToOne
	private Nivel  idNivel;

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

	public String getStApellidoPaterno() {
		return stApellidoPaterno;
	}

	public void setStApellidoPaterno(String stApellidoPaterno) {
		this.stApellidoPaterno = stApellidoPaterno;
	}

	public String getStApellidoMaterno() {
		return stApellidoMaterno;
	}

	public void setStApellidoMaterno(String stApellidoMaterno) {
		this.stApellidoMaterno = stApellidoMaterno;
	}

	public String getStUsuario() {
		return stUsuario;
	}

	public void setStUsuario(String stUsuario) {
		this.stUsuario = stUsuario;
	}

	public String getStPassword() {
		return stPassword;
	}

	public void setStPassword(String stPassword) {
		this.stPassword = stPassword;
	}

	public String getStCorreo() {
		return stCorreo;
	}

	public void setStCorreo(String stCorreo) {
		this.stCorreo = stCorreo;
	}

	public Nivel getIdNivel() {
		return idNivel;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", stNombre=" + stNombre + ", stApellidoPaterno=" + stApellidoPaterno
				+ ", stApellidoMaterno=" + stApellidoMaterno + ", stUsuario=" + stUsuario + ", stPassword=" + stPassword
				+ ", stCorreo=" + stCorreo + ", idNivel=" + idNivel + "]";
	}

	public void setIdNivel(Nivel idNivel) {
		this.idNivel = idNivel;
	}
	
	
	

}
