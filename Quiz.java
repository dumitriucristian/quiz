/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author web
 */
import java.util.Scanner;

public class Quiz {
    
    //setting default value for nr of question 
    private int nrOfQuestion;
    private int userPoints = 0 ;
   
    
    //default quiz with no params has 5 question
    public Quiz(){
        int nrOfQuestion = 5;
        new Addition(nrOfQuestion);
    }
    
    //quiz with different nr of question
    public Quiz(int nrOfQuestion){
        //set nr of question;
        this.nrOfQuestion = getNrOfQuestion();
        new Addition(nrOfQuestion );
    }
    
    //question setter
    private void setNrOfQuestion(int nrOfQuestion){
          this.nrOfQuestion = nrOfQuestion;
    }
    
    //question getter
    public int getNrOfQuestion(){
        return  nrOfQuestion;
    }
    
    
        
    
       
}
