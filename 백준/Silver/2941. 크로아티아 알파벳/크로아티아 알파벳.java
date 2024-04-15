import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = scanner.nextLine();
		
		int count = 0;
		int index = 0;
		
		while(index < str.length()) {
			boolean boo = false;
			for (String s : croatia) {
				if (str.startsWith(s, index)) {
					// 첫번째 매개변수 비교하는 문자열, 두번째는 비교대상 문자열 시작 위치
					count ++;
					index += s.length();
					boo = true;
					break;
				}
			}
			if(!boo) {
				count++;
				index++;
			}
		}
		System.out.println(count);
	}
}