import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TempConversions extends JPanel
	{
	//Combo box items
	static String [] units  = {"Fahrenheit", "Celsius", "Kelvin"};
	//JFrame
	static JFrame tempFrame = new JFrame("Temp Conversions");
	//Combo boxes
	static final JComboBox<String> cb2 = new JComboBox<String>(units);
	static final JComboBox<String> cb1 = new JComboBox<String>(units);
	//Text field for user input
	static JTextField f1= new JTextField("Current Temp", 10);
	//JPanel 
	static JPanel panel = new JPanel();
	//label that displays the conversion
	static JLabel lbl3  = new JLabel();
	//user value taken from text field
	static Double userValue;
		public static void convertTemp()
			{
				try
					{			
					panel.setLayout(null);
					
					JLabel lbl = new JLabel("Type in your current temperature.");
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
											lbl3.setText(userValue + " degrees Fahrenheit is " + userValue + " degrees Fahrenheit.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											lbl3.setText(userValue + " degrees Fahrenheit is " + (int)((userValue-32)*((double)5/9)) + " degrees Celsius.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 2:
											lbl3.setText(userValue + " degrees Fahrenheit is " + (int)(((userValue-32)*((double)5/9))+273.15) + " degrees Kelvin.");
											panel.add(lbl3);
											tempFrame.repaint();
											break;
											
									}
									
									break;
								case 1:
									switch(cb2.getSelectedIndex())
									{
										case 0:
											lbl3.setText(userValue + " degrees Celsius is " + (int)((userValue * ((double)9/5))+32) + " degrees Fahrenheit.");
											lbl3.setBounds(50, 300, 300, 20);
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											JLabel lbl4 = new JLabel(userValue + " degrees Celsius is " + userValue + " degrees Celsius.");
											lbl4.setBounds(50, 300, 300, 20);
											panel.add(lbl4);
											tempFrame.repaint();
											break;
										case 2:
											JLabel lbl5 = new JLabel(userValue + " degrees Celsius is " + (userValue + 273.15) + " degrees Kelvin.");
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
											lbl3.setText(userValue + " degrees Kelvin is " + (int)(((userValue- 273.15)*((double)9/5))+32) + " degrees Fahrenheit.");
											lbl3.setBounds(50, 300, 300, 20);
											panel.add(lbl3);
											tempFrame.repaint();
											break;
										case 1:
											JLabel lbl4 = new JLabel(userValue + " degrees Kelvin is " + (userValue - 273.15) + " degrees Celsius.");
											lbl4.setBounds(50, 300, 300, 20);
											panel.add(lbl4);
											tempFrame.repaint();
											break;
										case 2:
											JLabel lbl5 = new JLabel(userValue + " degrees Kelvin is " + userValue + " degrees Kelvin.");
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
