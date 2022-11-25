package arrary;
import java.util.Scanner;

public class A9 {
	public static int A(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			//fact=1;
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int num=s.nextInt();
		int value=A9.A(num);
		System.out.println(value);
	}
	}


