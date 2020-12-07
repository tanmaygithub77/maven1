package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bean.Player;
import com.demo.bean.Team;
@Repository
public class PlayerDaoImpl implements PlayerDao{
	@Autowired
	public JdbcTemplate jdbcTemplate;

	public int addplayer(Player pl) {
		String sql="insert into player(team_id,player_id,player_name) values(?,?,?)";
		int m=jdbcTemplate.update(sql,new Object[]{pl.getTeam_id(),pl.getPlayer_id(),pl.getPlayer_name()});
		return m;
	}

	public int deleteplayer(String name) {
		String sql=" delete from player where player_name=?";
		int m=jdbcTemplate.update(sql,name);
		return m;
	
	}

	public ArrayList<Player> searchplayer(String name) {
		ArrayList<Player> sarr=null;
		String sql="select * from team where player_name=?";
		sarr=(ArrayList<Player>) jdbcTemplate.query(sql,new RowMapper<Player>() {

			public Player mapRow(ResultSet rs, int arg1) throws SQLException {
				Player p=new Player(rs.getInt(1),rs.getString(2),rs.getInt(3));
				return p;
			}
		});
		return sarr;
	
		}
	}

	

