import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TempConversions extends JPanel
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
				lbl2.setBounds(75, 130, 300, 20);
				panel.add(lbl2);
				
				JTextField f1= new JTextField("Temperature 1", 10);
				f1.setBounds(100, 80, 85, 20);
				panel.add(f1);
				
				String [] temperatures  = {"Fahrenheit", "Celsius", "Kelvin"};
				final JComboBox<String> cb1 = new JComboBox<String>(temperatures);
				cb1.setBounds(200, 80, 80, 20);
				panel.add(cb1);
				
				JButton btn = new JButton("CONVERT");
				btn.setBounds(140, 220, 100, 40);
				panel.add(btn);
				
				final JComboBox<String> cb2 = new JComboBox<String>(temperatures);
				cb2.setBounds(150, 170, 80, 20);
				panel.add(cb2);
				
				tempFrame.getContentPane().add(panel);
				tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				tempFrame.setSize(400, 400);
				tempFrame.setVisible(true);
				
				
				btn.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							String userValue = f1.getText();
							double userTemp = Double.parseDouble(userValue);
							JLabel lbl3  = new JLabel();
							lbl3.setBounds(50, 300, 300, 20);
							lbl3.setOpaque(true);
//							panel.add(lbl3);
							switch(cb1.getSelectedIndex())
							{
								case 0:
									panel.remove(lbl3);
									switch(cb2.getSelectedIndex())
									{
										case 0:
											lbl3.setText(userTemp + " degrees Fahrenheit is " + userTemp + " degrees Fahrenheit.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											lbl3.setText(userTemp + " degrees Fahrenheit is " + (int)((userTemp-32)*((double)5/9)) + " degrees Celsius.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 2:
											lbl3.setText(userTemp + " degrees Fahrenheit is " + (int)(((userTemp-32)*((double)5/9))+273.15) + " degrees Kelvin.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
											
									}
									
									break;
								case 1:
									switch(cb2.getSelectedIndex())
									{
										case 0:
											lbl3.setText(userTemp + " degrees Celsius is " + (int)((userTemp * ((double)9/5))+32) + " degrees Fahrenheit.");
											lbl3.setBounds(50, 300, 300, 20);
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											JLabel lbl4 = new JLabel(userTemp + " degrees Celsius is " + userTemp + " degrees Celsius.");
											lbl4.setBounds(50, 300, 300, 20);
											panel.add(lbl4);
											tempFrame.repaint();
											break;
										case 2:
											JLabel lbl5 = new JLabel(userTemp + " degrees Celsius is " + (userTemp + 273.15) + " degrees Kelvin.");
											lbl5.setBounds(50, 300, 300, 20);
											panel.add(lbl5);
											tempFrame.repaint();
											break;
									}
									break;
								case 2:
									switch(cb2.getSelectedIndex())
									{
										case 0:
											lbl3.setText(userTemp + " degrees Kelvin is " + (int)(((userTemp- 273.15)*((double)9/5))+32) + " degrees Fahrenheit.");
											lbl3.setBounds(50, 300, 300, 20);
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											JLabel lbl4 = new JLabel(userTemp + " degrees Kelvin is " + (userTemp - 273.15) + " degrees Celsius.");
											lbl4.setBounds(50, 300, 300, 20);
											panel.add(lbl4);
											tempFrame.repaint();
											break;
										case 2:
											JLabel lbl5 = new JLabel(userTemp + " degrees Kelvin is " + userTemp + " degrees Kelvin.");
											lbl5.setBounds(50, 300, 300, 20);
											panel.add(lbl5);
											tempFrame.repaint();
											break;
									}
									break;
							}
						}
					});
				

					}
				catch(Exception e)
					{
						System.out.println("bet");
					}
			}
	}
