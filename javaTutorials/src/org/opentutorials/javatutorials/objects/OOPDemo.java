package org.opentutorials.javatutorials.objects;
//OOP
//compare with methodization and think yourself why this is new programming paradigm.

class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;//this designates Calculator class. so this line means you put parameter 'left' to variable left that exists in Calculator class 
		this.right = right;
	}
	public void printSum() {
		System.out.print("sum : ");System.out.println(left+right);
	}
	public void printAvg() {
		System.out.print("Avg : ");System.out.println((left+right)/2.0);
	}
	public void printAll() {
		printSum();
		printAvg();
		
	}
}


public class OOPDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(); // making new object!
		c1.setOperands(1, 2);
		//c1.printSum();
		//c1.printAvg();
		c1.printAll();
		
		Calculator c2 = new Calculator(); // making new object!
		c2.setOperands(15, 25);
		c2.printSum();
		c2.printAvg();
		c2.printAll();
	}
	
}
