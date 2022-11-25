package arrary;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {10,1,3,99,101};
		int largest=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>largest) {
				largest=b[i];
			}
		}
		System.out.println(largest);
	}
} 
