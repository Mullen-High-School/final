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
				System.out.println("It's your chance to show your coach what you can do");
				System.out.println("It's the first play of the game you drop back and");
				System.out.println("1.Throw deep");
				System.out.println("2.Throw short");
				String firstPlay = userInput.nextLine();
				if (firstPlay.equals("1"))
				{
					Scanner userInput1= new Scanner(System.in);
					System.out.println(" You complete the pass and you win the game you pass for 300 yards");
					System.out.println(" After the game your coach aproches you and asks makes you a starter you respond");
					System.out.println("1.Thanks coach I apreciate it  ");
					System.out.println("2.I figured");
					String starter = userInput1.nextLine();
					if (starter.equals("1"))
					{
						Scanner userInput3= new Scanner(System.in);
						System.out.println(" You become one of the best players in the leauge win rookie of the year and get sleected for Pro Bowl");
						System.out.println(" You made it to the pro bowl you start the game and you have an amazing game you throw for 300 yards and have a 72 percent completion rate");
						System.out.println(" After the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.everything I can");
						String response = userInput3.nextLine();
						if(response.equals("1"))
						{
							System.out.println(" You become a great player and get inducted into the hall of fame");
						}
						else 
						{
							System.out.println(" You become one of the best players break the all time passing record and getinducted into the hall of fame");
						}
					}
					else 
					{
						Scanner userInput4= new Scanner(System.in);
						System.out.println(" You become a good player and get selected to Pro Bowl");
						System.out.println(" You made it to the pro Bowl and you have a good game you throw for 150 yeards and have a 45 percent completion rate ");
						System.out.println(" After the game the press apraches you and ask you what your going to do to imporve you respond");
						System.out.println("1. Nothing");
						System.out.println("2. Everything I can");
						String response1 = userInput4.nextLine();
						if (response1.equals("1"))
						{
							System.out.println(" You beocme a good player and make the pro bowl a couple more times");
						}
						else 
						{
							System.out.println(" You become a great player and get slecetd to the prow bowl for half the time your in the NFL");
						}
						
						
					}
				}
				else
				{
					Scanner userInput3= new Scanner(System.in);
					System.out.println("You complete the pass and you win the game but you have a medicore performance");
					System.out.println(" After the game the coach aproaches you abd asks you to go to a camp to get better");
					System.out.println(" You repsond");
					System.out.println("1.Why im already the best");
					System.out.println("2.Yes sir");
					String camp = userInput3.nextLine();
					if (camp.equals("1"))
					{
						Scanner userInput5= new Scanner(System.in);
						System.out.println(" You stay second string untill starter gets hurt again then you get selected to Pro Bowl for a rookie");
						System.out.println(" You made it to the pro bowl you start the game and you have a okay game you throw for 100 yards and have a 72 percent completion rate");
						System.out.println(" After the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.Everything I can");
						String response2 = userInput5.nextLine();
						if(response2.equals("1"))
						{
							System.out.println(" You are a second string player for the rest of your carrer");
						}
						else 
						{
							System.out.println(" You become a good player and a starter a couple of years later");
						}
						
					}
					else
					{
						Scanner userInput6= new Scanner(System.in);
						System.out.println(" You get better and start by the end of the season and get selected to the Pro Bowl");
						System.out.println(" You made it to the pro bowl you start the game and you have an amazing game you throw for 200 yards and have a 72 percent completion rate");
						System.out.println(" After the Pro Bowl the press apraoches you and asks you what you will do to improve you respond");
						System.out.println("1.Nothing");
						System.out.println("2.Everything I can");
						String response3 = userInput6.nextLine();
						if (response3.equals("1"))
						{
							System.out.println(" You become a good player and stay a solid starter for the rest of your carrer");
						}
						else 
						{
							System.out.println(" You improve and get sleceted to the pro bowl every year of your carrer");
						}
					}
				}
			}
			
			else if (MyCareer.footballPosition.equals("2"))
			{
				Scanner userInput7= new Scanner(System.in);
				System.out.println(" It's yor first game in the NFL ");
				System.out.println(" The quaterback snaps the ball and you run");
				System.out.println(" A defensive player comes to hit you what do you do");
				System.out.println("1.Truck the player");
				System.out.println("2.Juke the player");
				String jukeTruck = userInput7.nextLine();
				if(jukeTruck.equals("1"))
				{
					Scanner userInput8= new Scanner(System.in);
					System.out.println(" You truck the player and go for a touchdown");
					System.out.println("After the game the coach congratulates you and asks you to go to a camp");
					System.out.println(" You respond");
					System.out.println("1.Of course coach");
					System.out.println("2.Why?");
					String camp= userInput8.nextLine();
					if(camp.equals("1"))
					{
						Scanner userInput10= new Scanner(System.in);
						System.out.println("You have a pretty good season and get selcted for pro bowl reserves");
						System.out.println("It's finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println("After the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.Everyting I can to make my game better");
						String response= userInput10.nextLine();
						if(response.equals("1"))
						{
							System.out.println("You have an okay carrer that lasts 6 years");
						}
						else 
						{
							System.out.println("You have a oretty good carrer and get selcted for the pro bowl a couple more times");
						}
					}
					else 
					{
						Scanner userInput11= new Scanner(System.in);
						System.out.println("You have an amazing season and win rookie of the year");
						System.out.println("It's finally the pro bowl and you have a great game and rush for 200 yeards and 2 touchdowns");
						System.out.println("It's finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println("After the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.Everyting I can to make my game better");
						String response1= userInput11.nextLine();
						if(response1.equals("1"))
						{
							System.out.println(" You have a pretty good carrer and you get selcted to the pro bowl a couple more times");
						}
						else 
						{
							System.out.println(" You have an amazing carrer, get inducted into the  hall of fame and beocme one of the best ever");
						}
					}
				}
				else
				{
					Scanner userInput9= new Scanner(System.in);
					System.out.println(" You juke the player and go for a touchdown");
					System.out.println(" After the game the coach congratulates you and asks you to go to a camp");
					System.out.println(" You respond");
					System.out.println("1.Of course coach");
					System.out.println("2.Why?");
					String camp2= userInput9.nextLine();
					if (camp2.equals("1"))
					{
						Scanner userInput12= new Scanner(System.in);
						System.out.println(" You have a pretty good season and get selcted for pro bowl reserves");
						System.out.println(" You have an okay game and rush for 50 yeards and 1 touchdown");
						System.out.println(" It's finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println(" After the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.Everyting I can to make my game better");
						String response2= userInput12.nextLine();
						if(response2.equals("1"))
						{
							System.out.println(" You have a bad carrer that lasts only a couple of years then you become a secind string");
						}
						else 
						{
							System.out.println(" You have a mediocre carrer that lasts 10 years ");
						}
					}
					else 
					{
						Scanner userInput13= new Scanner(System.in);
						System.out.println(" You have an amazing season and win rookie of the year");
						System.out.println("It's finally the pro bowl and you have a great game you rush for 300 yeards and 3 touchdowns");
						System.out.println("It's finally the pro bowl and you have a preety good game 75 yards rusing and 1 touchdown");
						System.out.println("After the game the press aproaches you and asks you what you will do to improve");
						System.out.println("1.I dont need to do anything");
						System.out.println("2.Everyting I can to make my game better");
						String response3= userInput13.nextLine();
						if(response3.equals("1"))
						{
							System.out.println(" You have a good carrer get selcted to the pro bowl a few more times, and get your jersey retired with your team");
						}
						else 
						{
							System.out.println(" You become the greatest of all time shatter veery record and get inducted into the hall of fame");
						}
					}
				}
				
			}
			
			else if (MyCareer.footballPosition.equals("3") || MyCareer.footballPosition.equals("4"))
			{
				Scanner userInput14= new Scanner(System.in);
				System.out.println("It's your first game with a couple seconds left ");
				System.out.println(" The quaterback drops back and throws deep");
				System.out.println("It's coming towards you and another reciver");
				System.out.println("You can either ");
				System.out.println("1.Be agressive and go for the catch");
				System.out.println("2.Block for the other reciver");
				String firstPlay= userInput14.nextLine();
				if(firstPlay.equals("1"))
				{
					Scanner userInput15= new Scanner(System.in);
					System.out.println(" you go up and catch the ball for a touchdown");
					System.out.println(" the coach congratulates you and makes you a starter for the rest of the year");
					System.out.println(" your first season is great and you end up being selcted for pro bowl");
					System.out.println(" you get into the game finally and you");
					System.out.println("1.play conservative");
					System.out.println("2.play agressive");
					String pro = userInput14.nextLine();
					if(pro.equals("1"))
					{
						Scanner userInput17= new Scanner(System.in);
						System.out.println(" you have an okay game with 150 yards receiving");
						System.out.println(" after the game the press aproaches you to ask you some questions and you respond");
						System.out.println("1. I dont have time to answer your questions");
						System.out.println("2. Sure I have the time");
						String press = userInput17.nextLine();
						if(press.equals("1"))
						{
							System.out.println(" you have a pretty good carrer but never make it far ");
						}
						else 
						{
							System.out.println(" you have a bright carrer and end up being selcted to the Pro Bowl a couple of times");
						}
						
					}
					else
					{
						Scanner userInput18= new Scanner(System.in);
						System.out.println(" you have the best game of your life you have 250 yards reciving and 2 touchdowns");
						System.out.println("after the game the press aproaches you and asks you how you are going to imporve you answer");
						System.out.println("1.I dont really need to improve");
						System.out.println("2.As much as I can");
						String press2 = userInput18.nextLine();
						if(press2.equals("1"))
						{
							System.out.println(" you have an amazing carrer and your jersey is retired");
						}
						else
						{
							System.out.println(" you become one of the greatest of all time and get indcted into the hall of fame");
						}
					}
					
				}
				else 
				{
					Scanner userInput16= new Scanner(System.in);
					System.out.println("you miss the block and the other reciver misses the catch you loose the game");
					System.out.println(" your coach is furious and ends up making you the flex player");
					System.out.println(" your first season is okay but you dont make the pro bowl");
					System.out.println("you are furious and the press comes to you you say");
					System.out.println("1. I cant belive I didnt make it this thing is rigged");
					System.out.println("2. this isnt fair I play better than all of those other guys");
					String mad = userInput16.nextLine();
					if(mad.equals("1"))
					{
						Scanner userInput19= new Scanner(System.in);
						System.out.println("You get on the cover of a magazine that explains why you think its rigged");
						System.out.println(" you gain a lot of publicity and end up being second string for the rest of your carrer");
						System.out.println(" you can either ");
						System.out.println("1.Retire");
						System.out.println("2. stay a second string till you feel like your done");
						String retire = userInput19.nextLine();
						if(retire.equals("1"))
						{
							System.out.println(" you end up writing a book about how you should of handled the nfl and becone famous that way ");
						}
						else
						{
							System.out.println(" you have a dissapointing carrer that lasts 5 years");
						}
					}
					else 
					{
						Scanner userInput20= new Scanner(System.in);
						System.out.println(" you get deemed the biggest cry baby in the game of football");
						System.out.println(" you get a lot of attention and end up being cut from your team");
						System.out.println("you can either");
						System.out.println(" 1. go to the combine the next year");
						System.out.println("2. decide to never play football agian");
						String cut = userInput20.nextLine();
						if (cut.equals("1"))
						{
							System.out.println(" you end up making a team and become their flex player for 4 years untill you retire");
						}
						else 
						{
							System.out.println(" no one ever hears from you again");
						}
					}
				}
			}
			
			else 
			{
				Scanner userInput21= new Scanner(System.in);
				System.out.println(" its your first game already you have a couple of tackles");
				System.out.println(" there are couple seocnds left in the game the quearterback drops back");
				System.out.println(" you either");
				System.out.println("1. go cover a wide out");
				System.out.println("2.rush the quaterback");
				String defense = userInput21.nextLine();
				if(defense.equals("1"))
				{
					Scanner userInput22= new Scanner(System.in);
					System.out.println(" they throw deep and you get outrun by the wide reciver and they score you loose the game");
					System.out.println("after the game the coach aproaches you and tell you to go to a camp to get better you respond");
					System.out.println("1.whatever");
					System.out.println("2.Yes sir");
					String camp= userInput22.nextLine();
					if(camp.equals("1"))
					{
						Scanner userInput24= new Scanner(System.in);
						System.out.println(" you dont get any better and dont make the Pro Bowl");
						System.out.println(" the press aproaches you and asks you what you think about not making the pro bowl you respond");
						System.out.println("1.I cant beleive it");
						System.out.println("2.I know I should have made it");
						String press= userInput22.nextLine();
						if(press.equals("1"))
						{
							System.out.println("You end up getting a lot of publicity over the offseaosn and eventually get cut");
						}
						else
						{
							System.out.println("You end up getting a lot of publicity over the offseaosn and eventually get cut");
						}
					}
					else 
					{
						Scanner userInput25= new Scanner(System.in);
						System.out.println("you become much better and are selcted for pro bowl");
						System.out.println(" its the pro bowl and you are starting the quaterback drops deep and throws to the reciver your convering");
						System.out.println(" you can either");
						System.out.println("1.Go for the ball");
						System.out.println("2.Tackle the reciever");
						String proBowl= userInput25.nextLine();
						if(proBowl.equals("1"))
						{
							Scanner userInput27= new Scanner(System.in);
							System.out.println(" you intercept it and run it back for the touchdown");
							System.out.println(" you finish the day of strog with 5 tackles 2 sacks and 1 interception");
							System.out.println(" after the game the press aproaches you and asks you what you will do to improve");
							System.out.println("you respond");
							System.out.println("1.Nothing");
							System.out.println("2.As much as possible");
							String response = userInput27.nextLine();
							if(response.equals("1"))
							{
								System.out.println(" you have a very succsessful carrer and are selected to the pro bowl a few more times");
							}
							else 
							{
								System.out.println(" you have an amazing carrer and become one of the best at your position. You later get inducted into the hall of fame");
							}
						}
						else 
						{
							Scanner userInput28= new Scanner(System.in);
							System.out.println(" You make the tackle and he drops the ball");
							System.out.println("You have a great preformance with 7 tackles and 2 sacks");
							System.out.println("After the game the press aproaches you and asks you what you will do to improve");
							System.out.println("You respond");
							System.out.println("1.Nothing");
							System.out.println("2.As much as possible");
							String response2 = userInput28.nextLine();
							if(response2.equals("1"))
							{
								System.out.println("you have an okay carrer that lasts 10 years");
							}
							else 
							{
								System.out.println(" you have a great carrer and get your jersey reitred");
							}
						}
					}
				}
				else
				{
					Scanner userInput23= new Scanner(System.in);
					System.out.println(" You sack the quaterback and win the game");
					System.out.println("After the game the coach congratulates you and wants to make you a starter");
					System.out.println("You respond");
					System.out.println(" 1.Im honored but im going to try and get better before you start me");
					System.out.println("2. Finally!");
					String starter = userInput23.nextLine();
					if(starter.equals("1"))
					{
						Scanner userInput26= new Scanner(System.in);
						System.out.println(" You improve and end up starting full time by end of season");
						System.out.println("You have an amazing rookie season and end up being selected to the pro bowl");
						System.out.println("It;s the pro bowl and you are starting the quaterback drops deep and throws to the reciver your convering");
						System.out.println("You can either");
						System.out.println("1.Go for the ball");
						System.out.println("2.Tackle the reciever");
						String proBowl2= userInput26.nextLine();
						if(proBowl2.equals("1"))
						{
							Scanner userInput29= new Scanner(System.in);
							System.out.println(" You intercept it and run it back for the touchdown");
							System.out.println(" You finish the day of strog with 5 tackles 2 sacks and 1 interception");
							System.out.println("After the game the press aproaches you and asks you what you will do to improve");
							System.out.println("you respond");
							System.out.println("1.Nothing");
							System.out.println("2.As much as possible");
							String response3 = userInput29.nextLine();
							if(response3.equals("1"))
							{
								System.out.println("You have a good carrer that lasts 15 years");
							}
							else
							{
								System.out.println("You have an amaizng carrer and get inducted into the hall of fame");
							}
						}
						else 
						{
							Scanner userInput30= new Scanner(System.in);
							System.out.println("You make the tackle and he drops the ball");
							System.out.println("You have a great preformance with 7 tackles and 2 sacks");
							System.out.println("After the game the press aproaches you and asks you what you will do to improve");
							System.out.println("You respond");
							System.out.println("1.Nothing");
							System.out.println("2.As much as possible");
							String response4= userInput30.nextLine();
							if(response4.equals("1"))
							{
								System.out.println("You have a good carrer that lasts 10 years ");
							}
							else 
							{
								System.out.println(" You have a long carrer and get selected to the pro bowl a few more times");
							}
						}
						
					}
					else 
					{
						System.out.println(" You get hurt in the next game tear your ACL and are out for the season");
						System.out.println(" You make the recovery but are never the same");
						System.out.println("You have a semi sucsessful carrer but are very injury prone");
					
					}
				}
			}
		
	}
}
	


	
