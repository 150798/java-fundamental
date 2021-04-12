package belajarMandiri;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class cobaMap {
	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put("1", "Yona");
		hMap.put("2", "Astika");
		hMap.put("3", "Bernadetha");
		
		System.out.println(hMap);
		

		System.out.println("Total hashMap adalah" +hMap.size());
		
		System.out.println("------------------------------");
		
		Object obj = hMap.remove("2");
		System.out.println(obj + "Dihapus dari HashMap");
		System.out.println("Total HashMap adalah" +hMap.size());
		System.out.println(hMap);
		
		System.out.println("------------------------------");
		
		hMap.clear();
		System.out.println("Total hashMap" +hMap.size());
	}
}
