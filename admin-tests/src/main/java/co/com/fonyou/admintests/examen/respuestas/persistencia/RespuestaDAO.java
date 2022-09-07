package co.com.fonyou.admintests.examen.respuestas.persistencia;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;

public interface RespuestaDAO {
	
	
	Boolean guardar(RespuestasDTO request);

	Boolean actualizar(RespuestasDTO request);

	Boolean eliminar(Integer id);
	
}
