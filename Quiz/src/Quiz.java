import java.util.ArrayList;

import javax.swing.*;
 
public class Quiz{
	int score = 0;
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        Quiz quiz = new Quiz();
        
        System.out.println("The correct guess would be " + computerNumber);

       
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        
        questions.add("I have 3 cats and 1 goes fishing at the pond, catching an amount of fish"
                + " equal to 5 times its number of paws. How many animals were referenced in this question?");
        questions.add("My oversized cat has the choice of tuna, salmon, swordfish, or a combination of any two different fish for dinner. If throughout 12 dinners probability is followed, how many swordfish+tuna dinners would she eat?");
        questions.add("What number comes next in the sequence?  1, 11, 12, 23");
        questions.add("If spinning one flax grants 25 experience, and I need 3350 experience to level up, how much flax should I spin?");
        questions.add("There are three possible fish, and it takes 30 seconds to fill an inventory of fish: \n Salmon- 5 experience per second + 20 seconds to run to the bank and back \n"
        		+ " Lobster- 8 experience per second + 30 seconds to run to the bank and back \n Swordfish- 11 experience per second + 40 seconds to run to the bank and back \n"
        		+ "Which option is most efficient over a duration of 12 minutes? (1 / 2 / 3) ");
        
        answers.add(23);
        answers.add(2);
        answers.add(35);
        answers.add(134);
        answers.add(3);
        
        
        
        	for(int i=0;i<questions.size(); i++) {
        		
        	
            String response = JOptionPane.showInputDialog(null, questions.get(i), "Question "+(i+1), 3);
                
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, (answers.get(i)), quiz));
            
        }
        
    }

    public static String determineGuess(int userAnswer, int computerNumber, Quiz quiz){
    	
        if (userAnswer <=0) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
        	quiz.score++;
            return "Correct! Great job : ) \n Score: " + quiz.score;
        }
        
        else{
            return "Not quite... well you can try again. \n Score: " + quiz.score;
        }
        
}
}