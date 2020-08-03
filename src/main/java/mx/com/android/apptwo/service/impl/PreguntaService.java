package mx.com.android.apptwo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.Dao.PreguntasDAO;
import mx.com.android.apptwo.entity.Preguntas;
import mx.com.android.apptwo.service.IPreguntaService;

@Service
public class PreguntaService implements IPreguntaService {
	
	@Autowired
	private PreguntasDAO preguntaService;
	

	@Override
	public List<Preguntas> listaPreguntas() {
		return (List<Preguntas>)preguntaService.findAll();
	}

	@Override
	public Optional<Preguntas> listarId(Integer id) {
		Optional<Preguntas> listId = preguntaService.findById(id);
		return listId;
	}

	@Override
	public int save(Preguntas p) {
		int res=0;		
		Preguntas pregunta = preguntaService.save(p);		
		if(!pregunta.equals(null)) {
			res=1;
		}		
		return 0;
	}

	@Override
	public void delete(Preguntas p) {
		// TODO Auto-generated method stub
		
	}

}
