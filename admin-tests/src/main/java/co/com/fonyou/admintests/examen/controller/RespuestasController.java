package co.com.fonyou.admintests.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;
import co.com.fonyou.admintests.examen.respuestas.service.RespuestasService;

@RestController
@RequestMapping("/api-ms-fonyou/respuestas")
public class RespuestasController {

	@Autowired
	RespuestasService respuestasService;
	
	@PostMapping(value="/guardar")
	public ResponseEntity<Boolean> guardar(@RequestBody RespuestasDTO request){
		Boolean response = respuestasService.guardar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
