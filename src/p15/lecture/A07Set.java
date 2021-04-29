package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	// Set 순서 없고(index 가 없다!) , 중복 불가
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(8);
		set.add(2);
		
		System.out.println(set.size());  // 결과: 3
		
		set.add(9);
		System.out.println(set.size()); // 여전히: 3
		
		boolean c = set.contains(9); //contatis 는 booleadn type return : true or false
		System.out.println(c);
		System.out.println(set.contains(3)); //<-한줄로 확인하는 코드
		
		set.remove(9);
		System.out.println(set.size());
		
		// set.get(2);  // 불가하다 <-- index 가 없다 
		
		set.add(9);
		set.add(3);
		set.add(2);
		
		System.out.println(set.size());
		Iterator<Integer> iter = set.iterator();  

		Integer i1 = iter.next();
		Integer i2 = iter.next();
		Integer i3 = iter.next();
		Integer i4 = iter.next();
		
		while (iter.hasNext()) {
			Integer n = iter.next();
		}

		
		
	}
}
