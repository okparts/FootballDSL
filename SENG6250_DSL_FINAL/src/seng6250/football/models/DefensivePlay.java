package seng6250.football.models;

import seng6250.football.misc.DefensivePlayTypes;
import seng6250.football.misc.PlayFocus;

public class DefensivePlay {
	public String name;
	public DefensivePlayTypes playType;
	public PlayFocus playFocus;
	public DefensiveFormation formation;
	
	public DefensivePlay(){
		formation = new DefensiveFormation();
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
