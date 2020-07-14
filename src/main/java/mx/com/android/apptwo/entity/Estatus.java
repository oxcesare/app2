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
	
}
