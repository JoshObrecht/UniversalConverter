import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.layout.Border;

public class UniversalConverterRunner
	{

		static JFrame frame = new JFrame("Universal Converter v.1");
		static JPanel panel = new JPanel();
		public static void main(String[] args)
			{
			displayJFrame();
				//WASSUUUUUUPPPP MY BROSKIIIIIIIIII
			}
		public static void displayJFrame()
		{
			try
				{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 150);
			frame.setLocation(430, 100);
			
			
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			frame.add(panel);
			
			JLabel lbl = new JLabel("Select the type of conversion");
			lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(lbl);
			
			String [] choices = {"Temperature", "Metric", "Currency", "Time Zones"};
			
			final JComboBox<String> cb = new JComboBox<String>(choices);
			
			cb.setMaximumSize(cb.getPreferredSize()); 
			cb.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(cb);
			
			JButton btn = new JButton("OK");
			btn.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btn);
			
			frame.setVisible(true);
			
			btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						switch(cb.getSelectedIndex())
						{
							case 0:
								convertTemp();
								break;
							case 1:
								System.out.println("yo");
						}
					}
				});
				}
			catch(Exception e)
				{
					System.out.println("bet");
				}
		}
		public static void convertTemp()
		{
			try
				{
			frame.getContentPane().removeAll();
			frame.repaint();
			frame.getContentPane().setLayout(new FlowLayout());
			
			JLabel lbl = new JLabel("Type in your current temperature. Select what you would like to convert it to.");
			lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
			frame.add(lbl);
			
			String [] temperatures  = {"Farenheit", "Celsius"};
			final JComboBox<String> cb = new JComboBox<String>(temperatures);
			cb.setAlignmentX(Component.CENTER_ALIGNMENT);
			frame.add(cb);
			
			JTextField f1= new JTextField("Temperature 1", 10);
			JTextField f2= new JTextField("Converted Temp", 10);
			f2.setLocation(250, 125);
			
			frame.getContentPane().add(f1);
			frame.getContentPane().add(f2);
			
			JButton btn = new JButton("CONVERT");
			btn.setAlignmentX(Component.CENTER_ALIGNMENT);
			frame.add(btn);
			
			btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						switch(cb.getSelectedIndex())
						{
							case 0:
								String userValue = f1.getText();
								double userTemp = Double.parseDouble(userValue);
								System.out.println((userTemp*(9/5))+32);
								break;
							case 1:
								System.out.println("yo");
						}
					}
				});
			
			
			
			frame.pack();
			frame.setSize(500, 150);
			panel.setVisible(true);
				}
			catch(Exception e)
				{
					System.out.println("bet");
				}
		}

	}
