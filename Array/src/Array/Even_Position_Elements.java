package Array;

public class Even_Position_Elements {

	public static void main(String[] args) {
		int[] a= {65,87,43,23,54};
		System.out.print("Even position elements are : ");
		for(int i=1;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}

	}

}
