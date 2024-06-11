package Array;

public class Odd_Position_Elements {

	public static void main(String[] args) {
		int[] a= new int[]{45,43,32,98,9,65,8};
		System.out.print("Odd position elements are : ");
		for(int i=0;i<a.length;i=i+2) {
			
				System.out.print(a[i]+" ");
			
		}

	}

}
