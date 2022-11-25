package arrary;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {10,1,3,99,101};
		int min=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]<min) {
				min =b[i];
			}
		}
		System.out.println(min);

	}

}
