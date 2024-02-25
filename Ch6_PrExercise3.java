//Design and implement a GUI program to compare two strings and display the larger one. 

package Ch6_PrExercise3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch6_PrExercise3 extends JFrame
{
	private JLabel string1Label;
	private JLabel string2Label;
	
	private JTextField string1TextField;
	private JTextField string2TextField;
	
	private JButton compareButton;
	private JLabel placeholder;
	
	private JLabel longerStringLabel;
	private JTextField longerStringTextField;
	
	private ComparisonHandler comparisonHandler;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	public Ch6_PrExercise3()
	{
		setTitle("String Comparison: ");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		
		JPanel leftPanel = new JPanel(new GridLayout(4, 1));
		string1Label = new JLabel("First string: ", SwingConstants.RIGHT);
		string2Label = new JLabel("Second string: ", SwingConstants.RIGHT);
		compareButton = new JButton("Compare");
		longerStringLabel = new JLabel("Longer string: ", SwingConstants.RIGHT);
		leftPanel.add(string1Label);
		leftPanel.add(string2Label);
		leftPanel.add(compareButton);
		leftPanel.add(longerStringLabel);
		
		JPanel rightPanel = new JPanel(new GridLayout(4, 1));
		string1TextField = new JTextField(0);
		string2TextField = new JTextField(0);
		placeholder = new JLabel("", SwingConstants.RIGHT);
		longerStringTextField = new JTextField(0);
		longerStringTextField.setEditable(false);
		rightPanel.add(string1TextField);
		rightPanel.add(string2TextField);
		rightPanel.add(placeholder);
		rightPanel.add(longerStringTextField);
		
		c.add(leftPanel);
		c.add(rightPanel);
		
		comparisonHandler = new ComparisonHandler();
		compareButton.addActionListener(comparisonHandler);
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class ComparisonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String string1, string2, longerString;
			
			string1 = String.valueOf(string1TextField.getText());
			string2 = String.valueOf(string2TextField.getText());
			
			if (string1.length() > string2.length()) {
				longerString = "\"" + string1 + "\"";
			} else if (string2.length() > string1.length()) {
				longerString = "\"" + string2 + "\"";
			} else {
				longerString = "The strings are the same length.";
			}
			
			longerStringTextField.setText(longerString);
		}
	}
	
	public static void main(String[] args) 
	{
		Ch6_PrExercise3 program = new Ch6_PrExercise3();
	}

}
