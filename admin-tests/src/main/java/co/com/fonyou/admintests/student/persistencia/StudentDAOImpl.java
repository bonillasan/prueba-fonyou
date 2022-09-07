package co.com.fonyou.admintests.student.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import co.com.fonyou.admintests.student.dto.UsuarioDTO;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static class PersonasRow implements RowMapper<UsuarioDTO> {

		@Override
		public UsuarioDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return UsuarioDTO.builder().id(rs.getInt("idAlumno")).nombre(rs.getString("nombre")).edad(rs.getInt("edad"))
					.municipioId(rs.getInt("municipioId")).zonaHoraria(rs.getDate("zonaHoraria")).build();
		}

	}
	
	@Override
	public UsuarioDTO consultarEstudiantesXId(Integer id) throws Exception {
		try {
		String tsql = "select * from estudiante where idAlumno like '%"+id+"%'";
		return jdbcTemplate.query(tsql, new PersonasRow()).get(0);
		}catch (Exception e) {
			throw new Exception(e.getLocalizedMessage());
		}
	}

	@Override
	public List<UsuarioDTO> consultarEstudiantes() {
		String tsql = "Select * from estudiante";
		return jdbcTemplate.query(tsql, new PersonasRow());
	}

	@Override
	public Boolean guardar(UsuarioDTO estudiante) {
		String tsql = "INSERT INTO `prueba`.`estudiante`\r\n"
				+ "(`nombre`,\r\n"
				+ "`edad`,\r\n"
				+ "`municipioId`)\r\n"
				+ "VALUES\r\n"
				+ "('"+estudiante.getNombre()+"',\r\n"
				+ "'"+estudiante.getEdad()+"',\r\n"
				+ "'"+estudiante.getMunicipioId()+"');";
		int result = jdbcTemplate.update(tsql);
		return result > 0;
	}
	
	@Override
	public Boolean actualizar(UsuarioDTO estudiante) {
		StringBuilder tsql= new StringBuilder("UPDATE `prueba`.`estudiante`\r\n"
				+ "SET ");
		tsql.append("`nombre` = '");
		tsql.append(""+estudiante.getNombre()+"',");
		tsql.append("`edad` = '");
		tsql.append(""+estudiante.getEdad()+"',");
		tsql.append("`municipioId` = '");
		tsql.append(""+estudiante.getMunicipioId()+"'");
		tsql.append(" WHERE `idAlumno` = '");
		tsql.append(""+estudiante.getId()+"';");
		
		int result = jdbcTemplate.update(tsql.toString());
		return result > 0;
	}

	@Override
	public Boolean eliminar(Integer id) {
		String tsql="DELETE FROM `prueba`.`estudiante`\r\n"
				+ "WHERE idAlumno = '"+id+"';";
		int result = jdbcTemplate.update(tsql);
		return result>0;
	}

}
