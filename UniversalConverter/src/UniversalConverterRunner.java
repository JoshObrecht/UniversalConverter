
import java.awt.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UniversalConverterRunner
	{

		public static void main(String[] args)
			{
				
				displayJFrame();
		
			}
		public static void displayJFrame()
		{
			JFrame frame = new JFrame("Universal Converter v.1");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 150);
			frame.setLocation(430, 100);
			
			JPanel panel = new JPanel();
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
							case 2:
							
						}
					}
				}
			);
		}
		
		public static void convertTemp()
		{
			System.out.println("test");
		}
	
		

	}
