package Array;

public class LargestElement {

	public static void main(String[] args) {
		int[] array=new int[] {1,6,3,8,9,2};
		for(int i=0;i<array.length;i++) {
			if(array[i]>array[0]) {
				array[0]=array[i];
			}
		}
		System.out.println("Largest elementof the array is : "+array[0]);

	}

}
