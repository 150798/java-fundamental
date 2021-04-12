package abstraction;

import abstraction.RegistrationAbstract;

public class Registration extends RegistrationAbstract {
	
	@Override
	public void setUser(String username) {
		// TODO Auto-generated method stub
		System.out.println("User admin created" + username);
	}
	
	private void setRole() {
		// TODO Auto-generated method stub

	}

}
