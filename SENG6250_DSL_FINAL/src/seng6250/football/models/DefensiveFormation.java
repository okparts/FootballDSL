package seng6250.football.models;

import seng6250.football.misc.DefensiveFormations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class DefensiveFormation {
	public DefensiveFormations formation;
	public ArrayList<DefensivePlayer> players;
	
	public DefensiveFormation(){
		players = new ArrayList<DefensivePlayer>();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Play Formation: " + formation.toString() + "\n\n");
		for(int j = 0; j < players.size(); j++)
			sb.append(players.get(j).toString() + "\n");
		return sb.toString();
	}
}
