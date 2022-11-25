package arrary;

public class backwadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
		
			System.out.println();
	}
}}
