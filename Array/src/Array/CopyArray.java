package Array;

public class CopyArray {

	public static void main(String[] args) {
		int[] array1=new int[]{23,5,8,9};
		int[] array2= new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		System.out.println("Original array elements");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i] +" ");
		}
		System.out.println();
		
		System.out.println("New array elements");
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i] +" ");
		}

	}

}
