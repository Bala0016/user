package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Task {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Test t = new Test();
		t.setId(s.nextInt());
		s.nextLine();
		t.setName(s.nextLine());
		t.setEmail(s.nextLine());
		Test t1 = new Test();
		t1.setId(200);
		t1.setName("java1");
		t1.setEmail("abcd@123");
		
		List<Test> l = new ArrayList<>();
		l.add(t);
		l.add(t1);
		
		for(Test s1 : l) {
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getEmail());
			System.out.println("bala");
			
			
		}
		
		Map<Integer,Test> m = new HashMap<>();
		m.put(1,t);
		m.put(2, t1);
		
		Set<Entry<Integer, Test>> entrySet = m.entrySet();
		for (Entry<Integer, Test> entry : entrySet) {
			
		}
		
	}

}
