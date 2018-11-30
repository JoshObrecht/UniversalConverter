import java.util.Scanner;

public class Currency
	{
		static double FINAL_PROTOCAL = 0.0;
		
		public static void main(String[] args)
		{
			converterStart();
		}
//		public static void convert$()
//			{
//				//US
//				double USD = 1;
//				//European Union 0.88
//				double euro = 1;
//				//China 6.94
//				double yuan = 1;
//				//Japan 112.87
//				double yen = 1;
//				//uk 0.78
//				double pound = 1;
				
//				converterStart();
//				dollarTo();
//				euroTo();
//				yuanTo();
//				yenTo();
//				poundTo();
//				
				
				
//			}
		private static void converterStart()
			{
				System.out.println("What Currency are you looking to convert?");
				System.out.println("1. US Dollar 2. EU Euro 3. Chinese Yuan 4 Japanese Yen 5. British Pound 6. Mexican Peso");
				Scanner start = new Scanner(System.in);
				int initial = start.nextInt();
				
				switch (initial)
				{
				case 1:
					dollarTo();
					break;
				case 2:
					euroTo();
					break;
				case 3:
					yuanTo();
					break;
				case 4:
					yenTo();
					break;
				case 5:
					poundTo();
					break;
				case 6:
					mPesoTo();
				
			
				}
			
				System.out.println(FINAL_PROTOCAL);
				
			}

		private static void dollarTo()
			{
				System.out.println("You chose the US Dollar! What would you like to convert it into?");
				System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
				Scanner second = new Scanner(System.in);
				int secondChoice = second.nextInt();
				
				System.out.println("Enter the amount you want to convert:");
				Scanner amount = new Scanner (System.in);
				double amountIn = amount.nextDouble();
				
				switch (secondChoice)
				{
				case 1:
					
					FINAL_PROTOCAL = amountIn * 0.78;
					break;
				case 2:
					//yuan
					FINAL_PROTOCAL = amountIn * 6.94;
					break;
				case 3:
					//euro
					FINAL_PROTOCAL = amountIn * 0.88;
					break;
				case 4:
					//peso
					FINAL_PROTOCAL = amountIn * 20.22;
					break;
				case 5:
					//yen
					FINAL_PROTOCAL = amountIn * 113.27;
					break;
				}
				
			}
		private static void euroTo()
			{
				System.out.println("You chose the EU Euro! What would you like to convert it into?");
				System.out.println("1. British Pound 2. Chinese Yuan 3. U.S. Dollar  4. Mexican Peso 5. Japanese Yen");
				Scanner second = new Scanner(System.in);
				int secondChoice = second.nextInt();
				
				System.out.println("Enter the amount you want to convert:");
				Scanner amount = new Scanner (System.in);
				double amountIn = amount.nextDouble();
				
				switch (secondChoice)
				{
				case 1:
					//pound
					FINAL_PROTOCAL = amountIn * 0.89;
					break;
				case 2:
					//yuan
					FINAL_PROTOCAL = amountIn * 7.90;
					break;
				case 3:
					//US
					FINAL_PROTOCAL = amountIn * 1.14;
					break;
				case 4:
					//peso
					FINAL_PROTOCAL = amountIn * 23.01;
					break;
				case 5:
					//yen
					FINAL_PROTOCAL = amountIn * 129.01;
					break;
				}
			}
		

		
		private static void mPesoTo()
		{
			System.out.println("You chose the Mexican Peso! What would you like to convert it into?");
			System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. U.S. Dollar 5. Japanese Yen");
			Scanner second = new Scanner(System.in);
			int secondChoice = second.nextInt();
			
			System.out.println("Enter the amount you want to convert:");
			Scanner amount = new Scanner (System.in);
			double amountIn = amount.nextDouble();
			
			switch (secondChoice)
			{
			case 1:
				//pound
				FINAL_PROTOCAL = amountIn * 0.039;
				break;
			case 2:
				//yuan
				FINAL_PROTOCAL = amountIn * 0.34;
				break;
			case 3:
				//euro
				FINAL_PROTOCAL = amountIn * 0.043;
				break;
			case 4:
				//US
				FINAL_PROTOCAL = amountIn * 0.049;
				break;
			case 5:
				//yen
				FINAL_PROTOCAL = amountIn * 5.60;
				break;
			}
			
		}

		private static void poundTo()
		{
			System.out.println("You chose the British Pound! What would you like to convert it into?");
			System.out.println("1. U.S. Dollar 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
			Scanner second = new Scanner(System.in);
			int secondChoice = second.nextInt();
			
			System.out.println("Enter the amount you want to convert:");
			Scanner amount = new Scanner (System.in);
			double amountIn = amount.nextDouble();
			
			switch (secondChoice)
			{
			case 1:
				//US
				FINAL_PROTOCAL = amountIn * 1.28;
				break;
			case 2:
				//yuan
				FINAL_PROTOCAL = amountIn * 8.86;
				break;
			case 3:
				//euro
				FINAL_PROTOCAL = amountIn * 1.12;
				break;
			case 4:
				//peso
				FINAL_PROTOCAL = amountIn * 25.83;
				break;
			case 5:
				//yen
				FINAL_PROTOCAL = amountIn * 144.68;
				break;
			}
			
		}

		private static void yenTo()
		{
			System.out.println("You chose the Japanese Yen! What would you like to convert it into?");
			System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. U.S. Dollar");
			Scanner second = new Scanner(System.in);
			int secondChoice = second.nextInt();
			
			System.out.println("Enter the amount you want to convert:");
			Scanner amount = new Scanner (System.in);
			double amountIn = amount.nextDouble();
			
			switch (secondChoice)
			{
			case 1:
				//pound
				FINAL_PROTOCAL = amountIn * 0.0069;
				break;
			case 2:
				//yuan
				FINAL_PROTOCAL = amountIn * 0.061;
				break;
			case 3:
				//euro
				FINAL_PROTOCAL = amountIn * 0.0078;
				break;
			case 4:
				//peso
				FINAL_PROTOCAL = amountIn * 0.18;
				break;
			case 5:
				//usd
				FINAL_PROTOCAL = amountIn * 0.0088;
				break;
			}
			
		}

		private static void yuanTo()
		{
			System.out.println("You chose the Chinese Yuan! What would you like to convert it into?");
			System.out.println("1. British Pound 2. U.S. Dollar 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
			Scanner second = new Scanner(System.in);
			int secondChoice = second.nextInt();
			
			System.out.println("Enter the amount you want to convert:");
			Scanner amount = new Scanner (System.in);
			double amountIn = amount.nextDouble();
			
			switch (secondChoice)
			{
			case 1:
				//pound
				FINAL_PROTOCAL = amountIn * 0.11;
				break;
			case 2:
				//US
				FINAL_PROTOCAL = amountIn * 0.14;
				break;
			case 3:
				//euro
				FINAL_PROTOCAL = amountIn * 0.88;
				break;
			case 4:
				//peso
				FINAL_PROTOCAL = amountIn * 2.91;
				break;
			case 5:
				//yen
				FINAL_PROTOCAL = amountIn * 16.32;
				break;
			}
			
		}

		
			
}
	

