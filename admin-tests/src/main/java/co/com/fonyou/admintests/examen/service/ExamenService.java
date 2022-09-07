package co.com.fonyou.admintests.examen.service;

import java.util.List;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface ExamenService {

	UsuarioDTO consultarEstudianteXId(Integer id) throws Exception;

	List<UsuarioDTO> consultarEstudiantes();

	Boolean guardar(ExamenDTO request);

	Boolean actualizar(UsuarioDTO request);

	Boolean eliminar(Integer id);
}
