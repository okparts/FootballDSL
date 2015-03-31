package seng6250.football.models;

import seng6250.football.misc.OffensiveFormations;

import java.util.ArrayList;

public class OffensiveFormation {
	public OffensiveFormations formation;
	public ArrayList<OffensivePlayer> players;
	
	public OffensiveFormation(){
		players = new ArrayList<OffensivePlayer>();
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
