/*

 * Class: CMSC203  CRN 31569

 * Instructor:Ahmed Tarek

 * Description: (Give a brief description for each Class): Its a program that diagnoses and 

 * Due: 02/07/23

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Ruth Ferez

*/

package A1;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {

		
				Scanner ruth=new Scanner(System.in);
				
				String choice;
				
				
				System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
				
					System.out.println("First step: reboot your computer\n"
							+ "Are you able to connect with the internet? (yes or no) ");
					choice= ruth.nextLine();
					
					while (!choice.contains("yes") && !choice.contains("no"))
					{
						System.out.println(" Enter either yes/no answer only");	
						System.out.println("Are you able to connect with the internet?");
						choice= ruth.nextLine();	
					}	
					
				if (choice.contains("no"))
				
					{
					
					System.out.println(" reboot your router\n"
					
						+ "Now are you able to connect with the internet? (yes or no)");
					
			
				choice= ruth.nextLine();
				
				while (!choice.contains("yes") && !choice.contains("no"))
				{
					System.out.println(" Enter either yes/no answer only");	
					System.out.println("Are you able to connect with the internet?");
					choice= ruth.nextLine();	
				}
				
					
				if(choice.contains("no"))
					
					
					System.out.println("Second step: reboot your router\n"
					
							+ "Now are you able to connect with the internet? (yes or no)");

					
				
				else if (choice.contains("yes"))
				{
					System.out.println("Rebooting your router seems to work");
				System.exit(0);
				}
					choice= ruth.nextLine();
					
					while (!choice.contains("yes") && !choice.contains("no"))
					{
						System.out.println(" Enter either yes/no answer only");	
						System.out.println("Are you able to connect with the internet?");
						choice= ruth.nextLine();	
					}
					
					
				if(choice.contains("no"))
					
					System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n"
							+ "Now are you able to connect with the internet? (yes or no) ");
				else  if (choice.contains("yes"))
				{
					System.out.println("Reeboting your router seems to work");
					System.exit(0);
				}
				
				choice= ruth.nextLine();
				
				while (!choice.contains("yes") && !choice.contains("no"))
				{
					System.out.println(" Enter either yes/no answer only");	
					System.out.println("Are you able to connect with the internet?");
					choice= ruth.nextLine();	
				}
				
				if (choice.contains("no"))
					
				
					System.out.println("Fourth step: move your computer closer to your router\n"
							+ "Now are you able to connect with the internet? (yes or no)");
				
				else  if (choice.contains("yes"))
				{
					
					System.out.println("Checking the router's cables seemed to work");
					System.exit(0);
					
				}
					
				
				choice= ruth.nextLine();
				
				while (!choice.contains("yes") && !choice.contains("no"))
				{
					System.out.println(" Enter either yes/no answer only");	
					System.out.println("Are you able to connect with the internet?");
					choice= ruth.nextLine();	
				}
				
				
				if (choice.contains("no"))
					
					System.out.println("Fifth step: contact your ISP\n"
							+ "Make sure your ISP is hooked up to your router.");
				else  if (choice.contains("yes"))
					System.out.println("Moving your computer closer to the router seems to work");
				    System.exit(0);
					}
				
			
				else  if (choice.contains("yes"))
				{
					System.out.println("Rebooting your router seems to work");
					System.exit(0);	
				}
					}		
				
					
	}

		

	

