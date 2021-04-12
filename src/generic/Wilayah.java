package generic;

//kelas wilayah yg bisa diinput wilayahnya
public class Wilayah {
	private String provinsi;
	
	public Wilayah(String provinsi) {
		this.provinsi = provinsi;
	}
	
	public String getProvinsi() {
		return this.provinsi;
	}
	
	@Override
	//to string metode yg kita ambil, jadi sbnrnya ini adalah turunan
	//ini supaya file java dijalankan, metode2nya jalan
	//ini dioveride supaya ngebaca setiap alamat
	//
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return this.provinsi;
	}

}
