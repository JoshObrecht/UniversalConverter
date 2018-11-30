import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TimeZones
	{
	
			//Combo box items
			static String [] units  = {"Central Standard Time", "Mountain Standard Time", "Pacific Standard Time", "Alaska Standard Time", "Hawaii Standard Time"};
			//JFrame
			static JFrame tempFrame = new JFrame("Time Zone Conversions");
			//Combo boxes
			static final JComboBox<String> cb2 = new JComboBox<String>(units);
			static final JComboBox<String> cb1 = new JComboBox<String>(units);
			//Text field for user input
			static JTextField f1= new JTextField("Time Zone", 10);
			//JPanel 
			static JPanel panel = new JPanel();
			//label that displays the conversion
			static JLabel lbl3  = new JLabel();
			//user value taken from text field
			static Double userValue;
	
		public static void takeInput()
		{
panel.setLayout(null);
			
			JLabel lbl = new JLabel("Type in your current time.");
			lbl.setBounds(115, 5, 200, 20);
			panel.add(lbl);
			JLabel lbl4 = new JLabel("(Seperate hours from minutes with a decimal)");
			lbl4.setBounds(65, 30, 350, 20);
			panel.add(lbl4);
			
			JLabel lbl2 = new JLabel("Select what you would like to convert it to.");
			lbl2.setBounds(65, 130, 300, 20);
			panel.add(lbl2);
			
			f1.setBounds(90, 80, 85, 20);
			panel.add(f1);
			
			cb1.setBounds(180, 80, 150, 20);
			panel.add(cb1);
			
			cb2.setBounds(115, 170,150, 20);
			panel.add(cb2);
			
			JButton btn = new JButton("CONVERT");
			btn.setBounds(130, 220, 100, 40);
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
					convertTimeZones();
				}
			}
		);
			
			
		}
		public static void convertTimeZones()
		{
			lbl3.setBounds(50, 300, 300, 20);
			lbl3.setOpaque(true);
			
			switch(cb1.getSelectedIndex())
			{
			case 0:
				switch(cb2.getSelectedIndex())
				{
				case 0:
					lbl3.setText(userValue + " Central Standard Time is " + userValue +  " CST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					lbl3.setText(userValue + " Central Standard Time is " + (userValue-1) +  " MST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					lbl3.setText(userValue + " Central Standard Time is " + (userValue-2) +  " PST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3:
					lbl3.setText(userValue + " Central Standard Time is " + (userValue-3) +  " AST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 4:
					lbl3.setText(userValue + " Central Standard Time is " + (userValue-4) +  " HST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;	
				}
				break;
			case 1:
				switch(cb2.getSelectedIndex())
				{
				case 0:
					lbl3.setText(userValue + " Mountain Standard Time is " + (userValue+1) +  " CST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					lbl3.setText(userValue + " Mountain Standard Time is " + userValue +  " MST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					lbl3.setText(userValue + " Mountain Standard Time is " + (userValue-1) +  " PST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3:
					lbl3.setText(userValue + " Mountain Standard Time is " + (userValue-2) +  " AST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 4:
					lbl3.setText(userValue + " Mountain Standard Time is " + (userValue-3) +  " HST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;	
				}
				break;
			case 2:
				switch(cb2.getSelectedIndex())
				{
				case 0:
					lbl3.setText(userValue + " Pacific Standard Time is " + (userValue+2) +  " CST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					lbl3.setText(userValue + " Pacific Standard Time is " + (userValue+1) +  " MST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					lbl3.setText(userValue + " Pacific Standard Time is " + userValue +  " PST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3:
					lbl3.setText(userValue + " Pacific Standard Time is " + (userValue-1) +  " AST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 4:
					lbl3.setText(userValue + " Pacific Standard Time is " + (userValue-2) +  " HST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;	
				}
				break;
			case 3:
				switch(cb2.getSelectedIndex())
				{
				case 0:
					lbl3.setText(userValue + " Alaskan Standard Time is " + (userValue+3) +  " CST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					lbl3.setText(userValue + " Alaskan Standard Time is " + (userValue+2) +  " MST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					lbl3.setText(userValue + " Alaskan Standard Time is " + (userValue+1) +  " PST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3:
					lbl3.setText(userValue + " Alaskan Standard Time is " + userValue +  " AST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 4:
					lbl3.setText(userValue + " Alaskan Standard Time is " + (userValue-1) +  " HST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;	
				}
				break;
			case 4:
				switch(cb2.getSelectedIndex())
				{
				case 0:
					lbl3.setText(userValue + " Hawaii-Aleutian Standard Time is " + (userValue+4) +  " CST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 1:
					lbl3.setText(userValue + " Hawaii-Aleutian Standard Time " + (userValue+3) +  " MST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 2:
					lbl3.setText(userValue + " Hawaii-Aleutian Standard Time " + (userValue+2) +  " PST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 3:
					lbl3.setText(userValue + " Hawaii-Aleutian Standard Time " + (userValue+1) +  " AST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;
				case 4:
					lbl3.setText(userValue + " Hawaii-Aleutian Standard Time " + userValue +  " HST.");
					panel.add(lbl3);
					tempFrame.repaint();
					break;	
				}
				break;
			}
			
//			boolean Timechoosing = true;
//		    String Start = "";
//		    while (Timechoosing)
//		    	{
//		    		System.out.println("choose the unit of time you want to convert from.");
//		    		System.out.println("1.Central Standard Time");
//		    		System.out.println("2.Mountain Standard Time");
//		    		System.out.println("3.Pacific Standard Time");
//		    		System.out.println("4.Alaska Standard Time");
//		    		System.out.println("5.Hawaii-Aleutian Standard Time");
//		    		Scanner userInput = new Scanner (System.in);
//		    		int choose1 = userInput.nextInt();
//		    		System.out.println("what's the hour of your time?");
//		    		Scanner userInput3= new Scanner (System.in);
//		    		int choose3 = userInput3.nextInt();
//		    		System.out.println("what's the minute of your time?");
//		    		Scanner userInput4 = new Scanner (System.in);
//		    		int choose4 = userInput4.nextInt();
//		    		
//		    		
//		    		
//		    		System.out.println("choose the unit of time you want to convert to.");
//		    		System.out.println("1.Central Standard Time");
//		    		System.out.println("2.Mountain Standard Time");
//		    		System.out.println("3.Pacific Standard Time");
//		    		System.out.println("4.Alaska Standard Time");
//		    		System.out.println("5.Hawaii-Aleutian Standard Time");
//		    		Scanner userInput2 = new Scanner (System.in);
//		    		int choose2 = userInput2.nextInt();
//		    		
//		    		if(choose1 == 1)
//		    			{
//		
//		    				
//		    				 if (choose2 == 2)
//		 
//		    							{
//		    								int number1 = choose3 -1;
//		    								System.out.println("The new time is "+ number1+":" + choose4);
//		    							}
//		    						
//		    				 else if (choose2 == 3)
//		    							{
//		    								int number2 = choose3 -2;
//		    								System.out.println("The new time is " + number2+ ":" +choose4);
//		    							}
//		    				 else if (choose2 == 4)
//		    					 {
//		    						 int number3 = choose3 -3;
//		    						 System.out.println("The new time is " + number3+ ":"+choose4);
//		    					 }  
//		    				 else if (choose2 == 5)
//		    					 {
//		    						 int number4 = choose3 -4;
//		    						 System.out.println("The new time is " + number4+ ":"+choose4);
//		    				  
//		    	                 }
//		    			}
//		    		else if(choose1 == 2)
//		    				     {
//		    				    	 
//		    				    	 
//		    					if (choose2 == 1)
//		    						{
//		    							int number5 = choose3 +1;
//		    							System.out.println("The new time is "+number5 + ":"+choose4);
//		    						}
//		    					else if (choose2 == 3)
//		    			    	   {
//		    			    		   int number6 = choose3 -1;
//		    			    		   System.out.println("The new time is "+number6 + ":"+choose4);
//		    			    	   }
//		    					else if (choose2 == 4)
//		    			    	   {
//		    			    		   int number7 = choose3 -2;
//		    			    		   System.out.println("The new time is "+number7+ ":"+choose4);
//		    			    	   }
//		    					else if (choose2 == 5)
//		    			    	   {
//		    			    		   int number8 = choose3 -3;
//		    			    		   System.out.println("The new time is "+number8+ ":"+choose4);
//		    			    	   }
//		    				     }
//		    					
//		    		else if (choose1 == 3)
//		    			{
//		    				
//		    				
//		    				if(choose2 == 1)
//		    					{
//		    						int number9 = choose3 +2;
//		    						System.out.println("The new time is "+number9+ ":"+choose4);
//		    					}
//		    				else if (choose2 == 2)
//		    					{
//		    						int number10 = choose3 +1;
//		    						System.out.println("The new time is "+number10+":"+choose4);
//		    					}
//		    				else if (choose2 == 4)
//		    					{
//		    						int number11 = choose3 -1;
//		    						System.out.println("The new time is "+number11+":"+choose4);
//		    								
//		    					}
//		    				else if (choose2 == 5)
//		    					{
//		    						int number12 = choose3 -2;
//		    						System.out.println("The new time is "+number12+":"+choose4);
//		    					}
//		    			}
//		    	       else if (choose1 == 4)
//		    			{
//		    				
//		    			    	if(choose2 == 1)
//		    					{
//		    						int number13 = choose3 +3;
//		    						System.out.println("The new time is "+number13+":"+choose4);
//		    					}
//		    			    	else if (choose2 == 2)
//		    			    		{
//		    			    			int number14 = choose3 +2;
//		    			    			System.out.println("The new time is "+number14+":"+choose4);
//		    			    			
//		    			    		}
//		    			    	else if (choose2 == 3) 
//		    			    		{
//		    			    		     int number15 = choose3 +1;
//		    			    		     System.out.println("The new time is "+number15+":"+choose4);
//		    			         	}
//		    			    	else if (choose2 == 5)
//		    			    		{
//		    			    			int number16 = choose3 -1;
//		    			    			System.out.println("The new time is "+number16+":"+choose4);
//		    			    		}
//		    			    	
//		    			}
//		    			else if (choose1 == 5)
//		    				{
//		    				
//		    					
//		    					if(choose2 == 1)
//		    						{
//		    							int number17 = choose3 +4;
//		    							System.out.println("The new time is "+number17+":"+choose4);
//		    						}
//		    					else if(choose2 == 2)
//		    						{
//		    							int number18 = choose3 +3;
//		    							System.out.println("The new time is "+number18+":"+choose4);
//		    						}
//		    					else if(choose2 == 3)
//		    						{
//		    							int number19 = choose3 +2;
//		    							System.out.println("The new time is "+number19+":"+choose4);
//		    						}
//		    					else if (choose2 == 4)
//		    						{
//		    							int number20 = choose3 +1;
//		    							System.out.println("The new time is "+number20+":"+choose4);
//		    						}
//		    					
//		    				}
//		    			
//		    			       
//		    			    	   
//		    				}
		    			}
		    		
		    	}
		

	
