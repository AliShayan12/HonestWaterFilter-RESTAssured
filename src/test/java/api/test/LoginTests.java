package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.LoginEndPoints;
import api.payload.TechnicianCredentials;
import io.restassured.response.Response;

public class LoginTests {
	
	TechnicianCredentials LoginTechnicianPayload;  //creating variable of POJO class
//	TechnicianCredentials LoginTechnicianPayload = new TechnicianCredentials(); //creating object of POJO class and initializing
	// created variable like in line 14 not like in line 15 because I'll use the variable in different method so created it globally.
	
	@BeforeClass
	public void LoginData() {
			
		LoginTechnicianPayload = new TechnicianCredentials();
		
		String Email = "emmastone@yopmail.com";
		String password = "123qwerty@";
		
		LoginTechnicianPayload.setEmail(Email);
		LoginTechnicianPayload.setPassword(password);	
	}
	
	
	@Test
	public void LoginTechnicianTest() {
		
		Response resFromLoginEndPointClass = LoginEndPoints.LoginTechnician(LoginTechnicianPayload);  
		//LoginEndpoints is class and we're calling the method loginTechnician and passing the payload in it
		
//		System.out.println(LoginTechnicianPayload.getEmail());
		
		resFromLoginEndPointClass.then().log().all();
		
		String token = resFromLoginEndPointClass.getHeader("Authorization");
		System.out.println("TOKEN IS " +token);
		
		Assert.assertEquals(resFromLoginEndPointClass.getStatusCode(), 200);
	}
	
}
