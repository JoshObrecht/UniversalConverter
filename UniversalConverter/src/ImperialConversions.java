import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class ImperialConversions {
 
//	 static double finalNumber = 0.0;
	 
	//Combo box items
			static String [] units  = {"Inches", "Feet", "Yards", "Miles"};
			//JFrame
			static JFrame tempFrame = new JFrame("IMperial Conversions");
			//Combo boxes
			static final JComboBox<String> cb2 = new JComboBox<String>(units);
			static final JComboBox<String> cb1 = new JComboBox<String>(units);
			//Text field for user input
			static JTextField f1= new JTextField("Your Unit", 10);
			//JPanel 
			static JPanel panel = new JPanel();
			//label that displays the conversion
			static JLabel lbl3  = new JLabel();
			//user value taken from text field
			static Double userValue;
		
 		public static void imperialConversion()
		{
panel.setLayout(null);
			
			JLabel lbl = new JLabel("Type in your current unit.");
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
			tempFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
						inches();
						break;
					case 1: 
						feet();
						break;
					case 2:
						yards();
						break;
					case 3:
						miles();
						break;
					}
				}
			}
		);
			
//			System.out.println("What unit are you converting from? (1. inches 2. feet 3. yards 4. miles)");
//			Scanner userSystem = new Scanner(System.in);
//			int convertFrom = userSystem.nextInt();
//			
//			switch (convertFrom)
//			{
//			case 1: 
//				inches();
//				break;
//			case 2:
//				feet();
//				break;
//			case 3:
//				yards();
//				break;
//			case 4:
//				miles();
//			}
//		
//			System.out.println(finalNumber);
			
		}
 		
			public static void inches() 
			{
				
				lbl3.setBounds(50, 300, 300, 20);
				lbl3.setOpaque(true);
				
				switch(cb2.getSelectedIndex())
				{
				case 0:
					//inches
					lbl3.setText(userValue + " inches is " + userValue +  " inches.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					//feet
					lbl3.setText(userValue + " inches is " + (userValue/12.0) +  " feet.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					//yards
					lbl3.setText(userValue + " inches is " + (userValue/36.0) +  " yards.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3: 
					//miles
					lbl3.setText(userValue + " inches is " + (userValue/63360.0) +  " miles.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				}
				
//				System.out.println("What unit are you converting to? (1. feet 2. yards 3. miles)");
//				Scanner userWant = new Scanner(System.in);
//				int convertTo = userWant.nextInt();
//				
//				System.out.println("Please enter the number you want to convert.");
//				Scanner userNumber = new Scanner (System.in);
//				int number = userNumber.nextInt();
//				
//				switch (convertTo)
//				{
//				case 1:
//					//inches to feet
//					finalNumber = number / 12; 
//					break;
//				case 2:
//					//inches to yards
//					finalNumber = number / 36;
//					break;
//				case 3:
//					//inches to miles
//					finalNumber = number / 63360;
//					break;
//				}
				
			}
			
			private static void feet() 
			{
				
				lbl3.setBounds(50, 300, 300, 20);
				lbl3.setOpaque(true);
				
				switch(cb2.getSelectedIndex())
				{
				case 0:
					//inches
					lbl3.setText(userValue + " feet is " + (userValue*12.0) +  " inches.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					//feet
					lbl3.setText(userValue + " feet is " + userValue +  " feet.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					//yards
					lbl3.setText(userValue + " feet is " + (userValue/3.0) +  " yards.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3: 
					//miles
					lbl3.setText(userValue + " feet is " + (userValue/5280) +  " miles.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				}
				
//				System.out.println("What unit are you converting to? (1. inches 2. yards 3. miles)");
//				Scanner userWant = new Scanner(System.in);
//				int convertTo = userWant.nextInt();
//				
//				System.out.println("Please enter the number you want to convert.");
//				Scanner userNumber = new Scanner (System.in);
//				int number = userNumber.nextInt();
//				
//				switch (convertTo)
//				{
//				case 1:
//					//feet to inches
//					finalNumber = number * 12;
//					break;
//				case 2:
//					//feet to yards
//					finalNumber = number / 3;
//					break;
//				case 3:
//					//feet to miles
//					finalNumber = number / 5280;
//					break;
//				
//				}
			}
			
			
			private static void yards() 
			{
				
				lbl3.setBounds(50, 300, 300, 20);
				lbl3.setOpaque(true);
				
				switch(cb2.getSelectedIndex())
				{
				case 0:
					//inches
					lbl3.setText(userValue + " yards is " + (userValue*36.0) +  " inches.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					//feet
					lbl3.setText(userValue + " yards is " + (userValue*3.0) +  " feet.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					//yards
					lbl3.setText(userValue + " yards is " + userValue +  " yards.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3: 
					//miles
					lbl3.setText(userValue + " yards is " + (userValue/1760.0) +  " miles.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				}
				
//				System.out.println("What unit are you converting to? (1. inches 2. feet 3. miles)");
//				Scanner userWant = new Scanner(System.in);
//				int convertTo = userWant.nextInt();
//				
//				System.out.println("Please enter the number you want to convert.");
//				Scanner userNumber = new Scanner (System.in);
//				int number = userNumber.nextInt();
//				
//				switch (convertTo)
//				{
//				case 1:
//					//yards to inches
//					finalNumber = number * 36;
//					break;
//				case 2:
//					//yards to feet
//					finalNumber = number * 3;
//					break;
//				case 3:
//					//yards to miles
//					finalNumber = number / 1760;
//					break;
//				}
			}
		
			private static void miles()
			{
				
				lbl3.setBounds(50, 300, 300, 20);
				lbl3.setOpaque(true);
				
				switch(cb2.getSelectedIndex())
				{
				case 0:
					//inches
					lbl3.setText(userValue + " miles is " + (userValue*63360.0) +  " inches.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					//feet
					lbl3.setText(userValue + " miles is " + (userValue*5280.0) +  " feet.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					//yards
					lbl3.setText(userValue + " miles is " + (userValue*1760.0) +  " yards.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3: 
					//miles
					lbl3.setText(userValue + " miles is " + userValue +  " miles.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				}
//				System.out.println("What unit are you converting to? (1. inches 2. feet 3. yards)");
//				Scanner userWant = new Scanner(System.in);
//				int convertTo = userWant.nextInt();
//				
//				System.out.println("Please enter the number you want to convert.");
//				Scanner userNumber = new Scanner (System.in);
//				int number = userNumber.nextInt();
//					
//				switch (convertTo)
//				{
//				case 1:
//					//miles to inches
//					finalNumber = number * 63360;
//					break;
//				case 2:
//					//miles to feet
//					finalNumber = number * 5280;
//					break;
//				case 3:
//					//miles to yards
//					finalNumber = number * 1760;
//					break;
//				}
		
			}	
 	}
