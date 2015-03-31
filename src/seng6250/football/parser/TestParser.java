package seng6250.football.parser;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import seng6250.football.misc.*;
import seng6250.football.models.*;

public class TestParser {

	public static void main(String[] args) {
		
		FootballDSLObjectifier dsl = new FootballDSLObjectifier();
		
		String offense = "offensePlaybook ::= { name ::= 'Offensive Playbook 1', offensivePlay ::= { name ::= 'Offensive Play 1', formation ::= 'Wishbone', playType ::= 'Run', playFocus ::= 'Left', players ::= { LeftTightEnd ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, LeftTackle ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, LeftGuard ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, Center ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightGuard ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightTackle ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightTightEnd ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, Quarterback ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, Fullback ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, Halfback1 ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, Halfback2 ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) } } } }";
		String defense = "defensePlaybook ::= { name ::= 'Defensive Playbook 1', defensivePlay ::= { name ::= 'Defensive Play 1', formation ::= 'Fourthree', playType ::= 'Cover', playFocus ::= 'Left', players ::= { LeftDefensiveEnd ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, LeftDefensiveTackle ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightDefensiveTackle ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightDefensiveEnd ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, LeftOutsideLinebacker ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, MiddleLinebacker ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightOutsideLinebacker ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, LeftCornerback ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, RightCornerback ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, StrongSafety ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) }, FreeSafety ::= { (Agility, 60), (Blocking, 60), (Catching, 60), (Power, 60), (Smarts, 60), (Speed, 60), (Tackling, 60), (Throwing, 60) } } } }";
		
		try 
		{
			OffensivePlaybook offPlayBook = dsl.getOffensivePlaybook(offense);
			System.out.println(offPlayBook.toString());
/*			System.out.println("Playbook Name: " + offPlayBook.name);
			for(int i = 0; i < offPlayBook.plays.size(); i++)
			{
				OffensivePlay offPlay = offPlayBook.plays.get(i);
				System.out.println("Play Name: " + offPlay.name);
				System.out.println("Play Type: " + offPlay.playType.toString());
				System.out.println("Play Focus: " + offPlay.playFocus.toString());
				
				OffensiveFormation formation = offPlay.formation;
				System.out.println("Play Formation: " + formation.formation.toString());
				for(int j = 0; j < formation.players.size(); j++)
				{
					OffensivePlayer player = formation.players.get(j);
					System.out.println("Play Position: " + player.position.toString());
					Iterator it = player.attributes.entrySet().iterator();
					while (it.hasNext())
					{
						Map.Entry pairs = (Map.Entry)it.next();
						System.out.println(pairs.getKey() + " = " + pairs.getValue());						
					}
				}
				
			}*/
			
			DefensivePlaybook defPlayBook = dsl.getDefensivePlaybook(defense);
			System.out.println(defPlayBook.toString());
/*			System.out.println("Playbook Name: " + defPlayBook.name);
			for(int i = 0; i < defPlayBook.plays.size(); i++)
			{
				DefensivePlay defPlay = defPlayBook.plays.get(i);
				System.out.println("Play Name: " + defPlay.name);
				System.out.println("Play Type: " + defPlay.playType.toString());
				System.out.println("Play Focus: " + defPlay.playFocus.toString());
				
				DefensiveFormation formation = defPlay.formation;
				System.out.println("Play Formation: " + formation.formation.toString());
				for(int j = 0; j < formation.players.size(); j++)
				{
					DefensivePlayer player = formation.players.get(j);
					System.out.println("Play Position: " + player.position.toString());
					Iterator it = player.attributes.entrySet().iterator();
					while (it.hasNext())
					{
						Map.Entry pairs = (Map.Entry)it.next();
						System.out.println(pairs.getKey() + " = " + pairs.getValue());						
					}
				}
				
			}*/
			
			OutcomeGenerator og = new OutcomeGenerator(offPlayBook.plays.get(0), defPlayBook.plays.get(0));
                        
			String outcome = og.getOutcome();
			System.out.println(outcome);
                        System.out.println(offPlayBook.toString());
			System.out.println(defPlayBook.toString());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}
}
