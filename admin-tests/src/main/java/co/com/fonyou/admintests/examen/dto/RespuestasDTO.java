package co.com.fonyou.admintests.examen.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespuestasDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1707869833720585425L;

	private Long idRespuesta;
	
	private Long idPregunta;
	
	private String descripcion;
	
	private Boolean estado;
}
