/*Write a GUI program that converts seconds to years, weeks, days, hours, and minutes. 
For this problem, assume 1 year is 365 days. */

package Ch6_PrExercise2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch6_PrExercise2 extends JFrame
{
	private JLabel secondsLabel;
	private JLabel yearsLabel;
	private JLabel weeksLabel;
	private JLabel daysLabel;
	private JLabel hoursLabel;
	private JLabel minutesLabel;
	
	private JTextField secondsTextField;
	private JTextField yearsTextField;
	private JTextField weeksTextField;
	private JTextField daysTextField;
	private JTextField hoursTextField;
	private JTextField minutesTextField;
	private CalculateHandler calculateHandler;
	
	private static final int WIDTH = 250;
	private static final int HEIGHT = 300;
	
	private static final int SECONDS_IN_A_YEAR = 31536000;
	private static final int SECONDS_IN_A_WEEK = 604800;
	private static final int SECONDS_IN_A_DAY = 86400;
	private static final int SECONDS_IN_AN_HOUR = 3600;
	private static final int SECONDS_IN_A_MINUTE = 60;
	
	
	
	public Ch6_PrExercise2()
	{
		setTitle("Seconds Conversion: ");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		
		JPanel leftPanel = new JPanel(new GridLayout(6, 1));
		
		secondsLabel = new JLabel("Seconds: ", SwingConstants.RIGHT);
		yearsLabel = new JLabel("Years: ", SwingConstants.RIGHT);
		weeksLabel = new JLabel("Weeks: ", SwingConstants.RIGHT);
		daysLabel = new JLabel("Days: ", SwingConstants.RIGHT);
		hoursLabel = new JLabel("Hours: ", SwingConstants.RIGHT);
		minutesLabel = new JLabel("Minutes: ", SwingConstants.RIGHT);

		leftPanel.add(secondsLabel);
		leftPanel.add(yearsLabel);
		leftPanel.add(weeksLabel);
		leftPanel.add(daysLabel);
		leftPanel.add(hoursLabel);
		leftPanel.add(minutesLabel);
		
		JPanel rightPanel = new JPanel(new GridLayout(6, 1));
		
		secondsTextField = new JTextField(0);
		yearsTextField = new JTextField(0);
		weeksTextField = new JTextField(0);
		daysTextField = new JTextField(0);
		hoursTextField = new JTextField(0);
		minutesTextField = new JTextField(0);
		
		yearsTextField.setEditable(false);
		weeksTextField.setEditable(false);
		daysTextField.setEditable(false);
		hoursTextField.setEditable(false);
		minutesTextField.setEditable(false);


		rightPanel.add(secondsTextField);
		rightPanel.add(yearsTextField);
		rightPanel.add(weeksTextField);
		rightPanel.add(daysTextField);
		rightPanel.add(hoursTextField);
		rightPanel.add(minutesTextField);
		
		c.add(leftPanel);
		c.add(rightPanel);
		
		calculateHandler = new CalculateHandler();
		
		secondsTextField.addActionListener(calculateHandler);
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class CalculateHandler implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			double seconds, years, weeks, days, hours, minutes;
			
			seconds = Double.parseDouble(secondsTextField.getText());
			
			years = seconds / SECONDS_IN_A_YEAR;
			weeks = seconds / SECONDS_IN_A_WEEK;
			days = seconds / SECONDS_IN_A_DAY;
			hours = seconds / SECONDS_IN_AN_HOUR;
			minutes = seconds / SECONDS_IN_A_MINUTE;
			
			yearsTextField.setText(String.format("%.2f", years));
			weeksTextField.setText(String.format("%.2f", weeks));
			daysTextField.setText(String.format("%.2f", days));
			hoursTextField.setText(String.format("%.2f", hours));
			minutesTextField.setText(String.format("%.2f", minutes));
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		Ch6_PrExercise2 program = new Ch6_PrExercise2();
	}

}
