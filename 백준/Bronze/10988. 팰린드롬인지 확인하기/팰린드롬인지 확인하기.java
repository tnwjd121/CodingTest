import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		boolean boo = true;
		
		for(int i=0; i<str.length()/2; i++) {
		 if(str.charAt(i)!= str.charAt(str.length()-1-i)) {
			 boo = false;
			 break;
		 }
		}
		if(boo) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}	
	}
}