package com.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Player;
import com.demo.bean.Team;
import com.demo.service.PlayerService;
import com.demo.service.TeamService;


public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springConfig.xml");
		TeamService tservice=(TeamService) ctx.getBean("teamServiceImpl");
	     PlayerService pservice=(PlayerService) ctx.getBean("playerServiceImpl");
		int choice=0;
		int p;
		do {
		System.out.println("1.Add team\n2.Delete team\n3.Add player\n4.Delete PLayer\n5.Display All Team\n6.Search player\n7.Exit");
		System.out.println("Enter your choice:");
		
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int n=tservice.AddTeam();
			if(n>0) {
				System.out.println("Team inserted");
			}
			else {
				System.out.println("team insertion error");
			}
			break;
		case 2:
			int m=tservice.DeleteTeam();
			if(m>0) {
				System.out.println("Team deleted");
			}
			else {
				System.out.println("team deletion error");
			}
			break;
		case 3:
		 p=pservice.AddPlayer();
			if(p>0) {
				System.out.println("Player inserted");
			}
			else {
				System.out.println("Player insertion error");
			}
			
			break;
		case 4:
			 p=pservice.DeletePlayer();
			if(p>0) {
				System.out.println("Player deleted");
			}
			else {
				System.out.println("Player deletion error");
			}
			break;
		case 5:
			ArrayList<Team> arr=tservice.display();
			for(Team t:arr) {
				System.out.println(t);
			}
			break;
		case 6:
			ArrayList<Player> srr=pservice.search();
			for(Player p1:srr) {
				System.out.println(p1);
			}
			break;
		case 7:
			
			break;
		}
		
		}while(choice!=7);
	}

}
