
package com.smaple;

public class MathSample {
	
	
	public static int sum1(int a,int b) {
		
		return a+b;
	}
	public static int subdev1(int a,int b) {
		if(a>b) {
		   return a-b>0 ? a-b : 0; // offline
		}else{
		   return b-a;	
		}
		
	}
	public static void main(String ...arg) {
		
		System.out.println("Hi");
		System.out.println("Hi " + sum1(10,20)) ;
		System.out.println("Hi " + subdev1(10,20)) ;
		
	}
	
}
