package com.mph.mvnproj;

public class Calculate {

	public int add(int... number)
	{
		int result=0;
		
		for(int i: number)
		{
			result =result+i;
		}
		
		return result;
	}
	
	public int multiply(int... number)
	{
        int res=1;
		
		for(int i: number)
		{
			res =res*i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,20,30));
		System.out.println(c.multiply(10,10));
		System.out.println(c.multiply(10,10,10));
		System.out.println(c.multiply(10,10,20,30));

	}

}
