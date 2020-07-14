package mx.com.android.apptwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estatus {
	
	@Id
	@GeneratedValue
	private Long id;
	private String stStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStStatus() {
		return stStatus;
	}
	public void setStStatus(String stStatus) {
		this.stStatus = stStatus;
	}
	@Override
	public String toString() {
		return "Estatus [id=" + id + ", stStatus=" + stStatus + "]";
	}
	
	
	
	
	
}
