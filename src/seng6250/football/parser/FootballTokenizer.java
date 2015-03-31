package seng6250.football.parser;

import java.util.LinkedList;

public class FootballTokenizer extends Tokenizer{
	public FootballTokenizer(){
		super.add("'(.*?)'", 1);
		super.add("offensePlaybook|defensePlaybook", 2);
		super.add("\\::=", 3);
		super.add("\\{", 4);
		super.add("\\}", 5);
		super.add("name", 6);
		super.add("\\,", 7);
		super.add("offensivePlay|defensivePlay", 8);
		super.add("formation|playType|playFocus|players", 9);
		super.add("\\(", 10);
		super.add("\\)", 11);
		super.add("Agility", 12);
		super.add("[0-9]+", 13);
		super.add("Power", 14);
		super.add("Speed", 15);
		super.add("Throwing", 16);
		super.add("Catching", 17);
		super.add("Tackling", 18);
		super.add("Blocking", 19);
		super.add("Smarts", 20);
		super.add("Quarterback|Halfback[0-9]*|Tailback[0-9]*|Fullback[0-9]*|LeftTightEnd[0-9]*|RightTightEnd[0-9]*|SlotReceiver[0-9]*|WideReceiver[0-9]*|RightTackle|LeftTackle|RightGuard|LeftGuard|Center", 21);
		super.add("RightDefensiveTackle|LeftDefensiveTackle|NoseGuard|RightDefensiveEnd|LeftDefensiveEnd|RightOutsideLinebacker|LeftOutsideLinebacker|RightInsideLinebacker|LeftInsideLinebacker|MiddleLinebacker[0-9]*|LeftCornerback[0-9]*|RightCornerback[0-9]*|FreeSafety|StrongSafety[0-9]*|Nickelback", 22);
	}
	
	public void tokenize(String t){
		super.tokenize(t);
	}
	
	public LinkedList<Token> getTokens()
	{
	   return super.getTokens();
	}
}
