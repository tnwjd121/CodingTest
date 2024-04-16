import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int num = 2;
		int result = 0;
		for(int i=1; i<=N; i++) {
			num += (num - 1);
		}
		result = num *num;
		System.out.println(result);
	}
}