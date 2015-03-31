package seng6250.football.models;

import seng6250.football.misc.*;
import java.util.*;

public class OffensivePlayer {
	public String name;
	public DefensivePlayerPositions position;
	public Map<Measurables, Integer> attributes = new HashMap<Measurables, Integer>();
	
	public OffensivePlayer(){
		attributes = new HashMap<Measurables, Integer>();
	}
}
