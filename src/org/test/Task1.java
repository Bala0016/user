package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		List<Test> li=new ArrayList<>();
		
		System.out.println("enter the value:");
		int Int = s.nextInt();
		for (int i = 0; i <Int; i++) {
			Test t = new Test();
				t.setId(s.nextInt());
				s.nextLine();
				
				t.setName(s.nextLine());
				t.setEmail(s.nextLine());
		
				li.add(t);
			
		
			
		}
		for(Test a:li) {
			
		
		System.out.println("enter the id"+a.getId());
		System.out.println("enter the name"+a.getName());
		System.out.println("enter the email"+a.getEmail());}
		
	}

}
