package tugas5;

import java.util.List;

public abstract class OrderList {
	
	void receiptPembayaran(List<Struck> struck, double total, double bayar) {
		for (Struck isi : struck) {
			System.out.println(isi.getMenu() + " " + isi.jumlah + " " + isi.harga);
			
		}
		System.out.println("Total Harga	: " + total);
		System.out.println("Bayar		: " + bayar);
		System.out.println("Kembali		:" + (bayar-total));
	}

}
