package com.ttny.amazon;

import java.util.Arrays;

public class Testarray{
	public static void main(String[]args) {
		
		int[]a=new int[5];
		
		a[0]=12;
		a[1]=32;
		a[2]=43;
		a[3]=54;
		a[4]=87;
		
	     
int sum=a[0]+a[1]+a[2]+a[3]+a[4];
int min=Arrays.stream(a).min().getAsInt();

int max=Arrays.stream(a).max().getAsInt();

System.out.println(a.length);
System.out.println(sum);
System.out.println(a[2]);
System.out.println(min);
System.out.println(max);


	
		
	
		
		
		
		
		
		
		
	
	
	}

}
