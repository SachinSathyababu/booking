package streamsapi;

import java.util.ArrayList;

public class StringReversal {

	public static void main(String[] args) {


		/*String s="SACHIN IS MY NAME";
		
		String r="";
		
		char[] c= s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--) {
			
			r=r+c[i];
		}
		
		System.out.println("Reverse String is "+r);*/

		
		String s="SACHIN IS MY NAME";
		
		String[] a= s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			char[] c=a[i].toCharArray();
			a[i]="";
			for(int j=c.length-1; j>=0; j--) {
				
				a[i]=a[i]+c[j];
			}
			
			System.out.print(a[i]+" ");
		}
		
	}

}
