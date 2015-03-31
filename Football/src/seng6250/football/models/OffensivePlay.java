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
}
