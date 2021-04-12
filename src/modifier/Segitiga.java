package modifier;

public class Segitiga {
	//variabel
	public int alas;
	public int tinggi;
	public int luas;
	
	//constructor
	public Segitiga() {
		
	}
	//inisialisasi datanya dr constructor
	public Segitiga(int alas, int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	
	//create method
	public int hitungLuas() {
		luas = alas * tinggi / 2;
		return luas;
	}
	
	public void drawSegitiga() {
		System.out.println("Ini adalah segitiga");
	}
	

}
