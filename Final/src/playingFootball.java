import java.util.Scanner;

public class playingFootball 
{
	public static void playingFQ()		

	{
		
		
	if (MyCareer.sportChoice.equals("2"))
			System.out.println(" Now for you playing time");
			if (MyCareer.footballPosition.equals("1"))
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("The first string quaterback gets hurt");
				System.out.println(" its your chance to show your coach what you can do");
				System.out.println(" its the first play of the game you drop back and");
				System.out.println("1.Throw deep");
				System.out.println("2.Throw short");
				String firstPlay = userInput.nextLine();
				if (firstPlay.equals("1"))
				{
					Scanner userInput1= new Scanner(System.in);
					System.out.println(" you complete the pass and you win the game you pass for 300 yards");
					System.out.println(" after the game your coach aproches you and asks makes you a starter you respond");
					System.out.println("1. Thanks coach I apreciate it  ");
					System.out.println("2. I figured");
					String starter = userInput1.nextLine();
					if (starter.equals("1"))
					{
						Scanner userInput3= new Scanner(System.in);
						System.out.println(" you become one of the best players in the leauge win rookie of the year and get sleected for Pro Bowl");
						System.out.println(" you made it to the pro bowl you start the game and you have an amazing game you throw for 300 yards and have a 72 percent completion rate");
						System.out.println(" after the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.everything I can");
						String response = userInput3.nextLine();
						if(response.equals("1"))
						{
							System.out.println(" you become a great player and get inducted into the hall of fame");
						}
						else 
						{
							System.out.println(" you become one of the best players break the all time passing record and getinducted into the hall of fame");
						}
					}
					else 
					{
						Scanner userInput4= new Scanner(System.in);
						System.out.println(" you become a good player and get selected to Pro Bowl");
						System.out.println(" you made it to the pro Bowl and you have a good game you throw for 150 yeards and have a 45 percent completion rate ");
						System.out.println(" after the game the press apraches you and ask you what your going to do to imporve you respond");
						System.out.println("1. Nothing");
						System.out.println("2. everything I can");
						String response1 = userInput4.nextLine();
						if (response1.equals("1"))
						{
							System.out.println(" You beocme a good player and make the pro bowl a couple more times");
						}
						else 
						{
							System.out.println(" you become a great player and get slecetd to the prow bowl for half the time your in the NFL");
						}
						
						
					}
				}
				else
				{
					Scanner userInput3= new Scanner(System.in);
					System.out.println("You complete the pass and you win the game but you have a medicore performance");
					System.out.println(" after the game the coach aproaches you abd asks you to go to a camp to get better");
					System.out.println(" you repsond");
					System.out.println("1.why im already the best");
					System.out.println("2. Yes sir");
					String camp = userInput3.nextLine();
					if (camp.equals("1"))
					{
						Scanner userInput5= new Scanner(System.in);
						System.out.println(" you stay second string untill starter gets hurt again then you get selected to Pro Bowl for a rookie");
						System.out.println(" you made it to the pro bowl you start the game and you have a okay game you throw for 100 yards and have a 72 percent completion rate");
						System.out.println(" after the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.everything I can");
						String response2 = userInput5.nextLine();
						if(response2.equals("1"))
						{
							System.out.println(" you are a second string player for the rest of your carrer");
						}
						else 
						{
							System.out.println(" you become a good player and a starter a couple of years later");
						}
						
					}
					else
					{
						Scanner userInput6= new Scanner(System.in);
						System.out.println(" you get better and start by the end of the season and get selected to the Pro Bowl");
						System.out.println(" you made it to the pro bowl you start the game and you have an amazing game you throw for 200 yards and have a 72 percent completion rate");
						System.out.println(" after the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.everything I can");
						String response3 = userInput6.nextLine();
						if (response3.equals("1"))
						{
							System.out.println(" you become a good player and stay a solid starter for the rest of your carrer");
						}
						else 
						{
							System.out.println(" you improve and get sleceted to the pro bowl every year of your carrer");
						}
					}
				}
			}
			
