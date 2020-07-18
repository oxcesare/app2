package mx.com.android.apptwo.service;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.entity.Evaluacion;

public interface IEvaluacionService {
	
	
	public List<Evaluacion> listaEvaluacion();

	public Optional<Evaluacion> listarId(Integer id);

	public int save(Evaluacion p);

	public void delete(Evaluacion p);

}
