import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;


public class Currency
	{
		static double FINAL_PROTOCAL = 0.0;

		//Combo box items
		static String [] units  = {"US Dollar", "EU Euro", "Chinese Yuan", "Japanese Yen", "British Pound", "Mexican Peso"};
		//JFrame
		static JFrame tempFrame = new JFrame("Metric Conversions");
		//Combo boxes
		static final JComboBox<String> cb2 = new JComboBox<String>(units);
		static final JComboBox<String> cb1 = new JComboBox<String>(units);
		//Text field for user input
		static JTextField f1= new JTextField("Value 1", 10);
		//JPanel 
		static JPanel panel = new JPanel();
		//label that displays the conversion
		static JLabel lbl3  = new JLabel();
		//user value taken from text field
		static Double userValue;
		

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
		public static void converterStart()
			{
			
			panel.setLayout(null);
			
			JLabel lbl = new JLabel("Type in your current currency.");
			lbl.setBounds(100, 5, 200, 20);
			panel.add(lbl);
			
			JLabel lbl2 = new JLabel("Select what you would like to convert it to.");
			lbl2.setBounds(75, 130, 300, 20);
			panel.add(lbl2);
			
			f1.setBounds(100, 80, 85, 20);
			panel.add(f1);
			
			cb1.setBounds(200, 80, 85, 20);
			panel.add(cb1);
			
			cb2.setBounds(150, 170, 85, 20);
			panel.add(cb2);
			
			JButton btn = new JButton("CONVERT");
			btn.setBounds(140, 220, 100, 40);
			panel.add(btn);
			
			
			
			
			tempFrame.getContentPane().add(panel);
			tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tempFrame.setSize(400, 400);
			tempFrame.setVisible(true);
			
			btn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					userValue = Double.parseDouble(f1.getText());
					switch(cb1.getSelectedIndex())
					{
					case 0:
						dollarTo();
						break;
					case 1: 
						euroTo();
						break;
					case 2:
						yuanTo();
						break;
					case 3:
						yenTo();
						break;
					case 4:
						poundTo();
						break;
					case 5:
						mPesoTo();
						break;
					}
				}
			}
		);
			
			
