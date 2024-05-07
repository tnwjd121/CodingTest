import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String result = N%2==1?"SK":"CY";
		System.out.println(result);

	}
}