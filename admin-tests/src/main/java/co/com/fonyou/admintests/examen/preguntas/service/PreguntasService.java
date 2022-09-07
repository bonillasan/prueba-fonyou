package co.com.fonyou.admintests.examen.preguntas.service;

import java.util.List;

import co.com.fonyou.admintests.examen.dto.PregResp;
import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface PreguntasService {

	Boolean guardar(PreguntasDTO request);

	Boolean actualizar(PreguntasDTO request);

	Boolean eliminar(Integer id);
	
	List<PregResp> buscarPregResps();
}
