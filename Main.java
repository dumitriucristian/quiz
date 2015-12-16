/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import static java.lang.Math.random;
import java.util.Scanner;


/**
 *
 * @author web
 * 
 * 
 */
public class Main{
    
   
    public String userAnswer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        startQuiz();
      
    }
    
    public static void startQuiz(){
        
          System.out.println("How many question do you wish?");
         Scanner sc = new Scanner(System.in);
         int nrOfQuestions = sc.nextInt();
         Quiz q = new Quiz(nrOfQuestions);
         System.out.println("Do you wish a new quiz ? Yes / No");
         String userAnswer = sc.next();
        
         if( checkAnswer(userAnswer) == true ){
            startQuiz();
         }else{
             System.exit(1);
         }
         
    }
    
    public static boolean checkAnswer(String userAnswer){
        if (userAnswer.equals("yes") == true){
            return true;
        }else if(userAnswer.equals("Yes")){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
  
    
    
}
