package generic;

import java.util.ArrayList;

//GENERIC CLASS : class yg bisa diisi dengan berbagai
public class GenericTest {
	
	//<T> untuk nunjukin generic classnya
	//<T>
	public static <T> void printArray(T[] elementInput) {
		for (T element : elementInput) {
			System.out.printf("%s \n", element);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] intArray = {1,2,3,4,5};
		String[] stringArray = {"A", "B", "C"};
		Wilayah[] arrayWilayah = {new Wilayah("Jawa Tengah"), new Wilayah("DKI")};
		Wilayah wilayah = new Wilayah("Jawa Barat");
		String[] newWilayah = {new Wilayah("Prov A").getProvinsi() };
		
		
		printArray(intArray);
		System.out.println();
		printArray(stringArray);
		System.out.println();
		printArray(arrayWilayah);
	}
}
