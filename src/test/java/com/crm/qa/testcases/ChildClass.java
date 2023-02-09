package com.crm.qa.testcases;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {
	int i;
	
	ChildClass(){
		i=5;
		
		System.out.println("child class constructor");
		
	}
	
	
	@Test
	public void m1() {
		System.out.println("m1 method");
	}
	
//	public int m2() {
//		System.out.println("m2 method");
//		return 10;			
//	}

}
