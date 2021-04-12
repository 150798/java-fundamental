package abstraction;

import abstraction.Registration;
import abstraction.service.LoginImpl;

public class Main {
	public static void main(String[] args) {
		Registration regis = new Registration();
		regis.setUser("haha");
		regis.setRole("admin");
		
		System.out.println("haha");
		
		LoginImpl login = new LoginImpl();
		login.login("testing123", "123");
		login.setUser("testing456");
		login.setToken("asdfjkl");
	}

}
