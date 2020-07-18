package mx.com.android.apptwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.android.apptwo.service.impl.TemasService;

@RestController
@RequestMapping("/temas")
public class TemasController {
	
	@Autowired
	private TemasService temasService;

}
