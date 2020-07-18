package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Nivel;

public interface INivelService {
	
	public List<Nivel> listaNivel();

	public Optional<Nivel> listarId(Integer id);

	public int save(Nivel p);

	public void delete(Nivel p);
	
}
