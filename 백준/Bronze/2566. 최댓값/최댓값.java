import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [][] arr = new int[9][9];
		int max = 0;
		int firstIndex = 0;
		int secondeIndex = 0;
		
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					firstIndex = i+1;
					secondeIndex = j+1;
				}
			}
		}
		
		System.out.println(max);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == max) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }


	}
}