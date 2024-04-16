import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// 가로 세로가 100인 정사각형
		// 가로 세로가 10인 직사각형 색칠된 부분 넓이 구하기
		
		Scanner scanner = new Scanner(System.in);
		int[][] all = new int[100][100]; 
		int num = scanner.nextInt();
		int x = 0;
		int y= 0;
		int count = 0;
		
		
		for(int i=0; i<num; i++) {
			x=scanner.nextInt();
			y=scanner.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					all[j][k] = 1;
				}
			}
		}
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(all[i][j] == 1) {
                    count++;
                }
            }
        }

		System.out.println(count);
	}
}