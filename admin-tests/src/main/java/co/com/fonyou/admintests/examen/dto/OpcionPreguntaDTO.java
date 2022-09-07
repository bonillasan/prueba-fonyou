package co.com.fonyou.admintests.examen.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OpcionPreguntaDTO {

	private String descripcion;
	
	private Boolean opcionCorrecta;
}
