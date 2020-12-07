package com.demo.dao;

import java.util.ArrayList;

import com.demo.bean.Team;

public interface TeamDao {


	int addTeam(Team t);

	int deleteTeam(String name);

	ArrayList<Team> displayall();

}
