package chapterFive;

import javax.swing.JOptionPane;

public class SoccerTeam {

	public static void main(String[] args) {
		
		
		final int MIN_PLAYERS = 9;
		final int MAX_PLAYERS = 15;
		int players;
		int teamSize;
		int teams;
		int leftOver;
		String input;
		input = JOptionPane.showInputDialog (" Enter the number of " + " players per team.");
		teamSize = Integer.parseInt( input);
		
         while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)	{
        	 
        	 input = JOptionPane.showInputDialog ( " The number must " + " bee at least " 
        	 + MIN_PLAYERS + " and no more than " + MAX_PLAYERS + " .\n Enter " 
        	 + " the number of players. ");
        	 teamSize = Integer.parseInt(input);
         }
	      
         input = JOptionPane.showInputDialog ( " Enter the available " + " number of players. ");

	      players = Integer.parseInt(input);
	      
	      // Validate the number entered.    
	      while (players < 0)
	      {
	         input = JOptionPane.showInputDialog("Enter 0 or " +
	                                             "greater.");
	         players = Integer.parseInt(input);
	      }
	 
	      // Calculate the number of teams.
	      teams = players / teamSize; 

	      // Calculate the number of leftover players.
	      leftOver = players % teamSize;

	      // Display the results.
	      JOptionPane.showMessageDialog(null, "There will be " + 
	                                    teams + " teams with " +
	                                    leftOver + 
	                                    " players left over.");
	      System.exit(0); 
		
		
		
	}

}
