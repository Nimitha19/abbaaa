package arrary;
import java.util.Scanner;
public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("enter the size");
		int size = s.nextInt();
		int ecout=0; int ocount=0;
		int a[]=new int[size];
		System.out.println("enetr the values");
		for(int i=0;i< a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("the values are");
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 System.out.println(a[i]);
				 ecout++;
			 }else {
				 ocount++;
			 }
			 
			 }
		 System.out.println(ecout);
		 System.out.println(ocount);
	}

	}


