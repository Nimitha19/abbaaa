package arrary;
import java.util.Scanner;

public class n {
	public int m1 (int num) {
		int product=1;
		while(num!=0) {
			int lastno=num%10;
			product=product*lastno;
			num=num/10;
		}
		return product ;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int m=s.nextInt();
		n a1=new n();
		int result=a1.m1(m);
		System.out.println(result);
	
}}
		