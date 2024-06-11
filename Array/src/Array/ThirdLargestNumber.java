package Array;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] a= {23,21,4,45,65,86};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		
		System.out.println("After sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int a3=a[a.length-3];
		System.out.println("Third largest element is "+a3);
		

	}

}
