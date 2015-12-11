/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author web
 */
public class Addition {
    
    
    int[] firstNumbers ;
    int[] secondNumbers;
    int[] correctAnswers;
    int[] userAnswers;
    int userPoints;
    private int nrOfQuestion;
    
    public Addition( int nrOfQuestion){
        
       this.nrOfQuestion = getNrOfQuestion(); 
       this.firstNumbers = new int[nrOfQuestion];
       this.secondNumbers =new int[nrOfQuestion];
       this.correctAnswers = new int[nrOfQuestion];
       this.userAnswers = new int[nrOfQuestion];
    
        runQuiz( nrOfQuestion);
        
    }
    
   private void runQuiz(int nrOfQuestion){
            for(int i=0; i<nrOfQuestion; i++){
              
               firstNumbers[i]=getRandom();
               secondNumbers[i]=getRandom();
               correctAnswers[i] = correctAnswer( firstNumbers[i],secondNumbers[i]);
       
                System.out.println("What is the sum of:" +firstNumbers[i] +" + "+ secondNumbers[i]);
                
                Scanner sc = new Scanner(System.in);
                userAnswers[i] = sc.nextInt();
                setUserPoints(correctAnswers[i], userAnswers[i]);
               
        }
        //System.out.println("You made " +userPoints + " points");
        replay(nrOfQuestion);
    }
    
   private void setNrOfQuestion(int nrOfQuestion){
       nrOfQuestion = nrOfQuestion;
   }
   
    public int getNrOfQuestion(){
        return nrOfQuestion;
    }
    
    private int getRandom(){
        int getRandom = (int) (Math.random()*99+1);
        return getRandom;
    }
    
    private int correctAnswer( int nrOne, int nrTwo){
        int correctAnswer = nrOne + nrTwo;
        //System.out.println("corectAnswer is: " +  correctAnswer);
        return correctAnswer;
    }
    
    private void setUserPoints(int correctAnswer, int userAnswer){
       // System.out.println("Corect answer is: " + correctAnswer + " Your answer was: " + userAnswer);
        if(correctAnswer == userAnswer){
            
            userPoints += 10;
        }
    }

   private void replay(int nrOfQuestion){
        for(int i=0; i<nrOfQuestion; i++){
            System.out.println( "Question: " + firstNumbers[i] +" + " +secondNumbers[i] + " = " + correctAnswers[i]+ " your answer " + userAnswers[i]);
        }
        System.out.println("You have scored: " + userPoints + " points");
     System.exit(1);
   }
    
}
