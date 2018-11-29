import java.awt.*;
import javax.swing.*;

public class UniversalConverterRunner
	{

		public static void main(String[] args)
			{

				//WASSUUUUUUPPPP MY BROSKIIIIIIIIIIII

			JFrame frame = new JFrame("Universal Converter v.1");
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 150);
			frame.setLocation(430, 100);
//			frame.setLayout(null);
			
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
			
//			cb.setVisible(true);
			panel.add(cb);
			
			JButton btn = new JButton("OK");
			btn.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btn);
			
			frame.setVisible(true);
			
			switch(cb.getSelectedIndex())
			{
			case 0:
				convertTemp(12);
				break;
				
				default:
					break;
			}
			
			
				//WASSUUUUUUPPPP MY BROSKIIIIIIIIII

			}
		
		public static int convertTemp(int n)
		{
			System.out.println("test");
			return n;
		}

	}