//				System.out.println("What Currency are you looking to convert?");
//				System.out.println("1. US Dollar 2. EU Euro 3. Chinese Yuan 4 Japanese Yen 5. British Pound 6. Mexican Peso");
//				Scanner start = new Scanner(System.in);
//				int initial = start.nextInt();
//				
//				switch (initial)
//				{
//				case 1:
//					dollarTo();
//					break;
//				case 2:
//					euroTo();
//					break;
//				case 3:
//					yuanTo();
//					break;
//				case 4:
//					yenTo();
//					break;
//				case 5:
//					poundTo();
//					break;
//				case 6:
//					mPesoTo();
//				
//			
//				}
//			
//				System.out.println(FINAL_PROTOCAL);
				
			}

		private static void dollarTo()
			{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " US dollars is " + userValue +  "US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " US dollars is " + (userValue*.88) +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " US dollars is " + (userValue*6.94) +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " US dollars is " + (userValue*113.27) +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " US dollars is " + (userValue*.78) +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " US dollars is " + (userValue*20.22) +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
//				System.out.println("You chose the US Dollar! What would you like to convert it into?");
//				System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
//				Scanner second = new Scanner(System.in);
//				int secondChoice = second.nextInt();
//				
//				System.out.println("Enter the amount you want to convert:");
//				Scanner amount = new Scanner (System.in);
//				double amountIn = amount.nextDouble();
//				
//				switch (secondChoice)
//				{
//				case 1:
//					
//					FINAL_PROTOCAL = amountIn * 0.78;
//					break;
//				case 2:
//					//yuan
//					FINAL_PROTOCAL = amountIn * 6.94;
//					break;
//				case 3:
//					//euro
//					FINAL_PROTOCAL = amountIn * 0.88;
//					break;
//				case 4:
//					//peso
//					FINAL_PROTOCAL = amountIn * 20.22;
//					break;
//				case 5:
//					//yen
//					FINAL_PROTOCAL = amountIn * 113.27;
//					break;
//				}
				
			}
		private static void euroTo()
			{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " EU Euros is " + (userValue*1.14) +  " US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " EU Euros is " + userValue +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " EU Euros is " + (userValue*7.90) +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " EU Euros is " + (userValue*129.01) +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " EU Euros is " + (userValue*.89) +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " EU Euros is " + (userValue*23.01) +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
			
//				System.out.println("You chose the EU Euro! What would you like to convert it into?");
//				System.out.println("1. British Pound 2. Chinese Yuan 3. U.S. Dollar  4. Mexican Peso 5. Japanese Yen");
//				Scanner second = new Scanner(System.in);
//				int secondChoice = second.nextInt();
//				
//				System.out.println("Enter the amount you want to convert:");
//				Scanner amount = new Scanner (System.in);
//				double amountIn = amount.nextDouble();
//				
//				switch (secondChoice)
//				{
//				case 1:
//					//pound
//					FINAL_PROTOCAL = amountIn * 0.89;
//					break;
//				case 2:
//					//yuan
//					FINAL_PROTOCAL = amountIn * 7.90;
//					break;
//				case 3:
//					//US
//					FINAL_PROTOCAL = amountIn * 1.14;
//					break;
//				case 4:
//					//peso
//					FINAL_PROTOCAL = amountIn * 23.01;
//					break;
//				case 5:
//					//yen
//					FINAL_PROTOCAL = amountIn * 129.01;
//					break;
//				}
			}
		

		
		private static void mPesoTo()
		{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " Mexican Pesos " + (userValue*.049) +  " US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " Mexican Pesos " + (userValue*.043) +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " Mexican Pesos " + (userValue*.34) +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " Mexican Pesos " + (userValue*5.60) +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " Mexican Pesos " + (userValue*.039) +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " Mexican Pesos " + userValue +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
//			System.out.println("You chose the Mexican Peso! What would you like to convert it into?");
//			System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. U.S. Dollar 5. Japanese Yen");
//			Scanner second = new Scanner(System.in);
//			int secondChoice = second.nextInt();
//			
//			System.out.println("Enter the amount you want to convert:");
//			Scanner amount = new Scanner (System.in);
//			double amountIn = amount.nextDouble();
//			
//			switch (secondChoice)
//			{
//			case 1:
//				//pound
//				FINAL_PROTOCAL = amountIn * 0.039;
//				break;
//			case 2:
//				//yuan
//				FINAL_PROTOCAL = amountIn * 0.34;
//				break;
//			case 3:
//				//euro
//				FINAL_PROTOCAL = amountIn * 0.043;
//				break;
//			case 4:
//				//US
//				FINAL_PROTOCAL = amountIn * 0.049;
//				break;
//			case 5:
//				//yen
//				FINAL_PROTOCAL = amountIn * 5.60;
//				break;
//			}
			
		}

		private static void poundTo()
		{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " British Pounds " + (userValue*1.28) +  " US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " British Pounds " + (userValue*1.12) +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " British Pounds " + (userValue*8.86) +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " British Pounds " + (userValue*144.68) +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " British Pounds " + userValue +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " British Pounds " + (userValue*25.83) +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
//			System.out.println("You chose the British Pound! What would you like to convert it into?");
//			System.out.println("1. U.S. Dollar 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
//			Scanner second = new Scanner(System.in);
//			int secondChoice = second.nextInt();
//			
//			System.out.println("Enter the amount you want to convert:");
//			Scanner amount = new Scanner (System.in);
//			double amountIn = amount.nextDouble();
//			
//			switch (secondChoice)
//			{
//			case 1:
//				//US
//				FINAL_PROTOCAL = amountIn * 1.28;
//				break;
//			case 2:
//				//yuan
//				FINAL_PROTOCAL = amountIn * 8.86;
//				break;
//			case 3:
//				//euro
//				FINAL_PROTOCAL = amountIn * 1.12;
//				break;
//			case 4:
//				//peso
//				FINAL_PROTOCAL = amountIn * 25.83;
//				break;
//			case 5:
//				//yen
//				FINAL_PROTOCAL = amountIn * 144.68;
//				break;
//			}
			
		}

		private static void yenTo()
		{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " Japanese Yen " + (userValue*.0088) +  " US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " Japanese Yen " + (userValue*.0078) +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " Japanese Yen " + (userValue*.061) +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " Japanese Yen " + userValue +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " Japanese Yen " + (userValue*.0069) +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " British Pounds " + (userValue*.18) +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
//			System.out.println("You chose the Japanese Yen! What would you like to convert it into?");
//			System.out.println("1. British Pound 2. Chinese Yuan 3. EU Euro  4. Mexican Peso 5. U.S. Dollar");
//			Scanner second = new Scanner(System.in);
//			int secondChoice = second.nextInt();
//			
//			System.out.println("Enter the amount you want to convert:");
//			Scanner amount = new Scanner (System.in);
//			double amountIn = amount.nextDouble();
//			
//			switch (secondChoice)
//			{
//			case 1:
//				//pound
//				FINAL_PROTOCAL = amountIn * 0.0069;
//				break;
//			case 2:
//				//yuan
//				FINAL_PROTOCAL = amountIn * 0.061;
//				break;
//			case 3:
//				//euro
//				FINAL_PROTOCAL = amountIn * 0.0078;
//				break;
//			case 4:
//				//peso
//				FINAL_PROTOCAL = amountIn * 0.18;
//				break;
//			case 5:
//				//usd
//				FINAL_PROTOCAL = amountIn * 0.0088;
//				break;
//			}
			
		}

		private static void yuanTo()
		{
			
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb2.getSelectedIndex())
			{
			//dollar
			case 0:
				lbl3.setText(userValue + " Chinese Yuan " + (userValue*.14) +  " US dollars.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//euro
			case 1:
				lbl3.setText(userValue + " Chinese Yuan " + (userValue*.88) +  " EU Euros.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yuan
			case 2:
				lbl3.setText(userValue + " Chinese Yuan " + userValue +  " Chinese Yuan.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//yen
			case 3:	
				lbl3.setText(userValue + " Chinese Yuan " + (userValue*16.32) +  " Japanese Yen.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//pound
			case 4:
				lbl3.setText(userValue + " Chinese Yuan " + (userValue*.0069) +  " British Pounds.");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			//peso	
			case 5:
				lbl3.setText(userValue + " Chinese Yuan " + (userValue*2.91) +  " Mexican Pesos");
				panel.add(lbl3);
				tempFrame.repaint();
				break;
			}
			
//			System.out.println("You chose the Chinese Yuan! What would you like to convert it into?");
//			System.out.println("1. British Pound 2. U.S. Dollar 3. EU Euro  4. Mexican Peso 5. Japanese Yen");
//			Scanner second = new Scanner(System.in);
//			int secondChoice = second.nextInt();
//			
//			System.out.println("Enter the amount you want to convert:");
//			Scanner amount = new Scanner (System.in);
//			double amountIn = amount.nextDouble();
//			
//			switch (secondChoice)
//			{
//			case 1:
//				//pound
//				FINAL_PROTOCAL = amountIn * 0.11;
//				break;
//			case 2:
//				//US
//				FINAL_PROTOCAL = amountIn * 0.14;
//				break;
//			case 3:
//				//euro
//				FINAL_PROTOCAL = amountIn * 0.88;
//				break;
//			case 4:
//				//peso
//				FINAL_PROTOCAL = amountIn * 2.91;
//				break;
//			case 5:
//				//yen
//				FINAL_PROTOCAL = amountIn * 16.32;
//				break;
//			}
			
		}

		
			
}
	

