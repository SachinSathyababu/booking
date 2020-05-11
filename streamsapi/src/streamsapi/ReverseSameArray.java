package streamsapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseSameArray {

	public static void main(String[] args) {
		
		int[] a= new int[] {2, 3, 4, 5, 6, 7, 8 ,9};
		
		int len= a.length;
		
		len=len-1;
		
		for(int i=0; i<=len/2; i++) {
			
			int temp=a[i];
			a[i]=a[len-i-1];
			a[len-i-1]= temp;
			
		}

		IntStream s=  Arrays.stream(a);
		
		s.forEach(e-> System.out.println(e));
	}

}
