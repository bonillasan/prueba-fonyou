package co.com.fonyou.admintests.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.examen.persistencia.ExamenDAO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Service
public class ExamenServiceImpl implements ExamenService{

	@Autowired
	ExamenDAO examenDAO;
	
	
	@Override
	public UsuarioDTO consultarEstudianteXId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean guardar(ExamenDTO request) {
		examenDAO.guardar(request);
		return true;
	}

	@Override
	public Boolean actualizar(UsuarioDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
