import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.io.*;


public class Population
 	{
 		public static void main(String[] args) throws IOException
 		{

 				Scanner input = new Scanner(System.in);
 				DecimalFormat formatter = new DecimalFormat("###,###,###,###,###.00");
 				int startingNumberOfOrganism = 0, daysOverMultiplying = 0;
 				double averageDailyPopulationIncrease, dailyPopulation, percentIncrease;

 				System.out.print("What is the starting number of organisms? ");
 				startingNumberOfOrganism = input.nextInt();

 				while(startingNumberOfOrganism < 2)
 				{
 					System.out.print("Invalid Input, enter number greater than 2 ");
  					startingNumberOfOrganism = input.nextInt();

 				}

 				System.out.print("What is the average daily population increase?(provide integer number, ie 10 for %10): ");
 				averageDailyPopulationIncrease = input.nextInt();

 				while(averageDailyPopulationIncrease < 2)
 				{
 					System.out.print("Invalid Input, enter an integer greater than one" );
  					averageDailyPopulationIncrease = input.nextDouble();
 				}

 				System.out.print("Population Increase will occur over how many days?");
 				daysOverMultiplying = input.nextInt();

 				while(daysOverMultiplying < 1)
 				{
 					System.out.print("Invalid Input,please input at least 1: ");
 					daysOverMultiplying = input.nextInt();
 				}
 		FileWriter fw = new FileWriter("Population.txt");
		PrintWriter outFile = new PrintWriter(fw);

 				outFile.println("Here are the results:");
 				outFile.println("Days		Number Of Organism" );
 				outFile.println("------------------------------" );

 				int day = 0;

 				dailyPopulation = startingNumberOfOrganism;
 				percentIncrease = averageDailyPopulationIncrease/100;

 				for(int x = 1; x <= daysOverMultiplying; x++)
 				{
 					day++;
 					if(day > 1)
 					{
 						dailyPopulation += (percentIncrease * dailyPopulation);
 						outFile.println(day + "             " + formatter.format(dailyPopulation));
 					}
 					else
 					{
 						outFile.println(day + "             " + formatter.format(dailyPopulation));
 					}

 				}
 			outFile.close();
 			System.out.println("Report written to Population.txt.");


 		}

 }


 /*result
 What is the starting number of organisms? 10
 What is the average daily population increase?(provide integer number, ie 10 for %10): 20
 Population Increase will occur over how many days?10
 Report written to Population.txt.
 Press any key to continue . . .
*/