package arrary;

public class Patrren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
		if(i==1|| i==3) {
			for(int j=1;j<=5;j++) {
			System.out.print(j);
			
		}
			System.out.println();
		}
		else {
			if(i%2==0) {
				for(char c='A';c<='E';c++) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
		}
	}
}
