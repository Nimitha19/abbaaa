package arrary;

import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("enter the number");
		int a= s.nextInt();
		int b=1;
		for(int i=a;i>=1;i--) {
			b=b*i;
		}
		System.out.println(b);
}}