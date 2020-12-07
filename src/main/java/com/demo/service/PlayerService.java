package com.demo.service;

import java.util.ArrayList;

import com.demo.bean.Player;
import com.demo.bean.Team;

public interface PlayerService {

	int AddPlayer();

	int DeletePlayer();

	ArrayList<Player> search();

}
