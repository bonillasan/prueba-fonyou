package co.com.fonyou.admintests.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.admintests.examen.dto.ExamenDTO;
import co.com.fonyou.admintests.examen.persistencia.ExamenDAO;

@Service
public class ExamenServiceImpl implements ExamenService{

	@Autowired
	ExamenDAO examenDAO;
	

	@Override
	public ExamenDTO guardar(ExamenDTO request) {
		ExamenDTO respuesta = examenDAO.guardar(request);
		return ExamenDTO.builder().calificacion(respuesta.getCalificacion()).build();
	}

}
