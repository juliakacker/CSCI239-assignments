/* Design a GUI program to find the weighted average of four test scores. 
The four test scores and their respective weights are given in the following format:
testscore1 weight1
…
For example, the sample data is as follows:
75 0.20
95 0.35
85 0.15
65 0.30
The user is supposed to enter the data and press a Calculate button. The program must display the weighted average. */

package Ch6_PrExercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch6_PrExercise1 extends JFrame { 
    private JLabel scoreLabel;
    private JLabel weightLabel;
    
    private JTextField score1TextField;
    private JTextField score2TextField;
    private JTextField score3TextField;
    private JTextField score4TextField;

    private JTextField weight1TextField;
    private JTextField weight2TextField;
    private JTextField weight3TextField;
    private JTextField weight4TextField;
    
    private JButton calculateButton;
    
    private JLabel weightedAverageLabel;
    private JTextField weightedAverageTextField;

    public CalculateHandler calculateHandler;
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 200;
    
    
    public Ch6_PrExercise1() 
    {
        setTitle("Test Score Calculator");
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 3)); 
        
        JPanel leftPanel = new JPanel(new GridLayout(5, 1)); 
        scoreLabel = new JLabel("Scores: ", SwingConstants.LEFT);
        score1TextField = new JTextField(0);
        score2TextField = new JTextField(0);
        score3TextField = new JTextField(0);
        score4TextField = new JTextField(0);
        leftPanel.add(scoreLabel);
        leftPanel.add(score1TextField);
        leftPanel.add(score2TextField);
        leftPanel.add(score3TextField);
        leftPanel.add(score4TextField);
        
        JPanel centerPanel = new JPanel(new GridLayout(5, 1));
        weightLabel = new JLabel("Weights: ", SwingConstants.LEFT);
        weight1TextField = new JTextField(0);
        weight2TextField = new JTextField(0);
        weight3TextField = new JTextField(0);
        weight4TextField = new JTextField(0);
        centerPanel.add(weightLabel);
        centerPanel.add(weight1TextField);
        centerPanel.add(weight2TextField);
        centerPanel.add(weight3TextField);
        centerPanel.add(weight4TextField);
        
        JPanel rightPanel = new JPanel(new GridLayout(3, 1));
        calculateButton = new JButton("Calculate");
        weightedAverageLabel = new JLabel("Weighted average score: ", SwingConstants.LEFT);
        weightedAverageTextField = new JTextField(0);
        weightedAverageTextField.setEditable(false);
        rightPanel.add(calculateButton);
        rightPanel.add(weightedAverageLabel);
        rightPanel.add(weightedAverageTextField);
               
        
        c.add(leftPanel);
        c.add(centerPanel);
        c.add(rightPanel);
        
        calculateHandler = new CalculateHandler();
        calculateButton.addActionListener(calculateHandler);
        
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private class CalculateHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double score1, score2, score3, score4, weight1, weight2, weight3, weight4, weightedAverage;
            
            score1 = Double.parseDouble(score1TextField.getText());
            score2 = Double.parseDouble(score2TextField.getText());
            score3 = Double.parseDouble(score3TextField.getText());
            score4 = Double.parseDouble(score4TextField.getText());
            
            weight1 = Double.parseDouble(weight1TextField.getText());
            weight2 = Double.parseDouble(weight2TextField.getText());
            weight3 = Double.parseDouble(weight3TextField.getText());
            weight4 = Double.parseDouble(weight4TextField.getText());

            weightedAverage = ((score1 * weight1) + (score2 * weight2) + (score3 * weight3) + (score4 * weight4));
            
            weightedAverageTextField.setText(String.format("%.2f", weightedAverage));
        }
    }    
    
    public static void main(String[] args) 
    {
    	Ch6_PrExercise1 program = new Ch6_PrExercise1(); 
    }
}
