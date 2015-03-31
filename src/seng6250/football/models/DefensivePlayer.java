package seng6250.football.models;

import seng6250.football.misc.Measurables;
import seng6250.football.misc.DefensivePlayerPositions;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class DefensivePlayer {
	public String name;
	public DefensivePlayerPositions position;
	public Map<Measurables, Integer> attributes;
	
	public DefensivePlayer(){
		attributes = new HashMap<Measurables, Integer>();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Player Position: " + position.toString() + "\n");
		Iterator it = this.attributes.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pairs = (Map.Entry)it.next();
			String att = pairs.getKey() + " = " + pairs.getValue() + "\n";
			sb.append(att);						
		}		
		return sb.toString();
	}	
}
