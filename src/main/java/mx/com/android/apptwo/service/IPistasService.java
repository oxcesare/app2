package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Pistas;

public interface IPistasService {
	
	public List<Pistas> listaPistas();

	public Optional<Pistas> listarId(Integer id);

	public int save(Pistas p);

	public void delete(Pistas p);

}
