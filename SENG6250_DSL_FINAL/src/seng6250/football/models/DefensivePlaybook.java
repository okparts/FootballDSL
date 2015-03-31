package seng6250.football.models;

import java.util.ArrayList;

public class DefensivePlaybook {
	public String name;
	public ArrayList<DefensivePlay> plays;
	
	public DefensivePlaybook(){
		plays = new ArrayList<DefensivePlay>();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Playbook Name: " + this.name + "\n");
		for(int i = 0; i < this.plays.size(); i++)
			sb.append(plays.get(i).toString() + "\n");
		return sb.toString();
	}	
}
