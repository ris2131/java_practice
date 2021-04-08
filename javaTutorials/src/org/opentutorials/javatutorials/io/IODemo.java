package org.opentutorials.javatutorials.io;

//import package for Scanner 
import java.util.Scanner;
import java.io.*;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("argument length : "+ args.length);
		for(String e : args) {//for each
			System.out.println("argument element : "+e);
		}
		
		
		//ScannerDemo
		//�ڹ� ���� ���� �ǰ� �ִµ��� ������� �Է��� �޴¹�
		Scanner sc = new Scanner(System.in);//��� �׳� �� ����ϴ� �׷� �����ε�
        int i = sc.nextInt();//���� ���߰� ��ٸ��� �ִٳ�? ���Ⱑ scanf ���� �����̰ڴ�.
        System.out.println(i*1000);
        sc.close();
        
        //scanner hasNextInt1
        Scanner sc2 = new Scanner(System.in);//��� �׳� �� ����ϴ� �׷� �����ε�
        while(sc2.hasNextInt()) {//
        	System.out.println(sc2.nextInt()*1000);
        	
        }
        sc2.close();
        */
        
        //Output by using "out.txt"
        try {
	        File file = new File("out.txt");
	        Scanner sc3 = new Scanner(file);//file ���� ��������
	        while(sc3.hasNextInt()) {
	        	System.out.println(sc3.nextInt()*1000);
	        }
	        sc3.close();
        }catch(FileNotFoundException e) {//����
        	e.printStackTrace();
        }
        
        
        
        
        
	}
}
