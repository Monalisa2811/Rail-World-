package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Number of array element : ");
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		
		System.out.println("Enter the searching element : " );
		int b=scn.nextInt();
		Arrays.sort(a);
		int l=0,r=n-1;
		while(l<=r) {
			int m;
			m=(l+r)/2;
			if(m==b) {
				System.out.println("Our search element is : "+b);
				break;
			}	
			else if(a[m]>b)
				l=m+1;
			else
				r=m-1;
		}
		

	}

}
