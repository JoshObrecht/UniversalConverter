import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TempConversions extends JFrame
	{
		static JFrame tempFrame = new JFrame("Temp Conversions");
		public static void convertTemp()
			{
				try
					{			
				JPanel panel = new JPanel();
				panel.setLayout(null);
				
				JLabel lbl = new JLabel("Type in your current temperature.");
				lbl.setBounds(100, 5, 200, 20);
				panel.add(lbl);
				
				JLabel lbl2 = new JLabel("Select what you would like to convert it to.");
				lbl2.setBounds(75, 200, 300, 20);
				panel.add(lbl2);
				
				JTextField f1= new JTextField("Temperature 1", 10);
				f1.setBounds(100, 80, 85, 20);
				panel.add(f1);
				
				String [] temperatures  = {"Farenheit", "Celsius", "Kelvin"};
				final JComboBox<String> cb = new JComboBox<String>(temperatures);
				cb.setBounds(200, 80, 80, 20);
				panel.add(cb);
				
				JButton btn = new JButton("CONVERT");
				btn.setBounds(140, 130, 100, 40);
				panel.add(btn);
				
				tempFrame.getContentPane().add(panel);
				tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				tempFrame.setSize(400, 400);
				tempFrame.setVisible(true);
				
				
				
				
//				
				
//				

//				JTextField f2= new JTextField("Converted Temp", 10);
//				f2.setLocation(250, 125);
//				
//				UniversalConverterRunner.frame.getContentPane().add(f1);
//				UniversalConverterRunner.frame.getContentPane().add(f2);
//				
//				
//				btn.setAlignmentX(Component.CENTER_ALIGNMENT);
////				UniversalConverterRunner.frame.add(btn);
//				panel.add(btn, BorderLayout.SOUTH);
//				
//				btn.addActionListener(new ActionListener()
//					{
//						public void actionPerformed(ActionEvent e)
//						{
//							switch(cb.getSelectedIndex())
//							{
//								case 0:
//									String userValue = f1.getText();
//									double userTemp = Double.parseDouble(userValue);
//									System.out.println((userTemp*(9/5))+32);
//									
//									break;
//								case 1:
//									System.out.println("yo");
//							}
//						}
//					});
//				
//				panel.setVisible(true);
//				
//				UniversalConverterRunner.frame.pack();
//				UniversalConverterRunner.frame.setSize(500, 150);
//				
//				panel.setVisible(true);
					}
				catch(Exception e)
					{
						System.out.println("bet");
					}
			}
	}
