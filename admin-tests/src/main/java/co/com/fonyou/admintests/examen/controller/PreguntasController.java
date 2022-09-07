package co.com.fonyou.admintests.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.admintests.examen.dto.PregResp;
import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.examen.preguntas.service.PreguntasService;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@RestController
@RequestMapping("/api-ms-fonyou/preguntas")
public class PreguntasController {

	@Autowired
	private PreguntasService preguntasService;

	@GetMapping(value = "/listar-preguntas")
	public ResponseEntity<List<PregResp>> consultarTodos() {
		List<PregResp> response = preguntasService.buscarPregResps();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping(value = "/guardar")
	public ResponseEntity<Boolean> guardar(@RequestBody PreguntasDTO request) {
		Boolean response = preguntasService.guardar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping(value = "/actualizar")
	public ResponseEntity<Boolean> actualziar(@RequestBody PreguntasDTO request) {
		Boolean response = preguntasService.actualizar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping(value = "/eliminar")
	public ResponseEntity<Boolean> eliminar(@RequestParam Integer id) {
		Boolean response = preguntasService.eliminar(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
