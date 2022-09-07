package co.com.fonyou.admintests.examen.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespuestasDTO {

	private Long idRespuesta;
	
	private String descripcion;
	
	private Boolean estado;
	
	private PreguntasDTO pregunta;
}
