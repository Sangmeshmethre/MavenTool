package com.nt.prepartion;

import com.nt.service.ArthmeticOpartions;

public class StudentOperation {
	
	public static void main(String[] args) {
		
		System.out.println("=======From Module2===========");
		ArthmeticOpartions ar = new ArthmeticOpartions();
		System.out.println("Sum of::"+ar.sum(100, 200));
	}

}
