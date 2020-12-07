package com.demo.dao;

import java.util.ArrayList;

import com.demo.bean.Player;
import com.demo.bean.Team;

public interface PlayerDao {

	int addplayer(Player pl);

	int deleteplayer(String name);

	ArrayList<Player> searchplayer(String name);

}
