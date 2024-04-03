import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int byteNum = sc.nextInt();
		String longs = "long";
		int resultNum = 0;
		
		if(byteNum%4==0) {
			resultNum = (byteNum/4);
		}
		
		for(int i=0; i<resultNum; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
	}

}