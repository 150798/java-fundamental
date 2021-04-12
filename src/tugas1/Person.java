package tugas1;

public class Person {
	//variabel
	public String fname;
	public String lname;
	public String domisili;
	public int tahunLahir;
	public int usia;
	public Pendidikan pendidikan = new Pendidikan();
	
	//constructor, menu default yg dipanggil ketika objek dipanggil kelas lain.
	public Person(String fname, String lname, String domisili, int tahunLahir, Pendidikan pendidikan) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.domisili = domisili;
		this.tahunLahir = tahunLahir;
		this.pendidikan = pendidikan;
		
	}
	
	public Person() {
		super();
	}

	//method
	public String fullname() {
		return this.fname + " " + this.lname;
	}

	public int getTahunLahir() {
		return tahunLahir;
	}

	public void setTahunLahir(int tahunLahir) {
		this.tahunLahir = tahunLahir;
	}

	public int getUsia() { 
		return usia;
	}

	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	
	
		

}
