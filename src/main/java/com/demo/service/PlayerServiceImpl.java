package com.demo.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Player;
import com.demo.bean.Team;
import com.demo.dao.PlayerDao;
import com.demo.dao.TeamDao;
@Service
public class PlayerServiceImpl implements PlayerService {
Scanner sc=new Scanner(System.in);

@Autowired
	private PlayerDao playerDao;

	public int AddPlayer() {
		System.out.println("Enter Player id:");
		int pid=sc.nextInt();
		System.out.println("Enter Player Name:");
		String pname=sc.next();
		System.out.println("Enter Team id:");
		int tid=sc.nextInt();
		Player pl=new Player(pid,pname,tid);
		
		return playerDao.addplayer(pl);
	}

	public int DeletePlayer() {
		System.out.println("Enter player name to delete:");
		String name=sc.next();
		
		return playerDao.deleteplayer(name);
	}

	public ArrayList<Player> search() {
		System.out.println("Enter player name:");
		String name=sc.next();
		
		
		return playerDao.searchplayer(name);
	}

}
