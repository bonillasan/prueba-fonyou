package co.com.fonyou.admintests.examen.respuestas.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;

@Repository
public class RespuestaDAOImpl implements RespuestaDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public Boolean guardar(RespuestasDTO request) {
		String tsql = "INSERT INTO `prueba`.`respuesta`\r\n"
				+ "(`descripcion`,\r\n"
				+ "`idPregunta`)\r\n"
				+ "VALUES\r\n"
				+ "('"+request.getDescripcion()+"',\r\n"
				+ "'"+request.getPregunta().getIdPregunta()+"');";
		int result = jdbcTemplate.update(tsql);
		return result > 0;
	}

	@Override
	public Boolean actualizar(RespuestasDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
