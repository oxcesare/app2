package mx.com.android.apptwo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.entity.Preguntas;
import mx.com.android.apptwo.service.impl.PreguntaService;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {

	@Autowired
	private PreguntaService preguntaService;

	@GetMapping("/listaPreguntas")
	public ResponseEntity<List<Preguntas>> listPreguntas() {
		List<Preguntas> lista = preguntaService.listaPreguntas();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/listaPreguntas/{id}")
	public ResponseEntity<Optional<Preguntas>> listPreguntas(@PathVariable("id") Integer id) {
		Optional<Preguntas> lista = preguntaService.listarId(id);
		return ResponseEntity.ok(lista);
	}

}
