package Array11_20;

public class No_Of_Elements_In_Array {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5};
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			count++;
		}
		System.out.println("Number of elements present in array : "+count);

	}

}
