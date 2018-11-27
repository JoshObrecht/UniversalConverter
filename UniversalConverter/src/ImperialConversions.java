import java.util.Scanner;
 public class ImperialConversions {
 	static double finalNumber = 0.0;
		
		public static void main(String[] args) {
			imperialConversion();
		}
 		public static void imperialConversion()
		{
			
			System.out.println("What unit are you converting from? (1. inches, 2. feet, 3. yards or 4. miles)");
			Scanner userSystem = new Scanner(System.in);
			int convertFrom = userSystem.nextInt();
			
			switch (convertFrom)
			{
			case 1: 
				inches();
				break;
			case 2:
				feet();
				break;
			case 3:
				yards();
				break;
			case 4:
				miles();
			}
		
			System.out.println(finalNumber);
			
		}
 		
			public static void inches() 
			{
				System.out.println("What unit are you converting to? (1. feet, 2. yards or 3. miles)");
				Scanner userWant = new Scanner(System.in);
				int convertTo = userWant.nextInt();
				
				System.out.println("Please enter the number you want to convert");
				Scanner userNumber = new Scanner (System.in);
				int number = userNumber.nextInt();
				
				//double finalNumber = 0.0;
				
				switch (convertTo)
				{
				case 1:
					//inches to feet
					finalNumber = number / 12; 
					break;
				case 2:
					//inches to yards
					finalNumber = number / 36;
					break;
				case 3:
					//inches to miles
					finalNumber = number / 63360;
					break;
				}
				
			}
			
			private static void feet() 
			{
				System.out.println("What unit are you converting to? (1. inches, 2. yards 3. miles)");
				Scanner userWant = new Scanner(System.in);
				int convertTo = userWant.nextInt();
				
				System.out.println("Please enter the number you want to convert");
				Scanner userNumber = new Scanner (System.in);
				int number = userNumber.nextInt();
				
				//double finalNumber = 0.0;
					
				switch (convertTo)
				{
				case 1:
					//feet to inches
					finalNumber = number * 12;
					break;
				case 2:
					//feet to yards
					finalNumber = number / 3;
					break;
				case 3:
					//feet to miles
					finalNumber = number / 5280;
					break;
				}
			}
			
			
			private static void yards() 
			{
				System.out.println("What unit are you converting to? (1. inches, 2. feet 3. miles)");
				Scanner userWant = new Scanner(System.in);
				int convertTo = userWant.nextInt();
				
				System.out.println("Please enter the number you want to convert");
				Scanner userNumber = new Scanner (System.in);
				int number = userNumber.nextInt();
				
				//double finalNumber = 0.0;
					
				switch (convertTo)
				{
				case 1:
					//yards to inches
					finalNumber = number * 36;
					break;
				case 2:
					//yards to feet
					finalNumber = number * 3;
					break;
				case 3:
					//yards to miles
					finalNumber = number / 1760;
					break;
				}
			}
		
			private static void miles()
			{
				System.out.println("What unit are you converting to? (1. inches, 2. feet 3. yards)");
				Scanner userWant = new Scanner(System.in);
				int convertTo = userWant.nextInt();
				
				System.out.println("Please enter the number you want to convert");
				Scanner userNumber = new Scanner (System.in);
				int number = userNumber.nextInt();
				
				//double finalNumber = 0.0;
					
				switch (convertTo)
				{
				case 1:
					//miles to inches
					finalNumber = number * 63360;
					break;
				case 2:
					//miles to feet
					finalNumber = number * 5280;
					break;
				case 3:
					//miles to yards
					finalNumber = number * 1760;
					break;
				}
		
			}	
 	}
