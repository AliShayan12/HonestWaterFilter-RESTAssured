package api.endpoints;

import static io.restassured.RestAssured.*;
import api.payload.TechnicianCredentials;
import io.restassured.response.Response;

public class LoginEndPoints {
	
	//Technician is a POJO class and we're creating object of it
	public static Response LoginTechnician(TechnicianCredentials LoginPayload) {
		 
		Response resBodyOfLogin = given()
				.contentType("application/json")
				.body(LoginPayload)
		
		.when()
			.post(Routes.Login); //here we're getting the URL from routes.java
		
		return  resBodyOfLogin;
		
	}

}
