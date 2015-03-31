package seng6250.football.models;

import java.util.ArrayList;

public class OffensivePlaybook {
	
	public String name;
	public ArrayList<OffensivePlay> plays;
	
	public OffensivePlaybook(){
		plays = new ArrayList<OffensivePlay>();
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
