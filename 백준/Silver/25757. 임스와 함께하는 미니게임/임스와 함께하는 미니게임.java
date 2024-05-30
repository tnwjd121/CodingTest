import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Y==2, F==3, O==4
        int N = scanner.nextInt();
        String G = scanner.nextLine().trim();
        
        Set<String> unique = new HashSet<String>();
        
        for(int i=0; i<N; i++) {
        	unique.add(scanner.nextLine());
        }
 
        switch (G) {
		case "Y":			
			System.out.println(unique.size());
			break;
		case "F":
			System.out.println(unique.size()/2);			
			break;
		case "O":
			System.out.println(unique.size()/3);						
			break;
		default:
			break;
		}
   
    }
}