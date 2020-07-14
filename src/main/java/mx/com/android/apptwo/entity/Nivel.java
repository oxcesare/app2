package mx.com.android.apptwo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nivel {

	@Id
	@GeneratedValue
	private Long id;
	
}
