package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;

	@Column(name = "ST_NOMBRE")
	private String stNombre;

	@Column(name = "ST_APELLIDO_PATERNO")
	private String stApellidoPaterno;

	@Column(name = "ST_APELLIDO_MATERNO")
	private String stApellidoMaterno;

	@Column(name = "ST_USUARIO")
	private String stUsuario;

	@Column(name = "ST_PASSWORD")
	private String stPassword;

	@Column(name = "ST_CORREO")
	private String stCorreo;

	@ManyToOne
	private Nivel idNivel;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public void setIdNivel(Nivel idNivel) {
		this.idNivel = idNivel;
	}

}
