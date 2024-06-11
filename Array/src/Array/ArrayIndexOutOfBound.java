package Array;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] a=new int[] {4,5,7,8,1,2};
		System.out.print("ArrayIndexOutOfBoundException");
		for(int i=0;i<=a.length;i++) {
			System.out.print(a[i]);
		}

	}

}
