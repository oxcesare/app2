package mx.com.android.apptwo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nivel {

	@Id
	@GeneratedValue
	private Long id;
	
	private String stDescripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStDescripcion() {
		return stDescripcion;
	}

	public void setStDescripcion(String stDescripcion) {
		this.stDescripcion = stDescripcion;
	}

	@Override
	public String toString() {
		return "Nivel [id=" + id + ", stDescripcion=" + stDescripcion + "]";
	}
	
	
	
	
	
	
}
