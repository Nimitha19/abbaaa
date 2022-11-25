package arrary;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number");
		int num= s.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("prime number");
		}
		else {
			System.out.println("composite number");
		}
		}

}
