import java.util.Scanner;

public class MyCareer
	{
		static String name;
		static String age;
		static String birthday; 
	
		static String height;
		static String weight;
		static String basketballPosition;
		static String footballPosition;
		static String baseballPosition;

		public static void main(String[] args)
			{
				Database.sports();
				Database.color();
				Database.type();
				Database.eColor();
				Database.basketball();
				Database.football();
				Database.baseball();
				setName(); 
				setAge();
				choseHairColor();
				choseHairType();
				choseEyeColor();
				setHeightWeight();
				player();
				Database.playerOverall();
				overalls();
				Database.bTeam();
				Database.fTeam();
				Database.bbTeam();
				choseSport();
				
				
			
			
		

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
			System.out.println(" Now lets get your players Age ");
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
			System.out.println(Database.hairColor);
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
			System.out.println(Database.hairType);
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
	
	
			else if (hairType.equals("7"))
				{
					System.out.println(" ");
					System.out.println(" what would you like your hair type to be ?");
					Scanner userInput2= new Scanner(System.in);
					String otherHairType = userInput.nextLine();
					System.out.println(otherHairType + "is a good choice");
				}
				else
					{
						System.out.println(" ");
						System.out.println("good choice ");
						
					}
			System.out.println(" ");
		}
		
		
		public static void choseEyeColor()
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("now for your eye color");
				System.out.println("Here are your Choices");
				System.out.println(Database.eyeColor);
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
						System.out.println(" waht would you like your eye color to be");
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
			System.out.println( " Here is your player ");
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
						
						
						System.out.println(" your overall is " + ( speed + strength + jump + awareness + agility + acceleration + elusiveness + vision)/ 8);
					}
		
		
		
		public static void choseSport()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println(" Now lets chose what sport you want to play");
			System.out.println(Database.sport);
			System.out.println(" ");
			String sportChoice = userInput.nextLine();
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
							String draftB = (" With the "+  Math.random()* 8 +1 + " pick in the nba draft the " + Database.basketballTeam.get(1) + "select " + name);
							System.out.println(draftB);
							
							
							
							
							
							
							
							
							
							//carrer
							
							Scanner userInput5= new Scanner(System.in);
							System.out.println(" now for the rest of your carrer");
							System.out.println(" your coach asks you to go to camp what do you do");
							System.out.println(" 1. go to the camp ");
							System.out.println("2. tell your coach your going to the camp but dont");
							System.out.println(" 3. tell your coach you dont want to go");
							System.out.println("4. walk out");
							String camp = userInput5.nextLine();
							if (camp.equals("1"))
								{
									Scanner userInput7= new Scanner(System.in);
									System.out.println(" your coach makes you a starter");
									System.out.println(" you start off the game and the first thing you do is touch the ball");
									System.out.println(" you can either");
									System.out.println("1. dribble to the hoop and score");
									System.out.println("2. pass the ball");
									System.out.println("3. dribble to midcourt and start the play");
									String starterGame = userInput7.nextLine();
									if (starterGame.equals("1"))
										{
											System.out.println(" you had a great game you scored 25 points had 5 assists and 8 rebounds your the next big thing");
											Scanner userInput8= new Scanner(System.in);
											System.out.println(" you have played a bunch of games and are ding well ");
											System.out.println(" you are offered a promotion with");
											System.out.println("1. nike");
											System.out.println("2. jordan");
											System.out.println("3. adidas");
											String nextBigThing = userInput8.nextLine();
											if (nextBigThing.equals ("1")) 
												{
													System.out.println(" Nike offers you a 10 year contract and you get your own shoe");
													System.out.println(" you have made it through the season and your selcted for the rising stars game ");
													Scanner userInput9= new Scanner(System.in);
													System.out.println(" you start ");
													System.out.println(" you start off the game with");
													System.out.println("1. shot");
													System.out.println("2. pass");
													System.out.println("3. nothing");
													String starsGame = userInput9.nextLine();
													if (starsGame.equals("1"))
													{
														Scanner userInput10= new Scanner(System.in);
														System.out.println(" you become the rising stars MVP");
														System.out.println(" after the rising stars game you have a interview with the press they ask you what your going to do to get better");
														System.out.println(" you say ");
														System.out.println(" 1. nothing im already the best ");
														System.out.println("2. Everything that I can to improve");
														System.out.println(" 3. I guess something ");
														String response = userInput10.nextLine();
														if (response.equals("2"))
															{
																System.out.println(" you have a long and succsesful carrer you get inducted into the hall of fame and become the all time scoring leader");
															}
														else if (response.equals("3"))
															{
																System.out.println(" you have a long carrer you are known around the leauge and your jersey is retired with your team");
															}
														else 
															{
																System.out.println(" you had an okay carrer selcted to all stars game a few times and known as a solid player within your community ");
															}
													}
													else if (starsGame.equals ("2"))
														{
															Scanner userInput11= new Scanner(System.in);
															System.out.println(" you had a great game");
															System.out.println(" after the rising stars game you have a interview with the press they ask you what your going to do to get better");
															System.out.println(" you say ");
															System.out.println(" 1. nothing im already the best ");
															System.out.println("2. Everything that I can to improve");
															System.out.println(" 3. I guess something ");
															String response = userInput11.nextLine();
															if (response.equals("2"))
																{
																	System.out.println(" you have a long carrer you are known around the leauge and your jersey is retired with your team");
																}
															else if (response.equals("3"))
																{
																	System.out.println(" you have a long carrer you are known around the leauge");
																}
															else 
																{
																	System.out.println(" you had an okay carrer you are known as a solid player within your community ");
																}
														}
													else
														{
															
															Scanner userInput11= new Scanner(System.in);
															System.out.println(" you had a okay game");
															System.out.println(" after the rising stars game you have a interview with the press they ask you what your going to do to get better");
															System.out.println(" you say ");
															System.out.println(" 1. nothing im already the best ");
															System.out.println("2. Everything that I can to improve");
															System.out.println(" 3. I guess something ");
															String response = userInput11.nextLine();
															if (response.equals("2"))
																{
																	System.out.println(" you have a long carrer you are known around the leauge");
																}
															else if (response.equals("3"))
																{
																	System.out.println(" you have a short carrer but you are known around the leauge");
																}
															else 
																{
																	System.out.println(" you had an okay carrer you are known as a solid 6th man ");
																}
														
														}
												}
											else if (nextBigThing.equals ("2"))
												{
													System.out.println("jordan offers you a 10 year contract and you get your own shoe");
													System.out.println(" you have made it through the season and your selcted for the rising stars game ");
													System.out.println(" ");
													
												}
											else
											{
												System.out.println(" adidias offers you a 10 year contract and you get your own shoe");
												System.out.println(" you have made it through the season and your selcted for the rising stars game ");
												
											}
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
										}
									else if (starterGame.equals("2"))
										{
											System.out.println(" you has a bad agme 3 points 1 assist and 1 rebound coach makes you the 6th man");
										}
									else 
										{
										   System.out.println(" you had an okay game you had 14 points 3 assists and 5 rebounds you are a solid starter");
										}
									
								}
							else if (camp.equals("2"))
								{
									Scanner userInput6= new Scanner(System.in);
									System.out.println(" your coach benches you");
									System.out.println(" ");
									System.out.println(" your first game you only played a total of 2 min you have the ball 3 seconds left your tied what do you do");
									System.out.println("1. take the shot");
									System.out.println("2.pass the ball");
									String benchGame = userInput6.nextLine();
									if (benchGame.equals("1"))
										{
											System.out.println(" you missed and coach benches you again");
										}
									else 
										{
											System.out.println(" you pass to your teamate and he makes it you win and coach thanks you");
										}
									
									
									
								}
							else if (camp.equals("3"))
								{
									System.out.println("Your coach trades you");
									System.out.println(" you are now a part of the" + Database.basketballTeam.get(2));
									
								}
							else
								{
									System.out.println(" Why such a short carrer");
								}
							
								
							
							
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
			else 
				{
					Scanner userInput4= new Scanner(System.in);
					System.out.println(" Baseball! lets get started");
					System.out.println("Now for your Position");
					System.out.println("Here are your choices");
					System.out.println(Database.positionBB);
					 baseballPosition = userInput4.nextLine();
					
					if(baseballPosition.equals("1"))
						{
							System.out.println("Pitcher! Good choice!");
						}
					else if (baseballPosition.equals("2"))
						{
							System.out.println("First Base! Good choice!");
						}
					else if (baseballPosition.equals("3"))
						{
							System.out.println("Second Base! Good choice!");
						}
					else if (baseballPosition.equals("4"))
						{
							System.out.println("Shortstop! Good choice!");
						}
					else if (baseballPosition.equals("5"))
						{
							System.out.println("Third Base! Good choice!");
						}
					else if (baseballPosition.equals("6"))
						{
							System.out.println("Left Feild! Good choice!");
						}
					else if (baseballPosition.equals("7"))
						{
							System.out.println("Center Feild! Good choice!");
						}
					else if (baseballPosition.equals("8"))
						{
							System.out.println("Right feild! Good choice!");
						}
					else  
						{
							System.out.println("Catcher! Good choice!");
						}
					
					System.out.println("Now lets get a team!");
					String draftBB = (" With the "+  Math.random()* 8 +1 + " pick in the mlb draft the " +  Database.baseballTeam.get(1) + "select " + name);
					System.out.println(draftBB);
					
					
				}
					
		
			
				
			
			
		}
	
		
		
		
		}
		
	
