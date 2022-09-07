package co.com.fonyou.admintests.examen.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PreguntasDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idPregunta;
	
	private String descripcion;
	
	private Double valorPregunta;
	
	private OpcionPreguntaDTO opcionPregunta;
	

}
