import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [][] arr1 = new int[N][M];
		int [][] arr2 = new int[N][M];
		for (int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr1[i][j] = scanner.nextInt();
			}
		}
		for (int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr2[i][j] = scanner.nextInt();
			}
		}
		
		int [][] arr3 = new int[N][M];
		for (int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}

	}
}