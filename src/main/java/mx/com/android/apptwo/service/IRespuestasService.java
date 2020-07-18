package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Respuestas;

public interface IRespuestasService {
	
	public List<Respuestas> listaRespuestas();

	public Optional<Respuestas> listarId(Integer id);

	public int save(Respuestas p);

	public void delete(Respuestas p);

}
