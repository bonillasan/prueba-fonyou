package co.com.fonyou.admintests.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.examen.service.ExamenService;

@RestController
@RequestMapping("/api-ms-fonyou/examen")
public class ExamenController {
	
	@Autowired
	ExamenService examenService;
	
	@PostMapping(value="/guardar")
	public ResponseEntity<Boolean> guardar(@RequestBody ExamenDTO request){
		Boolean response = examenService.guardar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
