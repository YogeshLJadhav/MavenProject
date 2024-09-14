package First_package;

import org.testng.annotations.Test;

public class LoginPage {
  @Test
  public void Email() {
	  System.out.println("User login with email id");
	  
  }
 public void MobileNo() {
	 System.out.println("user otp send with mobile no"); 
  }
 public void Submit() {
	  System.out.println("user able to click on submit button");
 }
}
