package fr.eni.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fr.eni.spring.business.Expert;
import fr.eni.spring.dao.ExpertDao;

//@Repository
public class ExpertJdbcDaoImpl implements ExpertDao, RowMapper<Expert> {
	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Expert> getAll() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.query("select * from experts", this);
	}

	@Override
	public Expert get(int id) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject("select * from experts where numero=?", new Object[]{id}, this);
	}
	
	@Override
	public void delete(Expert expert) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("delete from experts where numero=?", new Object[]{expert.getNumero()});
	}
	
	@Override
	public List<Expert> getByNom(String nom) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//return jdbcTemplate.query("select * from experts where nom like '" + nom + "%'", this);
		return jdbcTemplate.query("select * from experts where nom like ?", new Object[]{nom}, this);
	}
	
	@Override
	public void creer(Expert expert) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("insert into experts (nom, prenom) values (?, ?, ?)", new Object[]{expert.getNom(), expert.getPrenom()});		
	}

	@Override
	public void modifier(Expert expert) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("update experts set nom=?, prenom=? where numero=?", new Object[]{expert.getNom(), expert.getPrenom(), expert.getNumero()});	
	}

	public Expert mapRow(ResultSet rs, int num) throws SQLException {
		Expert expert = new Expert();
		expert.setNumero(rs.getInt("numero"));
		expert.setNom(rs.getString("nom"));
		expert.setPrenom(rs.getString("prenom"));
		
		return expert;
	}
}
