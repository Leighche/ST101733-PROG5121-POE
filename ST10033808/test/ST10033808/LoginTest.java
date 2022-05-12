/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ST10033808;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 *
 * @author Hp
 */
public class LoginTest {
    
    public LoginTest() {
    }
    //unit testing as per poe
Login Login = new Login();

    @Test
    public void testcheckUserNameAppropiate() {
    
    boolean ActualOutcome = Login.checkUserName("Kyl_1");
    assertTrue(ActualOutcome);
    }
    
    @Test 
    public void testcheckUserNameInappropiate()
    {
        boolean ActualOutcome = Login.checkUserName("Kyl!!!!!!!");
  assertFalse(ActualOutcome);
    }
   
    @Test
  public void testcheckPasswordComplexityAppropriate()
  {
  boolean ActualOutcome = Login.checkPasswordComplexity("Ch&&sec@ke99!");
  assertTrue(ActualOutcome);
  
  }
    @Test
    public void testcheckPasswordComplexityInappropriate(){
        boolean ActualOutcome = Login.checkPasswordComplexity("password");
  assertFalse(ActualOutcome);
    }
  @Test
  public void testloginUserInppropiate(){
      boolean ActualOutcome = Login.loginUser("Kyl!!!!!!!" ,"Kyl!!!!!!!","" , "", "password", "password");
  assertFalse(ActualOutcome); 
  
    }
    @Test
  public void testloginUserAppropiate(){
      boolean ActualOutcome = Login.loginUser("Kyl_1" ,"Kyl_1","Leighche","Jaikarran", "Ch&&sec@ke99!", "Ch&&sec@ke99!")==false;
  assertTrue(ActualOutcome); 
      
}
}
//code attribution:
//Farrell, J. 2019. Java Programming. 9th edition. 2019. Course Technology, Cengage Learning