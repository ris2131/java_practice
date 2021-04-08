package org.opentutorials.javatutorials.objects;

public class methodization {
	//OOP
	public static void printSum(int left, int right) {
		System.out.println("Sum : " + (left+right));		
	}
	public static void printAvg(int left, int right) {
		System.out.println("Avg : " + ( (double)(left+right)/2 ));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a = 1;
		b = 2;
		System.out.println(a+b);
		printSum(a,b);// ÀÌ°Å 
		printAvg(a,b);
	}

}
