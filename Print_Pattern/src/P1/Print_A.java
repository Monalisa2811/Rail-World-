package P1;

public class Print_A {

	public static void main(String[] args) {
		
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0 || i == 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
