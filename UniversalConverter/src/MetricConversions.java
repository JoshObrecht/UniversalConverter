import java.util.Scanner;

public class MetricConversions {
	
	static double endNumber = 0.0;
	
	public static void main(String[] args) 
	{
		metricConversions();
	}
		public static void metricConversions()
	{
		
		System.out.println("What unit are you converting from? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Deci 6. Centi 8. Mili)");
		Scanner userSystem = new Scanner(System.in);
		int convertFrom = userSystem.nextInt();
		
		switch (convertFrom)
		{
		case 1: 
			kilo();
			break;
		case 2:
			hecto();
			break;
		case 3:
			deka();
			break;
		case 4:
			base();
			break;
		case 5:
			deci();
			break;
		case 6:
			centi();
			break;
		case 7:
			mili();
			break;
		}
	
		System.out.println(endNumber);
		
	}
		
	public static void kilo()
	{
		
		System.out.println("What unit are you converting to? (1. Hecto 2. Deka 3. Base 4. Deci 5. Centi 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase;
		toBase = number * 1000.0;
		
		switch (convertTo)
		{
		case 1:
			//base to hecto
			endNumber = toBase / 100.0; 
			break;
		case 2:
			//base to deka
			endNumber = toBase / 10.0;
			break;
		case 3:
			//base to base
			endNumber = toBase;
			break;
		case 4:
			//base to deci
			endNumber = toBase * 10.0;
		case 5:
			//base to centi
			endNumber = toBase * 100.0 ;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}
	}
	
	public static void hecto()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Deka 3. Base 4. Deci 5. Centi 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase = 0;
		toBase = number * 100.0;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			break;
		case 2: 
			//base to deka
			endNumber = toBase / 10.0;
			break;
		case 3:
			//base to base
			endNumber = toBase;
			break;
		case 4:
			//base to deci
			endNumber = toBase * 10.0;
		case 5:
			//base to centi
			endNumber = toBase * 100.0 ;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}
	}
	
	public static void deka()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Base 4. Deci 5. Centi 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase;
		toBase = number * 10.0;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			
			break;
		case 2:
			//base to hecto
			endNumber = toBase / 100.0;
			break;
		case 3:
			//base to base
			endNumber = toBase;
			break;
		case 4:
			//base to deci
			endNumber = toBase * 10.0;
		case 5:
			//base to centi
			endNumber = toBase * 100.0 ;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}
	}
	
	public static void base ()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Deci 5. Centi 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase = number;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			break;
		case 2:
			//base to deka
			endNumber = toBase / 10.0;
			break;
		case 3:
			//base to hecto
			endNumber = toBase / 100.0;
			break;
		case 4:
			//base to deci
			endNumber = toBase * 10.0;
		case 5:
			//base to centi
			endNumber = toBase * 100.0 ;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}	
	}
	
	public static void deci()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Centi 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase;
		toBase = number / 10.0;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			break;
		case 2:
			//base to hecto
			endNumber = toBase / 100.0;
			break;
		case 3:
			//base to base
			endNumber = toBase;
			break;
		case 4:
			//base to deka
			endNumber = toBase / 10.0;
		case 5:
			//base to centi
			endNumber = toBase * 100.0 ;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}
	}
	
	public static void centi()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Deci 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase;
		toBase = number * 100.0;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			break;
		case 2:
			//base to hecto
			endNumber = toBase / 100.0;
			break;
		case 3:
			//base to deka
			endNumber = toBase / 10.0;
			break;
		case 4:
			//base to base
			endNumber = toBase;
		case 5:
			//base to deci
			endNumber = toBase * 10.0;
		case 6:
			//base to mili
			endNumber = toBase * 1000.0 ;
		}
	}
	
	public static void mili()
	{
		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Deci 6. Mili)");
		Scanner userWant = new Scanner(System.in);
		int convertTo = userWant.nextInt();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double toBase;
		toBase = number * 1000.0;
		
		switch (convertTo)
		{
		case 1:
			//base to kilo
			endNumber = toBase / 1000.0; 
			break;
		case 2:
			//base to hecto
			endNumber = toBase / 100.0;
			break;
		case 3:
			//base to deka
			endNumber = toBase / 10.0;
			break;
		case 4:
			//base to base
			endNumber = toBase;
		case 5:
			//base to deci
			endNumber = toBase * 10.0;
		case 6:
			//base to centi
			endNumber = toBase * 100.0 ;
		}
	}
	
	
	
}
