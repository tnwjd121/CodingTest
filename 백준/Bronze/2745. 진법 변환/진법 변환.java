import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		int B = scanner.nextInt();
		int sum = 0;
		for(int i=0; i<N.length(); i++) {
            char digit = N.charAt(i);
            int value = Character.isDigit(digit) ? digit - '0' : digit - 'A' + 10;
            sum += value * Math.pow(B, N.length() - i - 1);
		}
		System.out.println(sum);
		
	}
}