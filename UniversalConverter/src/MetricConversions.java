import java.util.Scanner;

public class MetricConversions {

	public static void metricConversion()
	{
		System.out.println("What unit are you converting from? (inches, feet, yards or miles)");
		Scanner userSystem = new Scanner(System.in);
		String convertFrom = userSystem.nextLine();
		
		System.out.println("What unit are you converting to? (inches, feet, yards or miles)");
		Scanner userWant = new Scanner(System.in);
		String convertTo = userWant.nextLine();
		
		System.out.println("Please enter the number you want to convert");
		Scanner userNumber = new Scanner (System.in);
		int number = userNumber.nextInt();
		
		double convertedNumber = 0; 
		
		if (convertFrom.equals("inches") && convertTo.equals("feet"))
		{
			convertedNumber = number / 12;
		}
		
		if (convertFrom.equals("inches") && convertTo.equals("yards"))
		{
			convertedNumber = number / 36;
		}

		if (convertFrom.equals("inches") && convertTo.equals("miles"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("feet") && convertTo.equals("inches"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("feet") && convertTo.equals("yards"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("feet") && convertTo.equals("miles"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("yards") && convertTo.equals("inches"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("yards") && convertTo.equals("feet"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("yards") && convertTo.equals("miles"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("miles") && convertTo.equals("inches"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("miles") && convertTo.equals("feet"))
		{
			convertedNumber = number / 12;
		}

		if (convertFrom.equals("miles") && convertTo.equals("yards"))
		{
			convertedNumber = number / 12;
		}

	}

}
