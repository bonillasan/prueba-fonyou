package co.com.fonyou.admintests.examen.preguntas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.examen.dto.PregResp;
import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.examen.dto.RespuestasDTO;
import co.com.fonyou.admintests.examen.preguntas.persistencia.PreguntasDAO;
import co.com.fonyou.admintests.examen.respuestas.service.RespuestasService;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Service
public class PreguntasServiceImpl implements PreguntasService{

	@Autowired
	private PreguntasDAO preguntasDAO;
	
	@Autowired 
	private RespuestasService respuestasService;
	

	@Override
	public Boolean guardar(PreguntasDTO request) {
		preguntasDAO.guardar(request);
		return true;
	}

	@Override
	public Boolean actualizar(PreguntasDTO request) {
		return preguntasDAO.actualizar(request);
	}

	@Override
	public Boolean eliminar(Integer id) {
		preguntasDAO.eliminar(id);
		return true;
	}

	@Override
	public List<PregResp> buscarPregResps() {
		List<PregResp> response = preguntasDAO.buscarPreguntasrespuesta();
		
		response.forEach(pre->{
			List<RespuestasDTO> resp = respuestasService.buscarRespuestaXIdPreg(pre.getIdPregunta());
			pre.setRespuestas(resp);
		});
		
		return response;
	}

}
