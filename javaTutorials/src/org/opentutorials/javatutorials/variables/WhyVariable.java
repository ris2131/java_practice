package org.opentutorials.javatutorials.variables;

public class WhyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<int> ������
		int a;
		a =1;
		System.out.println(a+1);//2
		a = 2;
		System.out.println(a+1);//3
		//<double> �Ǽ���
		double b;
		b = 1.1;
		System.out.println(-b);
		//<String> ���ڿ�
		String c;
		c = "���μ�";
		//error a = "���μ�" ������ �ȵȴ�.
		String d = "�߻��� ����"; // ����� �Ҵ� ���� �翬�� ��.
		System.out.println(c+d);//���ڿ��� ���� + ����(== �񱳵� ����)
		
		boolean TF = true;
		
	}
}
