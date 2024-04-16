import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int X = scanner.nextInt();
		
        int days = (X - A) / (A - B);
        if ((X - A) % (A - B) != 0) {
            days++;
        }
        days++;
		System.out.println(days);
		
	}
}