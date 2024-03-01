package api.endpoints;

public class Routes {
	
	public static String BaseURL = "https://honestwater.clustox.com/api/v1";
	
	//Register Technician
	public static String Register = BaseURL+"/register";
	
	//Login Technician
	public static String Login =  BaseURL+"/users/sign_in";
	
	//GetProfile Technician
	public static String getProfile = BaseURL+"/getProfile";
	
	//Update Technician Profile
	public static String UpdateProfile = BaseURL+"/updateProfile";
	
	//SOS 
	public static String SOS = BaseURL+"/sendSOSData";
	
	//RMAs
	public static String RMA = BaseURL+"/sendWarenty";
	
	//Help 
	public static String Help = BaseURL+"/getHelpData";
	
	//SystemDetails - Used in submit install
	public static String SystemInstalledInInstall = BaseURL+"/systemDetails";
	
	//All products -used in RMAs and all Products
	public static String AllProducts = BaseURL+"allProduct";
	
	//leaderBoard -- used when an install is submitted
	public static String SubmitInstall = BaseURL+"/leaderBoard";
	
	//View leader Board
	public static String ViewLeaderboard = BaseURL+"/leaderBoardRankView";
	
	//Forgot Password 
	public static String ForgotPassword = BaseURL+"/forgotPassword";
	
	
	
	
	
	
}
