/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;
/**
 *
 * @author chrishagedorn
 */
public class Model {
    
    private int theNumber;
    private String status;
    
    void newGame(){
        Random r = new Random();
        theNumber = r.nextInt(100) + 1;
        status = "Welcome! Please enter your first guess!";
    
    }
    
    void processUserGuess(int guess){
        status = "You guessed " + guess + ". ";
        
        if (guess > theNumber){
            status += "Your guess was too high!";
        
        }
        else if (guess < theNumber){
            status += "Your guesss was too low!";
        
        }
        else {
            status += "You guessed correctly!";
        
        }
    
    }
    
    String getStatus() {
        return status;
    
    
    }
}

