package org.opentutorials.javatutorials.variables;

public class WhyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<int> 정수형
		int a;
		a =1;
		System.out.println(a+1);//2
		a = 2;
		System.out.println(a+1);//3
		//<double> 실수형
		double b;
		b = 1.1;
		System.out.println(-b);
		//<String> 문자열
		String c;
		c = "류인석";
		//error a = "류인석" 같은건 안된다.
		String d = "잘생긴 남자"; // 선언과 할당 같이 당연히 됨.
		System.out.println(c+d);//문자열의 연산 + 가능(== 비교도 가능)
		
		boolean TF = true;
		
	}
}
