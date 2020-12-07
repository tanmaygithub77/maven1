package com.demo.service;

import java.util.ArrayList;

import com.demo.bean.Team;

public interface TeamService {

	int AddTeam();

	int DeleteTeam();

	ArrayList<Team> display();

}
