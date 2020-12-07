package com.demo.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Team;
import com.demo.dao.TeamDao;

@Service
public class TeamServiceImpl implements TeamService {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private TeamDao teamDao;
	public int AddTeam() {
		
		System.out.println("Enter team id:");
		int id=sc.nextInt();
		System.out.println("Enter team name:");
		String name=sc.next();
		Team t=new Team(id,name);
		return teamDao.addTeam(t);
	}
	public int DeleteTeam() {
		System.out.println("Enter name of Team to Delete:");
		String name=sc.next();
		return teamDao.deleteTeam(name);
	}
	public ArrayList<Team> display() {
		
		return teamDao.displayall();
	}

}
