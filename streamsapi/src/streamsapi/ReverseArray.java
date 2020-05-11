package streamsapi;

public class ReverseArray {

	public static void main(String[] args) {


		int[] a= {1, 7, 5, 3, 6, 0};

		int[] b= new int[a.length];
		
		int j=0;
		
		for (int i=a.length-1; i>=0;i--) {
			
			//System.out.println(a[i]);
			
		}
		
		for (int i=a.length-1; i>=0;i--) {
			

			b[j]= a[i];
			
			j++;
			
		}
		
		for (int i=0; i<=a.length-1;i++) {
			
			System.out.println(b[i]);
			
		}

	}

}
