import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MetricConversions extends JPanel {
	
	//Combo box items
	static String [] units  = {"Kilo", "Hecto", "Deka", "Base", "Deci", "Centi", "Mili"};
	//JFrame
	static JFrame tempFrame = new JFrame("Metric Conversions");
	//Combo boxes
	static final JComboBox<String> cb2 = new JComboBox<String>(units);
	static final JComboBox<String> cb1 = new JComboBox<String>(units);
	//User Input taken from text field
	static String userValue;
	//Base value to be converted to
	static double toBase;
	//Text field for user input
	static JTextField f1= new JTextField("Your Value", 10);
	//JPanel 
	static JPanel panel = new JPanel();
		public static void metricConversions()
	{
			panel.setLayout(null);
			
			JLabel lbl = new JLabel("Type in your current value.");
			lbl.setBounds(100, 5, 200, 20);
			panel.add(lbl);
			
			JLabel lbl2 = new JLabel("Select what you would like to convert it to.");
			lbl2.setBounds(75, 130, 300, 20);
			panel.add(lbl2);
			
			
			f1.setBounds(100, 80, 85, 20);
			panel.add(f1);
			
			
			
			cb1.setBounds(200, 80, 80, 20);
			panel.add(cb1);
			
			JButton btn = new JButton("CONVERT");
			btn.setBounds(140, 220, 100, 40);
			panel.add(btn);
			
			
			cb2.setBounds(150, 170, 80, 20);
			panel.add(cb2);
			
			tempFrame.getContentPane().add(panel);
			tempFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			tempFrame.setSize(400, 400);
			tempFrame.setVisible(true);
			
			btn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					convertMetric();
				}
			}
		);
		
	}
		
	public static void convertMetric()
	{
		userValue = f1.getText();
		toBase= Double.parseDouble(userValue);
		
		switch(cb1.getSelectedIndex())
		{
		case 0:
			toBase*=1000.0;
			break;
		case 1:
			toBase*=100.0;
			break;
		case 2:
			toBase*=10.0;
		case 3:
			break;
		case 4:
			toBase/=10.0;
			break;
		case 5:
			toBase/=100.0;
			break;
		case 6:
			toBase/=1000.0;
			break;
		}
		
		JLabel lbl3  = new JLabel();
		lbl3.setBounds(50, 300, 300, 20);
		lbl3.setOpaque(true);
		switch(cb2.getSelectedIndex())
		{
		//base to kilo
		case 0:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase/1000.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		//base to Hecto
		case 1:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase/100.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		//base to deka
		case 2:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase/10.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		//base to base
		case 3:	
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + toBase +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();;
			break;
		//base to deci	
		case 4:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase*10.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		//base to centi	
		case 5:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase*100.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		//base to mili
		case 6:
			lbl3.setText(userValue + " " + (String)cb1.getSelectedItem() +" is " + (toBase*1000.0) +  " "+ (String)cb2.getSelectedItem());
			panel.add(lbl3);
			tempFrame.repaint();
			break;
		}
		
	}
	
