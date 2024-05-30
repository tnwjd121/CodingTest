import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = "";

        while (true) {
            t = scanner.next();
            if (t.equals("end")) break;
            if (isPassword(t)) {
                System.out.println("<" + t + ">" + " is acceptable.");
            } else {
                System.out.println("<" + t + ">" + " is not acceptable.");
            }
        }
    }

    public static boolean isPassword(String str) {
        boolean bol = false;
        int aeiouCount = 0;
        int notAeiouCount = 0;
        char prevChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            	bol = true;
            	aeiouCount++;
            	notAeiouCount = 0;
                if (aeiouCount > 2) {
                    return false;
                }
            } else {
            	notAeiouCount++;
                aeiouCount = 0;
                if (notAeiouCount > 2) {
                    return false;
                }
            }

            if (c == prevChar && c != 'e' && c != 'o') {
                return false;
            }

            prevChar = c;
        }

        return bol;
    }
}