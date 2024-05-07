import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int count = 0;
		
		for(int i=0; i<H; i=i+N+1) {
			for(int j=0; j<W; j=j+M+1) {
				count++;
			}
		}
		System.out.println(count);

	}
}