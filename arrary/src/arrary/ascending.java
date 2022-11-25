package arrary;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,2,9,0};
		for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int tempo=a[i];
					a[i]=a[j];
					a[j]=tempo;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

		}