package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {
	public void listTesting() {
		//instansiasi objek
		String[] buah1 = {"mangga", "jambu", "apel"};
		List<String> makanan = new ArrayList<>();
		//membuat objek makanan yg bentuk objeknya si List,
		//yang isinya diisikan dari ArrayList
		//Semua fungsi yg ada di list
		//parennta Listnya
		//Anaknya si ArrayListnya itu
		//List itu interfacenya, arraListnya implementnya
		
		List<String> minuman = new ArrayList<>(Arrays.asList("air", "soda"));
		List<String> buah = new ArrayList<>(Arrays.asList(buah1));	
		
		makanan.add("Nasi");
		makanan.add("Nasi goreng");
		makanan.add("Ayam bakar");
		makanan.add("Jagung");
		
		//tambah data berdasarkan index
		makanan.add(1,"Mie Goreng");
		System.out.println("Setelah ditambah mie goreng" +makanan);
		
		System.out.println("Ukuran array :" + makanan.size());
		
		//index value of
		System.out.println("\nPosition :" +makanan.indexOf("Jagung"));
		//sorting
		Collections.sort(makanan);
		System.out.println("Sorted" +makanan);
		
		
		//TAMPILKAN ARRAY	
		System.out.println("--------Tampilan Array-------");
		System.out.println("Makanan" + makanan);
		System.out.println("\nMinuman" + minuman);
		System.out.println(buah);
		
		
		//MENGHAPUS DATA
		//By index
		makanan.remove(1);
		System.out.println("Setelah dihapus index ke 1" + makanan );
		//By value
		makanan.remove(minuman);
		System.out.println("\nHapus minuman" +makanan);
		
		
		//TAMPILKAN DATA
		
//		for(String elemen : minuman) {
//			System.out.println(elemen);
//		}
//		System.out.println("---------------");
//		
//		for(String elemen : makanan) {
//			System.out.println(elemen);
//		}
		
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.listTesting();
	}

}
