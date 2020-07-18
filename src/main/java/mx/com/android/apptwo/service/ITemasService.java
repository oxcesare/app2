package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Temas;

public interface ITemasService {
	
	public List<Temas> listaTemas();

	public Optional<Temas> listarId(Integer id);

	public int save(Temas p);

	public void delete(Temas p);

}
