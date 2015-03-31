package seng6250.football.models;

import seng6250.football.misc.*;
import java.util.*;

public class DefensivePlayer {
	public String name;
	public DefensivePlayerPositions position;
	public Map<Measurables, Integer> attributes;
	
	public DefensivePlayer(){
		attributes = new HashMap<Measurables, Integer>();
	}
}
