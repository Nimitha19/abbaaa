package arrary;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j[]= {1,1,1,1,1,1};
		int k=0;
		int e=0;
		for(int i=0;i<j.length;i++) {
				 if(j[i]%2==0) {
					 k+=j[i];
			}
				 else {
					 e+=j[i];
				 }
		}
		System.out.println(k);
		System.out.println(e);
		}

	

}
