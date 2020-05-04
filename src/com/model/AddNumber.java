package com.model;

public class AddNumber {
	int res=1;
	public int Add_Digit(int n)
	{
		for(int i=1;i<=n;i++)
			{
				System.out.println(i);
				res=res*i;			
			}
		return res;
	}
}
