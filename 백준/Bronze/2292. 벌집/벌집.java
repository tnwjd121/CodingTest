import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int room = 1;
		int count = 1;
		
		while(N>room) {
			room+= 6*count;
			count++;
		}
		System.out.println(count);
		// 1 => 7(6) => 19(12) => 37(18) => 61(24)
	}
}