			else if (MyCareer.footballPosition.equals("2"))
			{
				Scanner userInput7= new Scanner(System.in);
				System.out.println(" its yor first game in the NFL ");
				System.out.println(" the quaterback snaps the ball and you run");
				System.out.println(" a defensive player ocmes to hit you what do you do");
				System.out.println("1.truck the player");
				System.out.println("2.juke the player");
				String jukeTruck = userInput7.nextLine();
				if(jukeTruck.equals("1"))
				{
					Scanner userInput8= new Scanner(System.in);
					System.out.println(" you truck the player and go for a touchdown");
					System.out.println(" after the game the coach congratulates you and asks you to go to a camp");
					System.out.println(" you respond");
					System.out.println("1. of course coach");
					System.out.println("2.why?");
					String camp= userInput8.nextLine();
					if(camp.equals("1"))
					{
						Scanner userInput10= new Scanner(System.in);
						System.out.println("you have a pretty good season and get selcted for pro bowl reserves");
						System.out.println(" its finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println(" after the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.everyting I can to make my game better");
						String response= userInput10.nextLine();
						if(response.equals("1"))
						{
							System.out.println(" you have an okay carrer that lasts 6 years");
						}
						else 
						{
							System.out.println(" you have a oretty good carrer and get selcted for the pro bowl a couple more times");
						}
					}
					else 
					{
						Scanner userInput11= new Scanner(System.in);
						System.out.println("you have an amazing season and win rookie of the year");
						System.out.println("its finally the pro bowl and you have a great game and rush for 200 yeards and 2 touchdowns");
						System.out.println(" its finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println(" after the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.everyting I can to make my game better");
						String response1= userInput11.nextLine();
						if(response1.equals("1"))
						{
							System.out.println(" you have a pretty good carrer and you get selcted to the pro bowl a couple more times");
						}
						else 
						{
							System.out.println(" you have an amazing carrer, get inducted into the  hall of fame and beocme one of the best ever");
						}
					}
				}
				else
				{
					Scanner userInput9= new Scanner(System.in);
					System.out.println(" you juke the player and go for a touchdown");
					System.out.println(" after the game the coach congratulates you and asks you to go to a camp");
					System.out.println(" you respond");
					System.out.println("1. of course coach");
					System.out.println("2.why?");
					String camp2= userInput9.nextLine();
					if (camp2.equals("1"))
					{
						Scanner userInput12= new Scanner(System.in);
						System.out.println(" you have a pretty good season and get selcted for pro bowl reserves");
						System.out.println(" you have an okay game and rush for 50 yeards and 1 touchdown");
						System.out.println(" its finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println(" after the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.everyting I can to make my game better");
						String response2= userInput12.nextLine();
						if(response2.equals("1"))
						{
							System.out.println(" you have a bad carrer that lasts only a couple of years then you become a secind string");
						}
						else 
						{
							System.out.println(" you have a mediocre carrer that lasts 10 years ");
						}
					}
					else 
					{
						Scanner userInput13= new Scanner(System.in);
						System.out.println(" you have an amazing season and win rookie of the year");
						System.out.println("its finally the pro bowl and you have a great game you rush for 300 yeards and 3 touchdowns");
						System.out.println(" its finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println(" after the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.everyting I can to make my game better");
						String response3= userInput13.nextLine();
						if(response3.equals("1"))
						{
							System.out.println(" you have a good carrer get selcted to the pro bowl a few more times, and get your jersey retired with your team");
						}
						else 
						{
							System.out.println(" you become the greatest of all time shatter veery record and get inducted into the hall of fame");
						}
					}
				}
				
			}
			
			else if (MyCareer.footballPosition.equals("3") || MyCareer.footballPosition.equals("4"))
			{
				System.out.println("its your first game ");
				System.out.println(" the quaterback drops back and throws deep");
				System.out.println(" it coming to");
			}
			
			else 
			{
				
			}
		
	}
}
	


	
