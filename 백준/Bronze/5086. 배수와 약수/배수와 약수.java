import java.util.Scanner;

public class Main {
	public static String result(int a, int b) {
		String result = "";
		if(b%a==0) {
			result = "factor";
		}else if (a%b==0) {
			result = "multiple";
		}else {
			result = "neither";
		}
		return result;
	}

	public static void main(String[] args) {
		// 약수 -factor, 배수 - multiple, 둘다 아니면 neither
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int B = 0;
		while (true) {
			A= scanner.nextInt();
			B= scanner.nextInt();
			if(A<=1 && B<=1) {
				break;
			}
			System.out.println(result(A, B));
		}
		
	}

}
