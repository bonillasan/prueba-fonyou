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
		StringBuilder tsql = new StringBuilder("Insert into respuesta Values(null,'");
		tsql.append(request.getDescripcion()+"',");
		tsql.append(request.getEstado()+",");
		tsql.append(request.getIdPregunta()+")");		
		int result = jdbcTemplate.update(tsql.toString());
		return result > 0;
	}

	@Override
	public Boolean actualizar(RespuestasDTO request) {
		StringBuilder tsql= new StringBuilder("UPDATE preguntas SET ");
		tsql.append("descripcion = '");
		tsql.append(request.getDescripcion()+"',");	
		tsql.append(" WHERE `idRespuesta` = '");
		tsql.append(request.getIdRespuesta()+"'");		
		int result = jdbcTemplate.update(tsql.toString());
		return result > 0;
	}

	@Override
	public Boolean eliminar(Integer id) {
		String tsql="DELETE FROM preguntas WHERE idRespuesta = "+id;
		int result = jdbcTemplate.update(tsql);
		return result>0;
	}

	@Override
	public List<RespuestasDTO> BuscarRespuestaXPregunta(Long idPregunta) {
		String tsql = "Select * from respuesta where idPregunta="+idPregunta; 
		return jdbcTemplate.query(tsql, new RespPregRowMapper());
	}

}
