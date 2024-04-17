import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			int N = scanner.nextInt();
			if(N == -1) {
				break;
			}
			ArrayList<Integer> divisor = new ArrayList<Integer>();
			int sum = 0;
			
			for(int i=1; i<N/2+1; i++) {
				if(N%i==0) {
					divisor.add(i);
					sum += i;
				}
			}
			if(N==sum) {
				System.out.print(N + " = ");
				for(int i=0; i<divisor.size()-1; i++) {
					System.out.print(divisor.get(i) + " + ");
				}
					System.out.println(divisor.get(divisor.size() - 1));
			}else {
				System.out.println(N+ " is NOT perfect.");
			}
		}
	}
}