package co.com.fonyou.admintests.examen.preguntas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.examen.preguntas.persistencia.PreguntasDAO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Service
public class PreguntasServiceImpl implements PreguntasService{

	@Autowired
	PreguntasDAO preguntasDAO;
	
	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean guardar(PreguntasDTO request) {
		preguntasDAO.guardar(request);
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
