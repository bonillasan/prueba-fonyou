package co.com.fonyou.admintests.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.student.dto.UsuarioDTO;
import co.com.fonyou.admintests.student.persistencia.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	@Override
	public UsuarioDTO consultarEstudianteXId(Integer id)throws Exception {
		return studentDAO.consultarEstudiantesXId(id);
	}

	@Override
	public List<UsuarioDTO> consultarEstudiantes() {

		return studentDAO.consultarEstudiantes();
	}

	@Override
	public Boolean guardar(UsuarioDTO request) {
		studentDAO.guardar(request);
		return true;
	}

	@Override
	public Boolean actualizar(UsuarioDTO request) {
		studentDAO.actualizar(request);
		return true;
	}

	@Override
	public Boolean eliminar(Integer id) {
		studentDAO.eliminar(id);
		return true;
	}

}
