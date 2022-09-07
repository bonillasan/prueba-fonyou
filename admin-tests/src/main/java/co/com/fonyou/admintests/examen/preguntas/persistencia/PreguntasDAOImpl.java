package co.com.fonyou.admintests.examen.preguntas.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import co.com.fonyou.admintests.examen.dto.PregResp;
import co.com.fonyou.admintests.examen.dto.PreguntasDTO;
import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Repository
public class PreguntasDAOImpl implements PreguntasDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static class PreguRespRowMapper implements RowMapper<PregResp>{

		@Override
		public PregResp mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return PregResp.builder()
					.idPregunta(rs.getLong("idPregunta"))
					.descripcion(rs.getString("descripcion"))
					.valorPregunta(rs.getDouble("valorPregunta"))
					.build();
		}
		
	}
	
	
	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean guardar(PreguntasDTO request) {
		String tsql = "INSERT INTO `prueba`.`preguntas`\r\n"
				+ "(`descripcion`)\r\n"
				+ "VALUES\r\n"
				+ "('"+request.getDescripcion()+"');";
		int result = jdbcTemplate.update(tsql);
		return result > 0;
	}

	@Override
	public Boolean actualizar(UsuarioDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PregResp> buscarPreguntasrespuesta() {
		String tsql="Select * from Preguntas";
		return jdbcTemplate.query(tsql, new PreguRespRowMapper());
	}

}
