package Array;

public class AnnonomusArray {
	
	public static void printAnnArray(int arr[]) {
		System.out.print("Annonumous array elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		printAnnArray(new int[] {3,4,5,6});

	}

}
