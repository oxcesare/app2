package mx.com.android.apptwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.entity.Pistas;
import mx.com.android.apptwo.service.impl.PistasService;

@RestController
@RequestMapping("/pistas")
public class PistasController {

	@Autowired
	private PistasService pistasService;

	@GetMapping("/listaPistas")

	public ResponseEntity<List<Pistas>> listPistas() {
		List<Pistas> response = pistasService.listaPistas();
		return ResponseEntity.ok(response);
	}

}
