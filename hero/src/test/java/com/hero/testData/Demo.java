package com.hero.testData;

public class Demo {

	
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "123";
		int len = name.length()-1;
		String rev ="";
		for(int i=len;i>=0;i--)
		{
			rev = rev+name.charAt(i);
			
		}
		System.err.println(rev);
	}

}
