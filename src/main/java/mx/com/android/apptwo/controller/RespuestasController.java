package mx.com.android.apptwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.entity.Respuestas;
import mx.com.android.apptwo.response.ResponseRespuestas;
import mx.com.android.apptwo.response.RespuestasServiceResponse;
import mx.com.android.apptwo.service.impl.RespuestasService;

@RestController
@RequestMapping("/respuestas")
public class RespuestasController {
	
	
	@Autowired
	private RespuestasServiceResponse serviceResponse;
	
	
	@GetMapping("/listaRespuestas")
	public ResponseEntity<List<ResponseRespuestas>> listaRespuestas() {
		List<ResponseRespuestas> response = serviceResponse.responseRespuestas();
		return ResponseEntity.ok(response);
	}

}
