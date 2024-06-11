package Array;

public class AscendingArray {

	public static void main(String[] args) {
		int[] array=new int[] {8,5,2,9,76};
		int temp = 0;
		System.out.print("Array elements before ascending : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j])
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			
		}
		System.out.print("Array elements after ascending : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
