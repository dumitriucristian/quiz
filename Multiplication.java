/*
 * Multiply two random  numbers
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author web
 */
public class Multiplication extends Addition{
    
     // private int[] correctAnswers;
     // private int[] userAnswers;

    public Multiplication(int nrOfQuestion){
       super(nrOfQuestion);
       
         // this.correctAnswers = new int[nrOfQuestion];
          //this.userAnswers = new int[nrOfQuestion];
        
    }
    
    public void runQuiz(int nrOfQuestion){
        for(int i=0; i<nrOfQuestion; i++){
                 firstNumbers[i]=getRandom();
                 secondNumbers[i]=getRandom();
                 correctAnswers[i] = correctAnswer(firstNumbers[i],secondNumbers[i] ) ;
     
                System.out.println("What is the product of:" +firstNumbers[i] +" x  "+ secondNumbers[i]);
                
                //require input
                Scanner sc = new Scanner(System.in);
                //save the answer
                userAnswers[i] = sc.nextInt();
            
                //check the answer and add new points if correct
               setUserPoints(correctAnswers[i], userAnswers[i]);
        }
         //calculate ratings
        setAdditionRatings(nrOfCorrectAnswers, nrOfQuestion);
        System.out.println("You succeded " +additionRatings + "% of points" + "rsp ok"  + nrOfCorrectAnswers);
            //replay the answer and the questions
            replay(nrOfQuestion);

    }
    
    //this random is overiden because is diffferent
    public int getRandom(){
        int getRandom = (int) (Math.random()*9+1);
        return getRandom;
    }

    private int correctAnswer( int nrOne, int nrTwo){

        int correctAnswer = nrOne *  nrTwo;
        return correctAnswer;
    }
    
      private void replay(int nrOfQuestion){
        for(int i=0; i<nrOfQuestion; i++){
            System.out.println( "Question: " + firstNumbers[i] +" x " +secondNumbers[i] + " = " + correctAnswers[i]+ " your answer " + userAnswers[i]);
        }
        System.out.println("You have scored: " + userPoints + " points");
     
   }
    
}
