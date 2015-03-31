package seng6250.football.parser;

import java.util.LinkedList;
import seng6250.football.misc.*;
import seng6250.football.models.*;

public class FootballDSLObjectifier {
	
	private FootballTokenizer offTokenizer = new FootballTokenizer();
	private FootballTokenizer defTokenizer = new FootballTokenizer();
	
	public FootballDSLObjectifier(){}
	
	public OffensivePlaybook getOffensivePlaybook(String offense) throws Exception{
		
		OffensivePlaybook offensivePlaybook = new OffensivePlaybook();
		offTokenizer.tokenize(offense);
		LinkedList<Token> footballDsl = offTokenizer.getTokens();

		//for(Token t: footballDsl)
		//{
		//	System.out.println(t.sequence);
		//}		
		
		Boolean isFootballDslValid = ValidateFootballDsl(footballDsl);
		if(!isFootballDslValid)
			throw new Exception("Invalid - Football DSL");
		
		offensivePlaybook.name = footballDsl.get((TokenConstants.PLAYBOOK_NAME_INDEX + 2)).sequence.replace("'", "");
		
		// Define Offensive Play
		OffensivePlay offensivePlay = new OffensivePlay();
		offensivePlay.name = footballDsl.get((TokenConstants.PLAY_NAME_INDEX + 2)).sequence.replace("'", "");
		offensivePlay.playType = OffensivePlayTypes.valueOf(footballDsl.get((TokenConstants.PLAYTYPE_INDEX + 2)).sequence.replace("'", ""));
		offensivePlay.playFocus = PlayFocus.valueOf(footballDsl.get((TokenConstants.PLAYFOCUS_INDEX + 2)).sequence.replace("'", ""));
		
		// Define Offensive Formation
		OffensiveFormation offensiveFormation = new OffensiveFormation();
		offensiveFormation.formation = OffensiveFormations.valueOf(footballDsl.get((TokenConstants.FORMATION_INDEX + 2)).sequence.replace("'", ""));
		
		// Define Offensive Players
		int from = (TokenConstants.PLAYERS_INDEX + 3);
		int to = (TokenConstants.PLAYERS_INDEX + 3) + TokenConstants.PLAYER_TOKEN_SIZE;
		LinkedList<Token> playerDsl;
		
		for(int i = 0; i < 11; i++)
		{
			//System.out.println("" + (i+1) + ". From: " + from + " To: " + to);
			playerDsl = getPlayerSubset(footballDsl, from, to);
			Boolean isPlayerDslValid = ValidatePlayerDsl(playerDsl, UnitTypes.Offense);
			if(!isPlayerDslValid)
				throw new Exception("Invalid - Football Player DSL");
			
			OffensivePlayer offensivePlayer = new OffensivePlayer();
			String placeholder = playerDsl.get(PlayerConstants.POSITION_INDEX).sequence;
			if(Character.isDigit(placeholder.charAt(placeholder.length() - 1)))
				placeholder = placeholder.substring(0, (placeholder.length() - 1));
			offensivePlayer.position = OffensivePlayerPositions.valueOf(placeholder);
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.AGILITY_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.AGILITY_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.BLOCKING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.BLOCKING_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.CATCHING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.CATCHING_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.POWER_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.POWER_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.SMARTS_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.SMARTS_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.SPEED_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.SPEED_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.TACKLING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.TACKLING_INDEX + 2)).sequence));
			offensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.THROWING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.THROWING_INDEX + 2)).sequence));
			
			offensiveFormation.players.add(offensivePlayer);
			
			from = to + 3;
			to = from + TokenConstants.PLAYER_TOKEN_SIZE;	
		}
		
		offensivePlay.formation = offensiveFormation;
		offensivePlaybook.plays.add(offensivePlay);
		return offensivePlaybook;
	}
	
	public DefensivePlaybook getDefensivePlaybook(String defense) throws Exception{
		
		DefensivePlaybook defensivePlaybook = new DefensivePlaybook();
		defTokenizer.tokenize(defense);
		LinkedList<Token> footballDsl = defTokenizer.getTokens();
		//for(Token t: footballDsl)
		//{
		//	System.out.println(t.sequence);
		//}

		Boolean isValid = ValidateFootballDsl(footballDsl);
		if(!isValid)
			throw new Exception("Invalid Football DSL");
		
		defensivePlaybook.name = footballDsl.get((TokenConstants.PLAYBOOK_NAME_INDEX + 2)).sequence.replace("'", "");
		
		// Define Defensive Play
		DefensivePlay defensivePlay = new DefensivePlay();
		defensivePlay.name = footballDsl.get((TokenConstants.PLAY_NAME_INDEX + 2)).sequence.replace("'", "");
		defensivePlay.playType = DefensivePlayTypes.valueOf(footballDsl.get((TokenConstants.PLAYTYPE_INDEX + 2)).sequence.replace("'", ""));
		defensivePlay.playFocus = PlayFocus.valueOf(footballDsl.get((TokenConstants.PLAYFOCUS_INDEX + 2)).sequence.replace("'", ""));
		
		// Define Offensive Formation
		DefensiveFormation defensiveFormation = new DefensiveFormation();
		defensiveFormation.formation = DefensiveFormations.valueOf(footballDsl.get((TokenConstants.FORMATION_INDEX + 2)).sequence.replace("'", ""));		
		
		// Define Offensive Players
		int from = (TokenConstants.PLAYERS_INDEX + 3);
		int to = (TokenConstants.PLAYERS_INDEX + 3) + TokenConstants.PLAYER_TOKEN_SIZE;
		LinkedList<Token> playerDsl;
		
		for(int i = 0; i < 11; i++)
		{
			//System.out.println("" + (i+1) + ". From: " + from + " To: " + to);
			playerDsl = getPlayerSubset(footballDsl, from, to);
			Boolean isPlayerDslValid = ValidatePlayerDsl(playerDsl, UnitTypes.Defense);
			if(!isPlayerDslValid)
				throw new Exception("Invalid - Football Player DSL");
			
			DefensivePlayer defensivePlayer = new DefensivePlayer();
			String placeholder = playerDsl.get(PlayerConstants.POSITION_INDEX).sequence;
			if(Character.isDigit(placeholder.charAt(placeholder.length() - 1)))
				placeholder = placeholder.substring(0, (placeholder.length() - 1));
			defensivePlayer.position = DefensivePlayerPositions.valueOf(placeholder);
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.AGILITY_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.AGILITY_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.BLOCKING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.BLOCKING_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.CATCHING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.CATCHING_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.POWER_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.POWER_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.SMARTS_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.SMARTS_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.SPEED_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.SPEED_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.TACKLING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.TACKLING_INDEX + 2)).sequence));
			defensivePlayer.attributes.put(
					Measurables.valueOf(playerDsl.get(PlayerConstants.THROWING_INDEX).sequence), 
					Integer.parseInt(playerDsl.get((PlayerConstants.THROWING_INDEX + 2)).sequence));
			
			defensiveFormation.players.add(defensivePlayer);
			
			from = to + 3;
			to = from + TokenConstants.PLAYER_TOKEN_SIZE;	
		}		
		
		defensivePlay.formation = defensiveFormation;
		defensivePlaybook.plays.add(defensivePlay);
		return defensivePlaybook;
	}
	
	private LinkedList<Token> getPlayerSubset(LinkedList<Token> tokens, int from, int to)
	{
		LinkedList<Token> player = new LinkedList<Token>();
		for(int i = from; i <= to; i++){
			player.add(tokens.get(i));
		}
		return player;
	}
	
 	private Boolean ValidateFootballDsl(LinkedList<Token> footballDsl){
		
		if(footballDsl.size() != TokenConstants.TOTAL_TOKEN_SIZE)
			return false;
		
		String placeholder = footballDsl.get(TokenConstants.PLAYBOOK_INDEX).sequence;
		if(!placeholder.equals(Keywords.offensePlaybook.toString()) && !placeholder.equals(Keywords.defensePlaybook.toString()))
			return false;
		
		placeholder = footballDsl.get(TokenConstants.PLAYBOOK_NAME_INDEX).sequence;
		if(!placeholder.equals(Keywords.name.toString()))
			return false;
		
		placeholder = footballDsl.get(TokenConstants.PLAY_INDEX).sequence;
		if(!placeholder.equals(Keywords.offensivePlay.toString()) && !placeholder.equals(Keywords.defensivePlay.toString()))
			return false;
		
		placeholder = footballDsl.get(TokenConstants.PLAY_NAME_INDEX).sequence;
		if(!placeholder.equals(Keywords.name.toString()))
			return false;
		
		placeholder = footballDsl.get(TokenConstants.FORMATION_INDEX).sequence;
		if(!placeholder.equals(Keywords.formation.toString()))
			return false;			

		placeholder = footballDsl.get(TokenConstants.PLAYTYPE_INDEX).sequence;
		if(!placeholder.equals(Keywords.playType.toString()))
			return false;			
		
		placeholder = footballDsl.get(TokenConstants.PLAYFOCUS_INDEX).sequence;
		if(!placeholder.equals(Keywords.playFocus.toString()))
			return false;		
		
		placeholder = footballDsl.get(TokenConstants.PLAYERS_INDEX).sequence;
		if(!placeholder.equals(Keywords.players.toString()))
			return false;	
		
		//TODO - NEED MORE CHECKS
		
		return true;
	}
 	
 	private Boolean ValidatePlayerDsl(LinkedList<Token> playerDsl, UnitTypes ut){
 		
 		//System.out.println(playerDsl.get(0).sequence);
 		
		if(playerDsl.size() != PlayerConstants.PLAYER_TOKEN_SIZE)
			return false;
		
		String placeholder = playerDsl.get(PlayerConstants.POSITION_INDEX).sequence;
		Boolean isValidPosition = false;
		if(ut == UnitTypes.Offense)
		{
			if(Character.isDigit(placeholder.charAt(placeholder.length() - 1)))
				placeholder = placeholder.substring(0, (placeholder.length() - 1));
			for(OffensivePlayerPositions me : OffensivePlayerPositions.values())
			{
				if(me.name().equals(placeholder))
				{
					isValidPosition = true;
					break;
				}
			}
			if(!isValidPosition)
				return false;
		}
		
		if(ut == UnitTypes.Defense)
		{
			if(Character.isDigit(placeholder.charAt(placeholder.length() - 1)))
				placeholder = placeholder.substring(0, (placeholder.length() - 2));
			for(DefensivePlayerPositions me : DefensivePlayerPositions.values())
			{
				if(me.name().equals(placeholder))
				{
					isValidPosition = true;
					break;
				}
			}
			if(!isValidPosition)
				return false;
		}
		
		placeholder = playerDsl.get(PlayerConstants.AGILITY_INDEX).sequence;
		if(!placeholder.equals(Measurables.Agility.toString()))
			return false;	
		
		placeholder = playerDsl.get(PlayerConstants.BLOCKING_INDEX).sequence;
		if(!placeholder.equals(Measurables.Blocking.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.CATCHING_INDEX).sequence;
		if(!placeholder.equals(Measurables.Catching.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.POWER_INDEX).sequence;
		if(!placeholder.equals(Measurables.Power.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.SMARTS_INDEX).sequence;
		if(!placeholder.equals(Measurables.Smarts.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.SPEED_INDEX).sequence;
		if(!placeholder.equals(Measurables.Speed.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.TACKLING_INDEX).sequence;
		if(!placeholder.equals(Measurables.Tackling.toString()))
			return false;
		
		placeholder = playerDsl.get(PlayerConstants.THROWING_INDEX).sequence;
		if(!placeholder.equals(Measurables.Throwing.toString()))
			return false;
		
 		return true;
 	}
}
