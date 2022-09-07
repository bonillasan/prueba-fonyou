package co.com.fonyou.admintests.student.persistencia;

import java.util.List;

import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface StudentDAO {
	
	UsuarioDTO consultarEstudiantesXId(Integer id) throws Exception;
	
	List<UsuarioDTO> consultarEstudiantes();
	
	Boolean guardar(UsuarioDTO alumno);
	
	Boolean actualizar(UsuarioDTO alumno);
	
	Boolean eliminar(Integer idAlumno);
	
}
