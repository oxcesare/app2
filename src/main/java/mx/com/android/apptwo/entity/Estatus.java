package mx.com.android.apptwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStatus;
	
	@Column(name="ST_STATUS")
	private String stStatus;

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getStStatus() {
		return stStatus;
	}

	public void setStStatus(String stStatus) {
		this.stStatus = stStatus;
	}

	@Override
	public String toString() {
		return "Estatus [idStatus=" + idStatus + ", stStatus=" + stStatus + "]";
	}

	
	
	
}
