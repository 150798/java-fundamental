package abstraction;

public abstract class  RegistrationAbstract {
	public abstract void setUser(String username);
	
	void setRole(String role) {
		System.out.println("role created : " + role);
	}
	static void setLevel(Integer level) {
		System.out.println("Level :" +level);
	}

}
