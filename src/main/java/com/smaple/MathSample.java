
package com.smaple;

public class MathSample {
	
	
	public static int sum(int a,int b) {
		
		return a+b;
	}
	public static int subdev1(int a,int b) {
		if(a>b) {
			return a-b;
		}
		return b-a;
	}
	public static void main(String ...arg) {
		
		System.out.println("Hi");
		System.out.println("Hi " + sum(10,20)) ;
		System.out.println("Hi " + subdev1(10,20)) ;
		
	}
	
}