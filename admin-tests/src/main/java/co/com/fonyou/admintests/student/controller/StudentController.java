package co.com.fonyou.admintests.student.controller;

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

import co.com.fonyou.admintests.student.dto.UsuarioDTO;
import co.com.fonyou.admintests.student.service.StudentService;

@RestController
@RequestMapping("/api-ms-fonyou/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/consultar-estudiantes-id")
	public ResponseEntity<UsuarioDTO> consultar(@RequestParam Integer id) throws Exception{
		UsuarioDTO response = studentService.consultarEstudianteXId(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value="/consultar-estudiantes")
	public ResponseEntity<List<UsuarioDTO>> consultarTodos(){
		List<UsuarioDTO> response = studentService.consultarEstudiantes();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<Boolean> guardar(@RequestBody UsuarioDTO request){
		Boolean response = studentService.guardar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping(value="/actualizar")
	public ResponseEntity<Boolean> actualziar(@RequestBody UsuarioDTO request){
		Boolean response = studentService.actualizar(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/eliminar")
	public ResponseEntity<Boolean> eliminar(@RequestParam Integer id){
		Boolean response = studentService.eliminar(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
