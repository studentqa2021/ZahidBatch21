package com.practice;

public class SwapVariablepractice {
	
	public void getswap (int a , int b) {
		
		System.out.println("A value before Swap="+a);
		
		
		System.out.println("B value before Swap="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
	System.out.println("A value after Swap="+a);
		
		
	System.out.println("B value after Swap="+b);
		
	}

public static void main(String[] args) {
	SwapVariablepractice obj= new SwapVariablepractice();
	obj.getswap(5, 10);
	
}
}
