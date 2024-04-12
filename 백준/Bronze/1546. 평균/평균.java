import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 자기 점수 중 최대값 M
		// (받은 점수)/M *100
		// 이렇게 했을 때 평균
		int N = sc.nextInt();
		int[] arr = new int[N];
		double sum = 0;
		int M = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(M<arr[i]) {
				M = arr[i];
			}
		}
		for(int i=0; i<N; i++) {
		sum += (double)arr[i]/M*100;
		}
		System.out.println(sum/N);
	}
}