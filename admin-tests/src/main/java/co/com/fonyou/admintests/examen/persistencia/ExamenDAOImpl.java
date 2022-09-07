package co.com.fonyou.admintests.examen.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Repository
public class ExamenDAOImpl implements ExamenDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public UsuarioDTO consultarEstudiantesXId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean guardar(ExamenDTO examen) {
		String tsql = "";
		int result = jdbcTemplate.update(tsql);
		return result > 0;
	}

	@Override
	public Boolean actualizar(UsuarioDTO alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminar(Integer idAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

}
