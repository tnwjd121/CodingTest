
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String a = scanner.next();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += a.charAt(i) - '0';
			// 문자열로 할 경우 아스키코드로 되서 '0'을 빼주면 원래 숫자로 나옴
		}
		System.out.println(sum);
	}
}