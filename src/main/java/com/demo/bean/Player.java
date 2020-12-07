package com.demo.bean;

public class Player {
	private int player_id;
	private String player_name;
	private int team_id;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int player_id, String player_name, int team_id) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.team_id = team_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", team_id=" + team_id + "]";
	}
	

}
