package mx.com.android.apptwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.entity.Temas;
import mx.com.android.apptwo.service.impl.TemasService;

@RestController
@RequestMapping("/temas")
public class TemasController {

	@Autowired
	private TemasService temasService;

	@GetMapping("/listaTemas")
	public ResponseEntity<List<Temas>> listTemas() {
		List<Temas> temas = temasService.listaTemas();
		return ResponseEntity.ok(temas);
	}

}
