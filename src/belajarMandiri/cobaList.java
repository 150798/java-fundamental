package belajarMandiri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cobaList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Yona12");
		list.add("Astika12");
		list.add("Bernadetha12");
		list.add("Bernadetha12");
		
//		System.out.println(list);
//		System.out.println("List kedua : " +list.get(1));
		
		System.out.println("Buah buahan");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object elemen = itr.next();
			System.out.println(elemen + " ");
		}
		
		
	}

}
