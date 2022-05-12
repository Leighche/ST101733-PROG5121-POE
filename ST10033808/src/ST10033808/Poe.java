
package ST10033808;
import javax.swing.*;
//ST10033808
//Leighche Jaikarran
        
public class Poe {

  //main
    public static void main(String[] args)
    {
        //introductory message
    JOptionPane.showMessageDialog(null,"Welcome to Easy Kanban click 'ok' to register ");
    //variables declared 
    //users are prompted to enter their details in order to register which will be stored to variables
   String  EnteredUsername = JOptionPane.showInputDialog(null," Please enter your Username");
   String EnteredPassword = JOptionPane.showInputDialog(null,"Please enter your Password");
   String EnteredName =  JOptionPane.showInputDialog(null,"Please enter your Name");
   String  EnteredSurname =  JOptionPane.showInputDialog(null,"Please enter your Surname");
    
    
    //if else statements
    //sets rules for when entering username 
    if(EnteredUsername.matches(".*[a-zA-Z_].*") &&EnteredUsername.length()<=5){
        JOptionPane.showMessageDialog(null,"Username succesfully captured");}
    //else is used so if anything besides the rules above are followed it is taken as false
    //and will print out the dialog below
    else{
       JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
       
    }
    
    //if else statements
    //sets rules for when entering a password
    if(EnteredPassword.length()>=8 && EnteredPassword.matches(".*[&@!].*")){
        JOptionPane.showMessageDialog(null,"Password succesfully captured");}
    //else is used so if anything besides the password rules above are followed it is taken as false
    //and will print out the dialog below
    else{
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");}

    
    
    //the following below means if all the password and username rules are followed
    //it will then tell the user their info has been captured
    //and proceed with the application by prompting the user again to enter the username and password used to register earlier
    if( EnteredUsername.matches(".*[a-zA-Z].*")&& EnteredUsername.matches(".*[_].*") && EnteredUsername.length()<=5 && EnteredPassword.length()>=8 && EnteredPassword.matches(".*[&@!].*")){
        JOptionPane.showMessageDialog(null,"Now that all your details are Captured please Login click 'ok' to continue");
        //new login string variable declared in order to compare to registration string variables 
        //if the login detail matches the registration details access is granted
        String Username = JOptionPane.showInputDialog(null,"Enter your Username");
        String Password = JOptionPane.showInputDialog(null,"Enter your Password");
        
      //if else statements
      //this if else statement will check if the login information matches the registration information
      // checkking if our details to log in are valid
      
    if(Username.equals(EnteredUsername) && Password.equals(EnteredPassword)){
    //if the information matches it will print the true dialog below
   JOptionPane.showMessageDialog(null," Welcome " + EnteredName+ " " + EnteredSurname + " it is great to see you again");}
           
    else{
    //if the information does not match it will print the false dialog below
   JOptionPane.showMessageDialog(null, "Username or Password incorrect please try again"); }
   
    //code attribution : 
    //Farrell, J. 2019. Java Programming. 9th edition. 2019. Course Technology, Cengage Learning
    
     
        }
    
    

    
    
    }
    }





  

            
        
        

       
        
        
       
    
    
    
    
    
    
    
    



        
   
    



    
    
    
    
     
        
            
        
        
        
        
    


        
   
            
       
        
    
    
 

                      
    
    

