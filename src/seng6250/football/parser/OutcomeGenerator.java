package seng6250.football.parser;

import java.util.Random;

import seng6250.football.misc.OffensivePlayTypes;
import seng6250.football.models.DefensivePlay;
import seng6250.football.models.OffensivePlay;

public class OutcomeGenerator {
	
	Random generator = new Random();
	OffensivePlay _offPlay;
	DefensivePlay _defPlay;
	
	public OutcomeGenerator(OffensivePlay offPlay, DefensivePlay defPlay){
		_offPlay = offPlay;
		_defPlay = defPlay;
	}
	
	public String getOutcome(){
		String outcome = "";
		int gain;
		if(_offPlay.playType == OffensivePlayTypes.Run)
		{
			gain = generator.nextInt(15) - 15;
			if(gain < 0) {
				outcome = "The runningback is tackled behind the line of scrimmage for a loss of " + (gain * -1) + " yards.";
			}
			else {
				outcome = "The runningback runs for a gain of " + gain + " yards.";
			}
		}
		else if (_offPlay.playType == OffensivePlayTypes.Pass)
		{
			gain = generator.nextInt(35) - 35;
			if(gain < 0) {
				outcome = "The quarterback is sacked for " + (gain * -1) + " yards.";
			}
			else {
				outcome = "The quarterback passes for " + gain + " yards.";
			}			
		}
		return outcome;
	}
}
