package seng6250.football.models;

import seng6250.football.misc.*;

public class DefensivePlay {
	public String name;
	public DefensivePlayTypes playType;
	public PlayFocus playFocus;
	public DefensiveFormation formation;
	
	public DefensivePlay(){
		formation = new DefensiveFormation();
	}
}
