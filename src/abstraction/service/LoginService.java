package abstraction.service;

public interface LoginService {
	//merupakan method abstract
	public void login(String username, String password);
	public void failedLogin();
	
	//default method --dengan body--opsional
	default void setToken(String token) {
		System.out.println("Token created :" + token);
		forgotPassword(token);
	}
	
	//static default method -- dengan body
	static void forgotPassword(String newPassword) {
		System.out.println("Created new password" + newPassword);
	}
	
	

}
