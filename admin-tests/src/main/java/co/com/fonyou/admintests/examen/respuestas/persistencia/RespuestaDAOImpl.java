package co.com.fonyou.admintests.examen.respuestas.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import co.com.fonyou.admintests.examen.dto.RespuestasDTO;

@Repository
public class RespuestaDAOImpl implements RespuestaDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static class RespPregRowMapper implements RowMapper<RespuestasDTO>{

		@Override
		public RespuestasDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return RespuestasDTO.builder()
					.idRespuesta(rs.getLong("idRespuesta"))
					.idPregunta(rs.getLong("idPregunta"))
					.descripcion(rs.getString("descripcion"))
					.estado(rs.getBoolean("estado"))
					.build();
		}
		
	}

	@Override
	public Boolean guardar(RespuestasDTO request) {
		String tsql = "INSERT INTO `prueba`.`respuesta`\r\n"
				+ "(`descripcion`,\r\n"
				+ "`idPregunta`)\r\n"
				+ "VALUES\r\n"
				+ "('"+request.getDescripcion()+"',\r\n"
				+ "'"+request.getIdPregunta()+"');";
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

	@Override
	public List<RespuestasDTO> BuscarRespuestaXPregunta(Long idPregunta) {
		String tsql = "Select * from respuesta where idPregunta="+idPregunta; 
		return jdbcTemplate.query(tsql, new RespPregRowMapper());
	}

}
