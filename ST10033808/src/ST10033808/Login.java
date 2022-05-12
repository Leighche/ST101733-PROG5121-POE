
package ST10033808;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Login {
 
    //methods :
    //method for checking the Username and ensuring validity
    static boolean checkUserName(String EnteredUsername){
      
     boolean usernameRule =  EnteredUsername.matches(".*[a-zA-Z_].*") ;//sets the rules for when entering a username
     if(EnteredUsername.length()<=5 && usernameRule == true){//sets rules for username to be valid
     JOptionPane.showMessageDialog(null,"Username succesfully captured");//when you follow the rules ,it displays succesful username 
     return true;//this is a true statement
     }
     else if(EnteredUsername.length()>5 && usernameRule==false) {//sets the boundaries for when entering a username
        JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");}//displays error message to user
    return false;//this is a false statement
  }
    /////////////////////////space for neatness
    
    //method for checking password and ensuring validity
    static boolean checkPasswordComplexity(String EnteredPassword){
        
     boolean passwordRule = EnteredPassword.matches(".*[&@!].*");//sets the rules for when entering a username
     //if else statements
     if(EnteredPassword.length()>=8 && passwordRule == true){//sets the rules for length and what your password shoul include and makes it true
     JOptionPane.showMessageDialog(null,"Password succesfully captured"); //displays true dialog confirming their password is successfull
    return true;//this is a true statement
    }
      else{ //if anything besides the rules above where entered it will display false cause of the else statement used
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");}
    return false;//this is a false statement
    }
    ///////////////////////////
   //method required as per poe ensures the display of all false dialog
    static String registerUser(String EnteredUsername){
        
        String RegisteredOrNot;
    boolean EnteredUsernamerule = EnteredUsername.matches(".*[a-zA-Z].*");
        if(EnteredUsernamerule == false){
      RegisteredOrNot ="Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";}
      return null;
     
    }
    ////////////////////////////
    
    //method to verify the login details 
    static boolean loginUser(String EnteredUsername, String EnteredPassword, String EnteredName, String EnteredSurname ,String Username , String Password )   {//if else statements
        if(Username.equals(EnteredUsername) && Password.equals(EnteredPassword)){ //if the username entered for log in matches that of registration 
        return true;}//it is true and will display the true dialog showing users successfull login
        
        else{//if the username entered for log does not match that of registration 
            
        return false; }//displays false message 
    }
    
    static String returnLoginStatus(String EnteredUsername, String EnteredPassword, String EnteredName, String EnteredSurname, String Username , String Password){
         
        if(Username.equals(EnteredUsername) && Password.equals(EnteredPassword)){//double checks that information from registration and login are the same
            JOptionPane.showMessageDialog(null," Welcome " + EnteredName+" " + EnteredSurname + " it is great to see you again"); //displays true message if all information has been correct  
         }
        else if (Username.length()>5 && Password.length()<8){
            JOptionPane.showMessageDialog(null,"Username or Password incorrect please try again");    // if anything else does not match the rules displays false message 
         }
        return null;//used to get rid of return error
    
    }
  
}
//code attribution:
//Farrell, J. 2019. Java Programming. 9th edition. 2019. Course Technology, Cengage Learning


