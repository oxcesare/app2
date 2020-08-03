package mx.com.android.apptwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.android.apptwo.entity.Preguntas;
import mx.com.android.apptwo.response.ResponsePreguntas;
import mx.com.android.apptwo.service.impl.PreguntaService;

@Service
public class PreguntaServiceResponse {

	@Autowired
	private PreguntaService preguntaService;

	public List<ResponsePreguntas> responsePreguntas() {

		List<Preguntas> lista = preguntaService.listaPreguntas();

		List<ResponsePreguntas> lsResponsePreguntas = new ArrayList<>();
		
		ResponsePreguntas toResponsePreguntas = null;

		for (Preguntas responsePreguntas : lista) {
			 toResponsePreguntas  = new ResponsePreguntas(); 
			 toResponsePreguntas.setId(responsePreguntas.getIdPregunta());
			 toResponsePreguntas.setPregunta(responsePreguntas.getPregunta());
			 toResponsePreguntas.setTema(responsePreguntas.getIdTema().getStDescripcion());
			 toResponsePreguntas.setNivel(responsePreguntas.getIdTema().getIdNivel().getStDescripcion());
			 lsResponsePreguntas.add(toResponsePreguntas);
		}
		
		return lsResponsePreguntas;
	}
}
