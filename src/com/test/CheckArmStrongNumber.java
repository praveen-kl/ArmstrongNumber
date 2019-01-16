package com.test;

import java.util.Scanner;

public class CheckArmStrongNumber {
	//num=153 =1*1*1+5*5*5+3*3*3;
	public static boolean isArmStrongNumber(int num){
	final int cubic=3;
		int cube=0;
		int temp=num;
		int rem;
		while (num>0) {
			
			rem=num%10;
			num=num/10;
			cube+=Math.pow(rem, cubic);
		}
	if(cube==temp) 
		return true;
	else
		return false;
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number= scan.nextInt();
		
		boolean result = isArmStrongNumber(number);
		
		if(result){
			System.out.println(number+" is armstrong number");
		}
		else{
			System.out.println(number+" is not armstrong number");
		}
		
	}
	

}
