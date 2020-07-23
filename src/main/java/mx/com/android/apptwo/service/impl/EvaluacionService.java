package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import mx.com.android.apptwo.Dao.EvaluacionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.entity.Evaluacion;
import mx.com.android.apptwo.service.IEvaluacionService;

@Service
public class EvaluacionService implements IEvaluacionService {
	
	@Autowired
	private EvaluacionDAO evaluacionDAO;

	@Override
	public List<Evaluacion> listaEvaluacion() {		
		return (List<Evaluacion>) evaluacionDAO.findAll();
	}

	@Override
	public Optional<Evaluacion> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Evaluacion p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Evaluacion p) {
		// TODO Auto-generated method stub

	}

}
