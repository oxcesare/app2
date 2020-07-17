package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Preguntas;

public interface IPreguntaService {

	public List<Preguntas> listaPreguntas();

	public Optional<Preguntas> listarId(Integer id);

	public int save(Preguntas p);

	public void delete(Preguntas p);
}
