import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String str2 = "";
        
        for(int i=0; i<n; i++){
            str2 += str;
        }
        
        System.out.print(str2);
        
    }
}