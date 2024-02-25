/*Write a GUI program to convert all lowercase letters in a string to uppercase letters, and vice verse. 
 For example, Alb34eRt will be converted to aLB34ErT.*/

package Ch6_PrExercise5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch6_PrExercise5 extends JFrame
{
	private JLabel inputLabel;
	private JTextField inputTextField;
	private JButton convertButton;
	private JLabel placeholder;
	private JLabel convertedTextLabel;
	private JTextField convertedTextField;
	
	private ConversionHandler conversionHandler;
	
	private static final int WIDTH = 300;
	private static final int HEIGHT = 300;
	
	public Ch6_PrExercise5()
	{
		setTitle("String letter conversion:");
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 3));
		
		JPanel leftPanel = new JPanel(new GridLayout(3, 1));
		inputLabel = new JLabel("Input a string: ", SwingConstants.RIGHT);
		convertButton = new JButton("Convert");
		convertedTextLabel = new JLabel("Converted string: ", SwingConstants.RIGHT);
		leftPanel.add(inputLabel);
		leftPanel.add(convertButton);
		leftPanel.add(convertedTextLabel);
		
		JPanel rightPanel = new JPanel(new GridLayout(3, 1));
		inputTextField = new JTextField(0);
		placeholder = new JLabel("", SwingConstants.RIGHT);
		convertedTextField = new JTextField(0);
		convertedTextField.setEditable(false);
		rightPanel.add(inputTextField);
		rightPanel.add(placeholder);
		rightPanel.add(convertedTextField);
		
		c.add(leftPanel);
		c.add(rightPanel);
		
		conversionHandler = new ConversionHandler();
		convertButton.addActionListener(conversionHandler);
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	private class ConversionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String inputText, convertedText;
			convertedText = "";
			
			inputText = String.valueOf(inputTextField.getText());
			
			for (int i = 0; i < inputText.length(); i++)
			{
				char nextCharacter = inputText.charAt(i);
				
				if (Character.isUpperCase(nextCharacter)) {
					convertedText += Character.toLowerCase(nextCharacter);
                } else if (Character.isLowerCase(nextCharacter)) {
                	convertedText += Character.toUpperCase(nextCharacter);
                } else {
                	convertedText += nextCharacter;
                }
			}
			
			convertedTextField.setText(convertedText);

		}
	}
	
	public static void main(String[] args) 
	{
		Ch6_PrExercise5 program = new Ch6_PrExercise5();
	}

}
