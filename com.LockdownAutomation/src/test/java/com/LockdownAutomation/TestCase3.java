package com.LockdownAutomation;

import org.testng.annotations.Test;

public class TestCase3 {

	@Test
	public void sum(){
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		
		
	}
	@Test
	public void mul(){
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=a*b;
		System.out.println("mul:"+c);
	}
		
		@Test
		public void sub(){
			// TODO Auto-generated method stub
			int a=10,b=20,c;
			c=a-b;
			System.out.println("mul:"+c);
		}
			@Test
			public void div(){
				// TODO Auto-generated method stub
				int a=10,b=20,c;
				c=a/b;
				System.out.println("mul:"+c);
		
		
	}
	
}
