package co.com.fonyou.admintests.student.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UsuarioDTO {

	private Integer id;
	
	private String nombre;
	
	private int edad;
	
	private Integer municipioId;
	
	private Date zonaHoraria;
}
