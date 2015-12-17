package quiz;

import static java.lang.Math.random;
import java.util.Scanner;



public class Main{
    
   
    public String userAnswer;
 
    public static void main(String[] args) {
        
        startQuiz();
      
    }
    
    public static void startQuiz(){
        
        System.out.println("How many question do you wish?");
        try{
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
            
       }catch(Exception e){
              System.out.println("Incorrect answer. Pleas provide a number grater than 0");
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
