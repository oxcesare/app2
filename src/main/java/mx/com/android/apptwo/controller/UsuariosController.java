package mx.com.android.apptwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.entity.Usuarios;
import mx.com.android.apptwo.service.impl.UsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosService usuariosService;

	@GetMapping("/listaUsuarios")
	public ResponseEntity<List<Usuarios>> listUsuarios() {
		List<Usuarios> lista = usuariosService.listaUsuarios();
		return ResponseEntity.ok(lista);
	}

}
