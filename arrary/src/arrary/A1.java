package arrary;

public class A1 {

	public static void main(String[] args) {
		int num=1;
		char ch='a';
		for(int r=1;r<=5;r++)
		{
			System.out.print(ch++);
		
			for(int c=1;c<=5;c++) {
				if(c==2||c==3)
				{
				System.out.print(num++);
			}
				else {
					System.out.print(ch++);
				}
}
			System.out.println();			
			}
		
		}
	}
