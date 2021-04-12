package inheritance;

public class Student extends Person2 {
	private int sks;
	private String mataKuliah;

	public Student(String fname, String lname) {
		super(fname, lname);
		// TODO Auto-generated constructor stub
		this.sks = sks;
		this.mataKuliah = mataKuliah;
	}

	public int getSks() {
		return sks;
	}
	
//	public int getSks(String a, int b) {
//		return sks;
//	}
//	
//	public int getSks(int b, String a) {
//		return sks;
//	}
	
	

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}
	
	//method
	public int hitungSks(String mataKuliah) {
		return this.sks++;
	}
	
	public void getStudentData() {
		System.out.println("Jumlah Sks : " + getSks());
//		System.out.println("Jumlah Makul : " + getMataKuliah());
		
	}
	
	@Override
	public String getFullname() {
		if(this.sks>3) {
			return "Prof" + super.getFullname();
		}else {
			return super.getFullname();
		}
	}
	

}
