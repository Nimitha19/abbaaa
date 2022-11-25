package arrary;
import java.util.Scanner;
public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		int a[] = new int[size];
		int count =0;
		 a[0]=10;
		 a[1]=20;
		 a[2]=50;
		 a[3]=40;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)	{
			System.out.println(a[i]);
			count++;
			}
			
		}
		System.out.println(count);
		}
}
