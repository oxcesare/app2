package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.android.apptwo.Dao.RespuestasDAO;
import mx.com.android.apptwo.entity.Respuestas;
import mx.com.android.apptwo.service.IRespuestasService;

public class RespuestasService implements IRespuestasService {
	
	@Autowired
	private RespuestasDAO respuestasDAO;

	@Override
	public List<Respuestas> listaRespuestas() {		
		return (List<Respuestas>) respuestasDAO.findAll();
	}

	@Override
	public Optional<Respuestas> listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Respuestas p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Respuestas p) {
		// TODO Auto-generated method stub

	}

}
