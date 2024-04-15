import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		StringTokenizer stk = new StringTokenizer(str, " ");
		// 구분자로 문자열을 쪼개주는 클래스
		
		System.out.println(stk.countTokens());
		// 남아 있는 token의 갯수
		
	}
}