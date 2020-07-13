// **************************************************************
// ComparePlayers.java
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **************************************************************
import java.util.Scanner;
public class ComparePlayers
{
	public static void main(String[] args)
	{
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scan = new Scanner(System.in);
		//Prompt for and read in information for player 1
		System.out.println("Please enter the first players infomation: ");
		player1.readPlayer();
		//Prompt for and read in information for player 2
		System.out.println("Please enter the second players infomation: ");
		player2.readPlayer();
		//Compare player1 to player 2 and print a message saying
		//whether they are equal
		if(player1.equals(player2))
		{
			System.out.println("The players entered are the same.");
		}
		else
		{
			System.out.println("The players entered are not the same.");
		}
			
	}
}
