package mx.com.android.apptwo.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import mx.com.android.apptwo.entity.Preguntas;
import mx.com.android.apptwo.entity.Respuestas;
import mx.com.android.apptwo.service.impl.RespuestasService;

@Service
public class RespuestasServiceResponse {

	@Autowired
	private RespuestasService respuestasService;

	public List<ResponseRespuestas> responseRespuestas() {

		List<Respuestas> lista = respuestasService.listaRespuestas();

		List<ResponseRespuestas> lsResponsePreguntas = new ArrayList<>();

		ResponseRespuestas toResponseRespuestas = null;

		for (Respuestas responseRespuestas : lista) {
			toResponseRespuestas = new ResponseRespuestas();
			toResponseRespuestas.setNumeroRespuesta(responseRespuestas.getIdRespuesta());
			toResponseRespuestas.setRespuesta(responseRespuestas.getStRespuesta());
			toResponseRespuestas.setCorrecta(responseRespuestas.getIdCorrect());
			toResponseRespuestas.setIdPregunta(responseRespuestas.getIdPregunta().getIdPregunta());
			toResponseRespuestas.setPregunta(responseRespuestas.getIdPregunta().getPregunta());

			lsResponsePreguntas.add(toResponseRespuestas);
		}

		return lsResponsePreguntas;
	}

}
