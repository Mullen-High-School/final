import java.util.ArrayList;
import java.util.Collections;

public class Database
	{
		static ArrayList<String> sport = new ArrayList<String>(); 
		static ArrayList<String> hairColor = new ArrayList <String>();
		static ArrayList<String> hairType = new ArrayList <String>();
		static ArrayList<String> eyeColor= new ArrayList <String>();
		static ArrayList<String> positionB = new ArrayList <String>();
		static ArrayList<String> positionF = new ArrayList <String>();
		static ArrayList<String> positionBB = new ArrayList <String>();
		static ArrayList<String> overall = new ArrayList <String>();
		static ArrayList<String> basketballTeam = new ArrayList <String>();
		static ArrayList<String> footballTeam = new ArrayList <String>();
		static ArrayList<String> baseballTeam = new ArrayList <String>();
		static ArrayList<String> house = new ArrayList <String>();
		static ArrayList<String> contract = new ArrayList <String>();
		static ArrayList<String> standings = new ArrayList <String>();
		static ArrayList<String> end = new ArrayList <String>();
		
		public static void color()
		{
			hairColor.add("1.Brown");
			hairColor.add("2.Black");
			hairColor.add("3.Blonde");
			hairColor.add("4.Other");
		}
		public static void type()
		{
			hairType.add("1.Straight");
			hairType.add("2.Curly");
			hairType.add("3.Wavy");
			hairType.add("4.Mohawk");
			hairType.add("5.Bald");
			hairType.add("6.Afro");
			hairType.add("7.Other");
		}
		public static void eColor()
		{
			eyeColor.add("1.Brown");
			eyeColor.add("2.Blue");
			eyeColor.add("3.Green");
			eyeColor.add("4.Other");
		}
		

		
		public static void sports()
		{
			sport.add("1.Basketball"); 
			sport.add("2.Football");
			sport.add("3.Baseball");
			
		}
		public static void basketball()
		{
			positionB.add("1.Point Guard");
			positionB.add("2.Shooting Guard"); 
			positionB.add("3.Small Foward");
			positionB.add("4.Power Forward");
			positionB.add("5.Center"); 
		}
		public static void football()
		{
			positionF.add("1.Quarterback");
			positionF.add("2.Running Back");
			positionF.add("3.Wide Receiver");
			positionF.add("4.Tight End");
			positionF.add("5.Cornerback");
			positionF.add("6.Linebacker");
			positionF.add("7.Defensive Tackle");
			positionF.add("8.Defensive End");
			positionF.add("9.Saftey");
		}
		
		public static void baseball()
		{
			positionBB.add("1.Pitcher");
			positionBB.add("2.First Base");
			positionBB.add("3.Second Base");
			positionBB.add("4.Shortstop");
			positionBB.add("5.Thrid Base");
			positionBB.add("6.Left Feild");
			positionBB.add("7.Center Feild");
			positionBB.add("8.Right Feild");
			positionBB.add("9.Catcher");
		}
			
		public static void playerOverall()
		{
			overall.add("Speed ");
			overall.add("Strength ");
			overall.add("Jump ");
			overall.add("Awareness ");
			overall.add("Agility ");
			overall.add("Acceleration ");
			overall.add("Elusiveness ");
			overall.add("Vision ");
		}
		
		public static void bTeam()
		{
			basketballTeam.add("Clevland Cavaliers ");
			basketballTeam.add("Boston Celtics ");
			basketballTeam.add("Washington Wizards ");
			basketballTeam.add("Atlanta Hawks ");
			basketballTeam.add("Indiana Pacers ");
			basketballTeam.add("Chicago Bulls ");
			basketballTeam.add("Detriot Pistons ");
			basketballTeam.add("Milwaukee Bucks ");
			basketballTeam.add("Maimi Heat ");
			basketballTeam.add("Charlotte Hornets ");
			basketballTeam.add("New York Knicks ");
			basketballTeam.add("Phliadelphia 76ers ");
			basketballTeam.add("Orlando Magic ");
			basketballTeam.add("Brooklyn Nets ");
			basketballTeam.add("Golden State Warriors ");
			basketballTeam.add("San Antonio Spurs ");
			basketballTeam.add("Houston Rockets ");
			basketballTeam.add("Los Angeles Clippers ");
			basketballTeam.add("Utah Jazz ");
			basketballTeam.add("Memphis Grizzlies ");
			basketballTeam.add("Oklahoma City Thunder ");
			basketballTeam.add("Denver Nuggets ");
			basketballTeam.add("Sacramento Kings ");
			basketballTeam.add("Portland Trail Blazers ");
			basketballTeam.add("New Orleans Pelicans ");
			basketballTeam.add("Dallas Mavericks ");
			basketballTeam.add("Minnesotta Timberwolves ");
			basketballTeam.add("Los Angeles Lakers ");
			basketballTeam.add("Pheonix Suns ");
			Collections.shuffle(basketballTeam);
		}
		
		public static void fTeam()
		{
			footballTeam.add("Baltimore Ravens ");
			footballTeam.add("Cincinati Bengals ");
			footballTeam.add("Clevland Browns ");
			footballTeam.add("Pittsburg Steelers ");
			footballTeam.add("Chicago Bears ");
			footballTeam.add("Detriot Lions ");
			footballTeam.add("Green Bay Packers ");
			footballTeam.add("Minnesotta Vikings ");
			footballTeam.add("Houston Texans ");
			footballTeam.add("Indianapolis Colts ");
			footballTeam.add("Jacksonville Jaguars ");
			footballTeam.add("Tennessee Titans ");
			footballTeam.add("Atlanta Falcons ");
			footballTeam.add("Carolina Panthers ");
			footballTeam.add("New Orleans Saints ");
			footballTeam.add("Tampa Bay Buccaneers ");
			footballTeam.add("Buffalo Bills ");
			footballTeam.add("Miami Dolphins ");
			Collections.shuffle(footballTeam);
		}
		
		public static void bbTeam()
		{
			baseballTeam.add("Baltimore Orioles ");
			baseballTeam.add("Boston Red Sox ");
			baseballTeam.add("Chicago White Sox ");
			baseballTeam.add("Clevland Indians ");
			baseballTeam.add("Detriot Tigers ");
			baseballTeam.add("Houston Astros ");
			baseballTeam.add("Kansas City Royals ");
			baseballTeam.add("Los Angeles Angels ");
			baseballTeam.add("Minnesotta Twins ");
			baseballTeam.add("New York Yankees ");
			baseballTeam.add("Oakland Athletics ");
			baseballTeam.add("Seattle Mariners ");
			baseballTeam.add("Tampa Bay Rays ");
			baseballTeam.add("Texas Rangers ");
			baseballTeam.add("Toronto Blue Jays ");
			baseballTeam.add("Arizona Diamondbacks ");
			baseballTeam.add("Atlanta Braves ");
			baseballTeam.add("Chicago Cubs ");
			baseballTeam.add("Cincinnati Reds ");
			baseballTeam.add("Colorado Rockies ");
			baseballTeam.add("Los Angeles Dodgers ");
			baseballTeam.add("Miami Marlins ");
			baseballTeam.add("Milwaukee Brewers ");
			baseballTeam.add("New York Mets ");
			baseballTeam.add("Philadelphia Phillies ");
			baseballTeam.add("Pitsburg Pirates ");
			baseballTeam.add("Sand Diego Padres ");
			baseballTeam.add("San Fransisco Giants ");
			baseballTeam.add("St.Louis Cardinals ");
			baseballTeam.add("Washington Nationals ");
			Collections.shuffle(baseballTeam);
			
			
		}

		public static void myContract()
		{
			contract.add("4 years 60 million ");
			contract.add("2 years 20 million ");
			contract.add("1 years 5 million ");
		}
		
		public static void myHouse()
		{
			house.add("1.Mansion ");
			house.add("2.Penthouse ");
			house.add("3.Apartment ");
			house.add("4.Condo ");
		
		}
		
		public static void myStandings()
		{
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
			standings.add(" ");
		}
		public static void myEnd()
		{
			
		}
		

	}
