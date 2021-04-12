package abstraction.service;

import abstraction.RegistrationAbstract;

public class LoginImpl extends RegistrationAbstract implements LoginService{
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void failedLogin() {
		// TODO Auto-generated method stub
		System.out.println("Login gagal");
		
	}
	@Override
	public void setUser(String username) {
		// TODO Auto-generated method stub
		//berasal dr registrasi abstract
		System.out.println("User Created" +username);
	}
	
	@Override
	public void setToken(String token) {
		// TODO Auto-generated method stub
		LoginService.super.setToken(token);
	}
	
	
}
