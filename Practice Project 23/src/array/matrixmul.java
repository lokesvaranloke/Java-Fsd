package array;

public class matrixmul {

	public static void main(String[] args) {

		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;

		int[][] a1 = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] a2 = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		

		int r[][] = new int[r1][r2];

		int sum=0;
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						r[i][j] = r[i][j] + a1[i][k] * a2[k][j];
					}
				}
			}
		for(int i=0;i<r1;i++) {
			for (int j=0;j<c2;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}