//	public static void hecto()
//	{
//		userValue = f1.getText();
//		toBase= Double.parseDouble(userValue);
//		toBase*=100.0;
//		JLabel lbl3  = new JLabel();
//		lbl3.setBounds(50, 300, 300, 20);
//		lbl3.setOpaque(true);
//		switch(cb2.getSelectedIndex())
//		{
//		// kilo to kilo
//		case 0:
//			lbl3.setText(userValue + " Hecto is " + (toBase/1000.0) + " Kilo.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		// kilo to Hecto
//		case 1:
//			lbl3.setText(userValue + " Hecto is " + userValue + " Hecto.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		// kilo to deka
//		case 2:
//			lbl3.setText(userValue + " Hecto is " + (toBase/10.0) + " Deka.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		//kilo to base
//		case 3:	
//			lbl3.setText(userValue + " Hecto is " + toBase + " Base.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		//kilo to deci	
//		case 4:
//			lbl3.setText(userValue + " Hecto is " + (toBase*10.0) + " Deci.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		//kilo to centi	
//		case 5:
//			lbl3.setText(userValue + " Hecto is " + (toBase*100.0) + " Centi.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		//kilo to mili
//		case 6:
//			lbl3.setText(userValue + " Hecto is " + (toBase*1000.0) + " Mili.");
//			panel.add(lbl3);
//			tempFrame.repaint();
//			break;
//		}
////		System.out.println("What unit are you converting to? (1. Kilo 2. Deka 3. Base 4. Deci 5. Centi 6. Mili)");
////		Scanner userWant = new Scanner(System.in);
////		int convertTo = userWant.nextInt();
////		
////		System.out.println("Please enter the number you want to convert");
////		Scanner userNumber = new Scanner (System.in);
////		int number = userNumber.nextInt();
////		
////		double toBase = 0;
////		toBase = number * 100.0;
////		
////		switch (convertTo)
////		{
////		case 1:
////			//base to kilo
////			endNumber = toBase / 1000.0; 
////			break;
////		case 2: 
////			//base to deka
////			endNumber = toBase / 10.0;
////			break;
////		case 3:
////			//base to base
////			endNumber = toBase;
////			break;
////		case 4:
////			//base to deci
////			endNumber = toBase * 10.0;
////		case 5:
////			//base to centi
////			endNumber = toBase * 100.0 ;
////		case 6:
////			//base to mili
////			endNumber = toBase * 1000.0 ;
////		}
//	}
//	
//	public static void deka()
//	{
//		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Base 4. Deci 5. Centi 6. Mili)");
//		Scanner userWant = new Scanner(System.in);
//		int convertTo = userWant.nextInt();
//		
//		System.out.println("Please enter the number you want to convert");
//		Scanner userNumber = new Scanner (System.in);
//		int number = userNumber.nextInt();
//		
//		double toBase;
//		toBase = number * 10.0;
//		
//		switch (convertTo)
//		{
//		case 1:
//			//base to kilo
//			endNumber = toBase / 1000.0; 
//			
//			break;
//		case 2:
//			//base to hecto
//			endNumber = toBase / 100.0;
//			break;
//		case 3:
//			//base to base
//			endNumber = toBase;
//			break;
//		case 4:
//			//base to deci
//			endNumber = toBase * 10.0;
//		case 5:
//			//base to centi
//			endNumber = toBase * 100.0 ;
//		case 6:
//			//base to mili
//			endNumber = toBase * 1000.0 ;
//		}
//	}
//	
//	public static void base ()
//	{
//		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Deci 5. Centi 6. Mili)");
//		Scanner userWant = new Scanner(System.in);
//		int convertTo = userWant.nextInt();
//		
//		System.out.println("Please enter the number you want to convert");
//		Scanner userNumber = new Scanner (System.in);
//		int number = userNumber.nextInt();
//		
//		double toBase = number;
//		
//		switch (convertTo)
//		{
//		case 1:
//			//base to kilo
//			endNumber = toBase / 1000.0; 
//			break;
//		case 2:
//			//base to deka
//			endNumber = toBase / 10.0;
//			break;
//		case 3:
//			//base to hecto
//			endNumber = toBase / 100.0;
//			break;
//		case 4:
//			//base to deci
//			endNumber = toBase * 10.0;
//		case 5:
//			//base to centi
//			endNumber = toBase * 100.0 ;
//		case 6:
//			//base to mili
//			endNumber = toBase * 1000.0 ;
//		}	
//	}
//	
//	public static void deci()
//	{
//		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Centi 6. Mili)");
//		Scanner userWant = new Scanner(System.in);
//		int convertTo = userWant.nextInt();
//		
//		System.out.println("Please enter the number you want to convert");
//		Scanner userNumber = new Scanner (System.in);
//		int number = userNumber.nextInt();
//		
//		double toBase;
//		toBase = number / 10.0;
//		
//		switch (convertTo)
//		{
//		case 1:
//			//base to kilo
//			endNumber = toBase / 1000.0; 
//			break;
//		case 2:
//			//base to hecto
//			endNumber = toBase / 100.0;
//			break;
//		case 3:
//			//base to base
//			endNumber = toBase;
//			break;
//		case 4:
//			//base to deka
//			endNumber = toBase / 10.0;
//		case 5:
//			//base to centi
//			endNumber = toBase * 100.0 ;
//		case 6:
//			//base to mili
//			endNumber = toBase * 1000.0 ;
//		}
//	}
//	
//	public static void centi()
//	{
//		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Deci 6. Mili)");
//		Scanner userWant = new Scanner(System.in);
//		int convertTo = userWant.nextInt();
//		
//		System.out.println("Please enter the number you want to convert");
//		Scanner userNumber = new Scanner (System.in);
//		int number = userNumber.nextInt();
//		
//		double toBase;
//		toBase = number * 100.0;
//		
//		switch (convertTo)
//		{
//		case 1:
//			//base to kilo
//			endNumber = toBase / 1000.0; 
//			break;
//		case 2:
//			//base to hecto
//			endNumber = toBase / 100.0;
//			break;
//		case 3:
//			//base to deka
//			endNumber = toBase / 10.0;
//			break;
//		case 4:
//			//base to base
//			endNumber = toBase;
//		case 5:
//			//base to deci
//			endNumber = toBase * 10.0;
//		case 6:
//			//base to mili
//			endNumber = toBase * 1000.0 ;
//		}
//	}
//	
//	public static void mili()
//	{
//		System.out.println("What unit are you converting to? (1. Kilo 2. Hecto 3. Deka 4. Base 5. Deci 6. Mili)");
//		Scanner userWant = new Scanner(System.in);
//		int convertTo = userWant.nextInt();
//		
//		System.out.println("Please enter the number you want to convert");
//		Scanner userNumber = new Scanner (System.in);
//		int number = userNumber.nextInt();
//		
//		double toBase;
//		toBase = number * 1000.0;
//		
//		switch (convertTo)
//		{
//		case 1:
//			//base to kilo
//			endNumber = toBase / 1000.0; 
//			break;
//		case 2:
//			//base to hecto
//			endNumber = toBase / 100.0;
//			break;
//		case 3:
//			//base to deka
//			endNumber = toBase / 10.0;
//			break;
//		case 4:
//			//base to base
//			endNumber = toBase;
//		case 5:
//			//base to deci
//			endNumber = toBase * 10.0;
//		case 6:
//			//base to centi
//			endNumber = toBase * 100.0 ;
//		}
//	}
	
	
	
}
