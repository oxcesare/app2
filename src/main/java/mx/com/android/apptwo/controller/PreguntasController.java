package mx.com.android.apptwo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.android.apptwo.entity.Preguntas;
import mx.com.android.apptwo.response.ResponsePreguntas;
import mx.com.android.apptwo.service.PreguntaServiceResponse;
import mx.com.android.apptwo.service.impl.PreguntaService;

@Controller
@RequestMapping("/preguntas")
public class PreguntasController {

	@Autowired
	private PreguntaService preguntaService;

	@Autowired
	private PreguntaServiceResponse serviceResponse;

	@GetMapping("/listaPreguntasModel")
	public String listarPreguntas(Model model) {
		List<Preguntas> preguntas = preguntaService.listaPreguntas();
		model.addAttribute("preguntas", preguntas);
		return "index";
	}

	@GetMapping("/listaPreguntas")
	public ResponseEntity<List<ResponsePreguntas>> listPreguntas() {

		List<ResponsePreguntas> response = serviceResponse.responsePreguntas();

		return ResponseEntity.ok(response);
	}

	@GetMapping("/listaPreguntas/{id}")
	public ResponseEntity<Optional<Preguntas>> listPreguntas(@PathVariable("id") Integer id) {
		Optional<Preguntas> lista = preguntaService.listarId(id);
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("pregunta", new Preguntas());
		return "form";
	}

	@PostMapping("/save")
	public String save(@Validated Preguntas pregunta, Model model) {
		preguntaService.save(pregunta);
		return "redirect:/preguntas/listaPreguntasModel";
	}

}
