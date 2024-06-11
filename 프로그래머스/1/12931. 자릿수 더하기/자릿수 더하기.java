import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        for(int i=0; i<a.length(); i++){
            answer+= Character.getNumericValue(a.charAt(i));
        }


        return answer;
    }
}