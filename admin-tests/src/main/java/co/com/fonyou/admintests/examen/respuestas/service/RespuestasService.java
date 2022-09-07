package co.com.fonyou.admintests.examen.respuestas.service;

import java.util.List;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface RespuestasService {

	
	List<UsuarioDTO> consultarEstudiantes();

	Boolean guardar(RespuestasDTO request);

	Boolean actualizar(UsuarioDTO request);

	Boolean eliminar(Integer id);
	
	List<RespuestasDTO> buscarRespuestaXIdPreg(Long idPreg);
}
