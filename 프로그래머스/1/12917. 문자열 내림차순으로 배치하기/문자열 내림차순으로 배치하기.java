import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String [] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        
        for(String a : strArr)
            answer += a;
        
        return answer;
    }
}