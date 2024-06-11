package Array;

public class Two_Matrix_Same_Or_Not {

	public static void main(String[] args) {
		int row1,col1,row2,col2;
		boolean flag=true;
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		
		row1=a.length;
		col1=a[0].length;
		
		row2=b.length;
		col2=b[0].length;
		
		if(row1 != row2 || col1 != col2) {
			System.out.println("Matrices are not equal");
		}
		else {
			//for(int i=0<row1)
		}
		System.out.println(col1);

	}

}
