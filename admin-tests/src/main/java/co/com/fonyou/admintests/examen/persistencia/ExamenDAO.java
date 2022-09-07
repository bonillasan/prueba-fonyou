package co.com.fonyou.admintests.examen.persistencia;

import java.util.List;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

public interface ExamenDAO {

UsuarioDTO consultarEstudiantesXId(Integer id) throws Exception;
	
	List<UsuarioDTO> consultarEstudiantes();
	
	Boolean guardar(ExamenDTO alumno);
	
	Boolean actualizar(UsuarioDTO alumno);
	
	Boolean eliminar(Integer idAlumno);
}
