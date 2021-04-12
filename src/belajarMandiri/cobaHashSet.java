package belajarMandiri;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class cobaHashSet {
	public static <E> void main(String[] args) {
		Set coba = new HashSet<>();
		
		coba.add("Yona");
		coba.add("Astika");
		coba.add("Bernadetha");
		coba.add("Yona");
		
		System.out.println(coba);
		
		Iterator<String> iterator = coba.iterator();
		
		while (iterator.hasNext()){
			System.out.println(iterator.next().toUpperCase() + "");
		}
	}

}
