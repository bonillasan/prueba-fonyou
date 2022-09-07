package co.com.fonyou.admintests.examen.preguntas.service;

import java.util.List;

import co.com.fonyou.admintests.examen.dto.PregResp;
import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface PreguntasService {

	List<UsuarioDTO> consultarEstudiantes();

	Boolean guardar(PreguntasDTO request);

	Boolean actualizar(UsuarioDTO request);

	Boolean eliminar(Integer id);
	
	List<PregResp> buscarPregResps();
}
