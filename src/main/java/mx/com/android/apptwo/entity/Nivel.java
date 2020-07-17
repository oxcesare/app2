package mx.com.android.apptwo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nivel {

	@Id
	@GeneratedValue
	private Integer idNivel;
	
	@Column(name="ST_DESCRIPCION")
	private String stDescripcion;

	public Integer getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}

	public String getStDescripcion() {
		return stDescripcion;
	}

	public void setStDescripcion(String stDescripcion) {
		this.stDescripcion = stDescripcion;
	}

		
	
}
