package co.com.fonyou.admintests.examen.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PregResp {

	private Long idPregunta;

	private String descripcion;

	private Double valorPregunta;
	
	private List<RespuestasDTO> respuestas;
}
