package Array;

public class Subtraction_Array {

	public static void main(String[] args) {
		int[][] a={{3,5,6},{7,8,1},{5,4,2}};
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};

		int[][] c=new int[3][3];
		System.out.println("Subtraction of array : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
