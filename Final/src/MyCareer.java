import java.util.*;

public class MyCareer
	{
		static String name;
		static String age;
		static String birthday; 
		static String height;
		static String weight;
		static String sportChoice;
		static int myOveral;
		static String basketballPosition;
		static String footballPosition;


		public static void main(String[] args)
			{
				
			    Database.sports();
				Database.color();
				Database.type();
				Database.eColor();
				Database.basketball();
				Database.football();
//				setName(); 
//				setAge();
	//			choseHairColor();
//			choseHairType();
	//			choseEyeColor();
//				setHeightWeight();
//				player();
				Database.playerOverall();
				overalls();
				Database.bTeam();
				Database.fTeam();
				choseSport();
				Database.myHouse();
				Database.myContract();
				contract();
				start();
				if(sportChoice.equals("1"))
				{
					playingB();
				}
				else 
				{
					playingFootball.playingFQ();
				}
				
				
				
			
			
		

			}
		public static void setName() 
			{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Welcome to my career!");
		System.out.println(" ");
		System.out.println("First lets get your name first and last please for your player");
		name = userInput.nextLine();
		System.out.println("Hello, " + name + "!");
		System.out.println(" ");
	
			}
		
		public static void setAge()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println(" lets get your players Age ");
			age = userInput.nextLine();
			Scanner userInput2= new Scanner(System.in);
			System.out.println(" Now lets get your  players birthday for example August 20, 1990");
			birthday = userInput2.nextLine();
			
		}
	
		
		public static void choseHairColor()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println("Now lets make your character!");
			System.out.println("lets start with hair color!");
			System.out.println("Here are your choices");
			System.out.println(" ");
			print(Database.hairColor);
			 String hairColor = userInput.nextLine();
		
			if (hairColor.equals("1"))
				{
					System.out.println(" ");
					System.out.println("Okay brown hair good choice !");
				}
				if (hairColor.equals("2"))
					{
						System.out.println(" ");
						System.out.println("Okay black hair good choice");
					}
					if (hairColor.equals("3"))
						{
							System.out.println(" ");
							System.out.println("Okay blonde hair good choice!");
						}
						if (hairColor.equals("4"))
							{
								System.out.println(" ");
								System.out.println("what color hair would you like");
								Scanner userInput2= new Scanner(System.in);
								String otherHairColor = userInput.nextLine();
								System.out.println(otherHairColor + " is a good choice");
							
							}
				System.out.println(" ");
		}
		
		
		public static void choseHairType()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println("Now that you have your hair color what about hair type");
			System.out.println("Here are your choices");
			print(Database.hairType);
			String hairType = userInput.nextLine();
			if (hairType.equals("1"))
			{
			System.out.println("Straight Hair! Good choice!");	
			}
			else if (hairType.equals ("2"))
				{
					System.out.println("Curly Hair! Good choice!");
				}
			else if (hairType.equals("3"))
						{
							System.out.println("Wavy Hair! good choice");
						}
			else if (hairType.equals("4"))
				{
					System.out.println(" Mohawk! Good choice!");
				}
			else if (hairType.equals("5"))
				{
					System.out.println("Bald! Good Choice");
				}
			else if (hairType.equals("6"))
				{
					System.out.println("Afro! Good choice ");
				}
	
	
			else if(hairType.equals("7"))
				{
					System.out.println(" ");
					System.out.println("What would you like your hair type to be ?");
					Scanner userInput2= new Scanner(System.in);
					String otherHairType = userInput.nextLine();
					System.out.println(otherHairType + "is a good choice");
				}
				
			System.out.println(" ");
		}
		
		
		public static void choseEyeColor()
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("Now for your eye color");
				System.out.println("Here are your Choices");
				print(Database.eyeColor);
				String eyeColor = userInput.nextLine();
				
				 if (eyeColor.equals("1"))
					{
						System.out.println("Brown eyes! Good choice");
					}
				else if (eyeColor.equals("2"))
					{
						System.out.println(" Blue eyes! Good choice");
					}
				else if (eyeColor.equals("3"))
					{
						System.out.println(" Green eyes! Good choice");
					}
				else 
					{
						Scanner userInput2= new Scanner(System.in);
						System.out.println("What would you like your eye color to be");
						String otherEyeColor = userInput.nextLine();
						System.out.println(otherEyeColor + " is good!");
					}
			}
		
		public static void setHeightWeight()
		{
			System.out.println("Now lets set your height and weight");
			Scanner userInput= new Scanner(System.in);
			System.out.println("Type your height below for example 5 10 ");
			height = userInput.nextLine();
			System.out.println(" ");
			Scanner userInput2= new Scanner(System.in);
			System.out.println("Type your weight below for example 150");
			weight = userInput2.nextLine();

		}
		
		public static void player()
		{
			System.out.println( "Here is your player ");
			System.out.println(" Your name is " + name);
			System.out.println(" you are " + height + " feet tall and you way " + weight + " pounds");
			System.out.println(" you are " + age + " years old and you were born on " + birthday );
			System.out.println(" ");
			
		}
	
		public static void overalls()
			{
				System.out.println("Now lets give your player an overall");
				System.out.println("You can set your overall all the way up to 99");
				
						System.out.println(" here is what you need to set");
						System.out.println(Database.overall);
						System.out.println(" ");
						
						Scanner userInput1= new Scanner(System.in);
						System.out.println(Database.overall.get(0) + "Type your speed below");
						int speed = userInput1.nextInt();
						System.out.println(" ");
						
						Scanner userInput2= new Scanner(System.in);
						System.out.println(Database.overall.get(1) + " Type your strength below");
						int strength = userInput2.nextInt();
						System.out.println(" ");
						
						Scanner userInput3= new Scanner(System.in);
						System.out.println(Database.overall.get(2) + " Type your jump below");
						int jump = userInput3.nextInt();
						System.out.println(" ");
						
						Scanner userInput4= new Scanner(System.in);
						System.out.println(Database.overall.get(3) + " Type your awareness below");
						int awareness = userInput4.nextInt();
						System.out.println(" ");
						
						Scanner userInput5= new Scanner(System.in);
						System.out.println(Database.overall.get(4) + " Type your agility below");
						int agility = userInput5.nextInt();
						System.out.println(" ");
						
						Scanner userInput6= new Scanner(System.in);
						System.out.println(Database.overall.get(5) + " Type your acceleration below");
						int acceleration = userInput6.nextInt();
						System.out.println(" ");
						
						Scanner userInput7= new Scanner(System.in);
						System.out.println(Database.overall.get(6) + " Type your elusiveness below");
						int elusiveness = userInput7.nextInt();
						System.out.println(" ");
						
						Scanner userInput8= new Scanner(System.in);
						System.out.println(Database.overall.get(7) + " Type your vision below");
						int vision = userInput8.nextInt();
						System.out.println(" ");
						
						
						myOveral = (( speed + strength + jump + awareness + agility + acceleration + elusiveness + vision));
						System.out.println(" your overal is " + (myOveral/8));
					}
		
		
		
		public static void choseSport()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println(" Now lets chose what sport you want to play");
			System.out.println(Database.sport);
			System.out.println(" ");
			sportChoice = userInput.nextLine();
			if (sportChoice.equals("1"))
						{
							Scanner userInput2= new Scanner(System.in);
							System.out.println("Basketball! Lets Get started");
							System.out.println("Now for your Position");
							System.out.println("Here are your choices");
							System.out.println(Database.positionB);
							basketballPosition = userInput2.nextLine();
							if ( basketballPosition.equals("1"))
								{
									System.out.println(" Point Guard! Good Choice!");
								}
							else if ( basketballPosition.equals("2"))
								{
									System.out.println(" Shooting Guard! Good Choice!");
								}
								else if ( basketballPosition.equals("3"))
									{
									System.out.println("Small Forward! Good Choice! ");	
									}
								else if ( basketballPosition.equals("4"))
									{
										System.out.println("Power Forward! Good choice!");
									}
								else 
									{
										System.out.println("Center! Good Choice!");
									}
							
							
							System.out.println(" Now lets get a team!");
							String draftB = (" With the "+ (int) (Math.random()* 15 +1) + " pick in the nba draft the " + Database.basketballTeam.get(1) + "select " + name);
							System.out.println(draftB);
						}
							
			
			
			
			else if (sportChoice.equals("2"))
				{
					Scanner userInput3= new Scanner(System.in);
					System.out.println("Football! Lets get started");
					System.out.println("Now for your Position");
					System.out.println("Here are your choices");
					System.out.println(Database.positionF);
					 footballPosition = userInput3.nextLine();
					if ( footballPosition.equals("1"))
						{
							System.out.println("Quaterback! Good choice!");
						}
					else if ( footballPosition.equals("2"))
						{
							System.out.println("Running Back! Good choice!");
						}
					else if ( footballPosition.equals("3"))
						{
							System.out.println("Wide Reciever! Good choice!");
						}
					else if ( footballPosition.equals("4"))
						{
							System.out.println("Tight End! Good choice!");
						}
					else if ( footballPosition.equals("5"))
						{
							System.out.println("Corner Back! Good choice!");
						}
					else if ( footballPosition.equals("6"))
						{
							System.out.println("Linebacker! Good choice!");
						}
					else if (footballPosition.equals("7"))
						{
							System.out.println("Defensive Tackle! Good choice!");
						}
					else if (footballPosition.equals("8"))
						{
							System.out.println("Defensive End! Good choice!");
						}
					else 
						{
							System.out.println("Saftey! Good choice!");
						}
					
					System.out.println(" Now lets Get a Team!");
					String draftF = (" With the "+  Math.random()* 8 +1 + " pick in the nfl draft the " + Database.footballTeam.get(1) + "select " + name);
					System.out.println(draftF);
							
						
				}
			
					
		}
		public static void contract()
		{
			Scanner userInput1= new Scanner(System.in);
			System.out.println("now for your contract the team that slelected you offers you");
			System.out.println(Database.contract.get(2));
			System.out.println(" do you 1.accept or 2.decline");
			String contracts = userInput1.nextLine();
			if (contracts.equals ("1"))
			{
				System.out.println("Congrats!");
			}
			else
			{
				Scanner userInput2= new Scanner(System.in);
				System.out.println(" okay now they offer you");
				System.out.println(Database.contract.get(1));
				System.out.println(" do you 1. accept 2. get the first comtract");
				String contracts1 = userInput1.nextLine();
				if (contracts1.equals("1"))
				{
					System.out.println("Congrats!");
				}
				else
				{
					System.out.println(Database.contract.get(2));
					System.out.println("That is your contract congrats!");
				}
				
			}
		}

		
		public static void start()
		{
			Scanner userInput1= new Scanner(System.in);
				System.out.println(" Now you get to pick out your house here are your choices");
				System.out.println(Database.house);
				String house = userInput1.nextLine();
				if(house.equals("1"))
				{
					System.out.println("You have bought a mansion in your home town");
				}
				else if (house.equals("2"))
				{
					System.out.println(" you have bought a penthouse in your home town");
				}
				else if (house.equals("3"))
				{
					System.out.println(" you have bought an apartment in your home town");
				}
				else 
				{
					System.out.println(" you have bought a condo in your home town");
				}
			}
		
		public static void playingB()
		{
			
			if (sportChoice.equals("1"))
				System.out.println(" Now for you playing time");
				System.out.println(" its your first game you get in with a couple seconds left in the game your tied the ball comes to you  you shoot and you make it");
					Scanner userInput1= new Scanner(System.in);
					System.out.println(" you coach asks you to go to a camp you respond");
					System.out.println("1.why im already the best");
					System.out.println("2.Yes sir");
					String camp = userInput1.nextLine();
					if (camp.equals("1"))
					{
						Scanner userInput3= new Scanner(System.in);
						System.out.println(" Your coach benches you");
						System.out.println("its the stars game you have been selected for reserves");
						System.out.println(" your in the game you can either");
						System.out.println("1.PLay selfish ball");
						System.out.println("2.play conservative ball");
						String starsGame = userInput3.nextLine();
						if (starsGame.equals("1"))
						{
							System.out.println(" you have a okay game with 12 points 7 rebounds and 8 assists");
							Scanner userInput4= new Scanner(System.in);
							System.out.println(" after the game you go to a press confrence and they ask you what you will do to imporve");
							System.out.println(" you respond");
							System.out.println("1. Nothing");
							System.out.println("2.everything I can");
							String response = userInput4.nextLine();
							if (response.equals("1"))
							{
								System.out.println(" you have a great carrer that lasts 15 years");
							}
							else 
							{
								System.out.println(" you become an great player and your jersey is retires");
							}
							
						}
						else if (starsGame.equals("2"))
						{
							System.out.println(" you have a great game with 17 points 7 rebounds and 8 assists");
							Scanner userInput6= new Scanner(System.in);
							System.out.println(" after the game you go to a press confrence and they ask you what you will do to imporve");
							System.out.println(" you respond");
							System.out.println("1. Nothing");
							System.out.println("2.everything I can");
							String response1 = userInput6.nextLine();
							if (response1.equals("1"))
							{
								System.out.println(" you have a great carrer and your jersey is retired");
							}
							else 
							{
								System.out.println(" you become an amazing player, you are inducted into the hall of fame and break the all time scoring record ");
							}
							
						}
					
					}

					
						else if (camp.equals("2"))
						{
							Scanner userInput7= new Scanner(System.in);
							System.out.println(" your a starter" );
							System.out.println("its the stars game you have been selected for starter");
							System.out.println(" your in the game you can either");
							System.out.println("1.PLay selfish ball");
							System.out.println("2.play conservative ball");
							String starsGame1 = userInput7.nextLine();
							if (starsGame1.equals("1"))
							{
								System.out.println(" you have a great game with 20 points 7 rebounds and 6 assists");
								Scanner userInput8= new Scanner(System.in);
								System.out.println(" after the game you go to a press confrence and they ask you what you will do to imporve");
								System.out.println(" you respond");
								System.out.println("1. Nothing");
								System.out.println("2.everything I can");
								String response1 = userInput8.nextLine();
								if (response1.equals("1"))
								{
									System.out.println(" you have a great carrer and your jersey is retired");
								}
								else 
								{
									System.out.println(" you become an amazing player, you are inducted into the hall of fame and break the all time scoring record ");
								}
								
							}
							if (starsGame1.equals("2"))
							{
								System.out.println(" you have a great game with 30 points 7 rebounds and 8 assists your the MVP");
								Scanner userInput9= new Scanner(System.in);
								System.out.println(" after the game you go to a press confrence and they ask you what you will do to imporve");
								System.out.println(" you respond");
								System.out.println("1. Nothing");
								System.out.println("2.everything I can");
								String response2 = userInput9.nextLine();
								if (response2.equals("1"))
								{
									System.out.println(" you have a great carrer and your jersey is retired and your a 3 time all star");
								}
								else 
								{
									System.out.println(" you become an amazing player, you are inducted into the hall of fame, your jersey is retired, your an 10 time all star and break the all time scoring record ");
								}
								
							}
					
						}
			}

		public static void print(ArrayList<String> y)
		{
			for (int i = 0; i < y.size(); i++)
			{
				System.out.println(y.get(i));
			}
			System.out.println();
		}
		
		}
