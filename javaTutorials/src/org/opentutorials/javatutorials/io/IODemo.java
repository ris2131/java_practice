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
		//자바 앱이 실행 되고 있는동안 사용자의 입력을 받는법
		Scanner sc = new Scanner(System.in);//요곤 그냥 다 써야하는 그런 느낌인듯
        int i = sc.nextInt();//실행 멈추고 기다리고 있다네? 여기가 scanf 같은 느낌이겠다.
        System.out.println(i*1000);
        sc.close();
        
        //scanner hasNextInt1
        Scanner sc2 = new Scanner(System.in);//요곤 그냥 다 써야하는 그런 느낌인듯
        while(sc2.hasNextInt()) {//
        	System.out.println(sc2.nextInt()*1000);
        	
        }
        sc2.close();
        */
        
        //Output by using "out.txt"
        try {
	        File file = new File("out.txt");
	        Scanner sc3 = new Scanner(file);//file 에서 가져오네
	        while(sc3.hasNextInt()) {
	        	System.out.println(sc3.nextInt()*1000);
	        }
	        sc3.close();
        }catch(FileNotFoundException e) {//예외
        	e.printStackTrace();
        }
        
        
        
        
        
	}
}
