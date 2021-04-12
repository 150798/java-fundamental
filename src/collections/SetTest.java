package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	public void setTesting() {
		//instansiasi object
		Set<String> setNames = new HashSet<>();
		
		//menambahkan data
		//dia sifatnya unordered, makanya ga urut
		setNames.add("Yona");
		setNames.add("Astika");
		setNames.add("Bernadetha");
		setNames.add("Yona");
		
		List<String> listNames = new ArrayList<>(setNames);
		//list diisi dari set
//		listNames.addAll(setNames);
		
		//sort data
		Collections.sort(listNames);
		System.out.println("Sorted : " +listNames);
		
		//menampilkan datanya
		for (String string : setNames) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.setTesting();
	}

}
