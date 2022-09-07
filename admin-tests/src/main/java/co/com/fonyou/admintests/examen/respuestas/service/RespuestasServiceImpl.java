package co.com.fonyou.admintests.examen.respuestas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;
import co.com.fonyou.admintests.examen.respuestas.persistencia.RespuestaDAO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Service
public class RespuestasServiceImpl implements RespuestasService{

	@Autowired
	RespuestaDAO respuestaDAO;
	
	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean guardar(RespuestasDTO request) {
		respuestaDAO.guardar(request);
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
