import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// 25,10,5,1 개수
		Scanner scanner = new Scanner(System.in);
		int[] money = new int[4];
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		int T = scanner.nextInt();
		for(int i=0; i<T; i++) {
			int C = scanner.nextInt();
			money[0]=C/quarter;
			C%=quarter;
			money[1]=C/dime;
			C%=dime;
			money[2]=C/nickel;
			C%=nickel;
			money[3]=C/penny;
			C%=penny;
			for(int j=0; j<4; j++) {
				System.out.print(money[j] + " ");
			}
			System.out.println();
		}
		
	}
}