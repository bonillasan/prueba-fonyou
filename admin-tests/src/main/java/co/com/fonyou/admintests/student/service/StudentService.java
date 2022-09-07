package co.com.fonyou.admintests.student.service;

import java.util.List;

import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface StudentService {

	UsuarioDTO consultarEstudianteXId(Integer id) throws Exception;

	List<UsuarioDTO> consultarEstudiantes();

	Boolean guardar(UsuarioDTO request);

	Boolean actualizar(UsuarioDTO request);

	Boolean eliminar(Integer id);
}
