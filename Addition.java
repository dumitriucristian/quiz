/*
 *@Author  Cristian Dumitriu
*Add two numbers
*calculate rate of success
 */
package quiz;

import java.util.Scanner;
 

public class Addition {
    
    
    private int[] firstNumbers ;
    private int[] secondNumbers;
    private int[] correctAnswers;
    private int[] userAnswers;
    private int userPoints;
    private int nrOfQuestion;
    private int nrOfCorrectAnswers;
    private double additionRatings;
    
    public Addition( int nrOfQuestion){
        
       this.nrOfQuestion = getNrOfQuestion(); 
       this.firstNumbers = new int[nrOfQuestion];
       this.secondNumbers =new int[nrOfQuestion];
       this.correctAnswers = new int[nrOfQuestion];
       this.userAnswers = new int[nrOfQuestion];
       this.nrOfCorrectAnswers =getNrOfCorrectAnswers();
       this.additionRatings = getAdditionRatings();
    
        runQuiz( nrOfQuestion);
        
    }
   //run quiz 
   private void runQuiz(int nrOfQuestion){
            //for each question 
            for(int i=0; i<nrOfQuestion; i++){
              //generate first number
               firstNumbers[i]=getRandom();
               //generate second number
               secondNumbers[i]=getRandom();
               //generate the correct answer
               correctAnswers[i] = correctAnswer( firstNumbers[i],secondNumbers[i]);
               
               //ask the question
                System.out.println("What is the sum of:" +firstNumbers[i] +" + "+ secondNumbers[i]);
                
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
   
   private void setAdditionRatings(int nrOfCorrectAnswers, int nrOfQuestion){

        additionRatings = nrOfCorrectAnswers * 100 / nrOfQuestion ;
   }
   
   public double getAdditionRatings(){
       System.out.println("test");
       return additionRatings;
   }
   
   //increment nr of correct answers
   private void setNrOfCorrectAnswers( ){

       nrOfCorrectAnswers += 1;
   }
   public int getNrOfCorrectAnswers(){
       return nrOfCorrectAnswers;
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
    //if is a correct answer add 10 points to user
    private void setUserPoints(int correctAnswer, int userAnswer){
       // System.out.println("Corect answer is: " + correctAnswer + " Your answer was: " + userAnswer);
        if(correctAnswer == userAnswer){
            
            userPoints += 10;
      
          setNrOfCorrectAnswers();
        }
    }
    
/**
 *  Replay each question with correspondent response
 */  
   private void replay(int nrOfQuestion){
        for(int i=0; i<nrOfQuestion; i++){
            System.out.println( "Question: " + firstNumbers[i] +" + " +secondNumbers[i] + " = " + correctAnswers[i]+ " your answer " + userAnswers[i]);
        }
        System.out.println("You have scored: " + userPoints + " points");
     
   }
    
}
