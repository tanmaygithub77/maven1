package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bean.Team;

@Repository
public class TeamDaoImpl implements TeamDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public int addTeam(Team t) {
		int n=jdbcTemplate.update("insert into team(team_id,team_name) values(?,?)",new Object[] {t.getTeam_id(),t.getTeam_name()});
		return n;
	}

	public int deleteTeam(String name) {
		String sql="delete from team where team_name=?";
			int m=jdbcTemplate.update(sql,name);
				return m;
	}

	public ArrayList<Team> displayall() {
		ArrayList<Team> arr=null;
		String sql="select * from team";
		arr=(ArrayList<Team>) jdbcTemplate.query(sql,new RowMapper<Team>() {

			public Team mapRow(ResultSet rs, int arg1) throws SQLException {
				Team t=new Team(rs.getInt(1),rs.getString(2));
				return t;
			}
			
		});
		return arr;	
	}
	
	
	}


