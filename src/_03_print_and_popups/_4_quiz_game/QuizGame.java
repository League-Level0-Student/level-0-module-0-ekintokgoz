package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
	String question = JOptionPane.showInputDialog("Which is the largest planet in the solar system?");
				// 3.  Use an if statement to check if their answer is correct
	if(question.equalsIgnoreCase("jupiter"))	{
	JOptionPane.showMessageDialog(null, "Correct!");	
	score+=1;
	} else {
	JOptionPane.showMessageDialog(null, "Wrong..It is jupiter");
	score-=1;
	}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
	String question2 = JOptionPane.showInputDialog("What is the fastest aquatic animal?");	
	if(question2.equalsIgnoreCase("sailfish")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
	} else {
	JOptionPane.showMessageDialog(null, "Wrong..It is sailfish");
	score-=1;
	}
	String question3 = JOptionPane.showInputDialog("What is the largest state in America?");
	if(question3.equalsIgnoreCase("Alaska")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
	} else {
	JOptionPane.showMessageDialog(null, "Wrong..It is Alaska");	
	score-=1;
	}
	// After all the questions have been asked, tell the user their final score 
	JOptionPane.showMessageDialog(null,score);	
	}
}
