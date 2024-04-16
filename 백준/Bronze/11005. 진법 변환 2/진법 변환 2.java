import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int B = scanner.nextInt();
		StringBuilder result = new StringBuilder();
		// 결과를 역순으로 저장
	
		while(N>0) {
			int remainder = N % B;
			if (remainder < 10) {
				result.insert(0, remainder);
			}else {
				char digit = (char) ('A' + (remainder - 10));
				result.insert(0, digit);
			}
			N /= B;
		}
		System.out.println(result.toString());
		
	}
}