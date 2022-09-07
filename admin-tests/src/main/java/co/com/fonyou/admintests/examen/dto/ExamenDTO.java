package co.com.fonyou.admintests.examen.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExamenDTO {

	private Long idExamen; 
	
	private String calificacion;
	
	private PreguntasDTO preguntas;
}
