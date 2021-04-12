package modifier;

public class Person {
	//variabel
	public String fname;
	public String lname;
	public Alamat alamat = new Alamat();
	private int tahunLahir;
	
	//constructor
	public Person(String fname, String lname, Alamat alamat, int tahunLahir) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.alamat = alamat;
		this.tahunLahir = tahunLahir;
	}

	public Person() {
		super();
	}
	
	
	//method
	public String fullName() {
		return this.fname + " " + this.lname;
		
	}

	public int getTahunLahir() {
		return tahunLahir;
	}

	public void setTahunLahir(int tahunLahir) {
		this.tahunLahir = tahunLahir;
	}
	
}
