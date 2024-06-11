package Array;

public class TestArray {

	public static void main(String[] args) {
		int[] a1=new int[5];
		a1[0]=12;
		a1[1]=3;
		a1[2]=4;
		a1[3]=8;
		a1[4]=45;
		//[5]=8;
		System.out.print("Array elements are : ");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}

	}

}
