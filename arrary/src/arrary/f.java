package arrary;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("enter the size");
		int size = s.nextInt();
		char a[]=new char[size];
		System.out.println("enetr the character");
		for(int i=0;i< a.length;i++) {
			a[i]=s.next().charAt(0);
		}
		for(int i= 0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				System.out.println(a[i]);	 
		}
			
		

	}

	}

	}
