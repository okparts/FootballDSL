package seng6250.football.models;

import seng6250.football.misc.*;

public class OffensivePlay {
	public String name;
	public OffensivePlayTypes playType;
	public PlayFocus playFocus;
	public OffensiveFormation formation;
	
	public OffensivePlay(){
		formation = new OffensiveFormation();
	}	
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Play Name: " + this.name + "\n");
		sb.append("Play Type: " + this.playType.toString() + "\n");
		sb.append("Play Focus: " + this.playFocus.toString() + "\n");
		sb.append(this.formation.toString() + "\n");
		return sb.toString();
	}	
}
