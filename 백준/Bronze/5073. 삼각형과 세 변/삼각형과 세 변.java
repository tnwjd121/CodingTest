import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = scanner.nextInt();

			if(A==0&&B==0&&C==0)
				break;
			
			if(A+B<=C||A+C<=B||C+B<=A) {
				System.out.println("Invalid");
			} else if(A==B&&B==C) {
				System.out.println("Equilateral");
			} else if(A!=B&&A!=C&&B!=C) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}

	}
}