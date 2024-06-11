import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        String [] arr = a.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        answer = Long.parseLong(String.join("", arr));
        return answer;
    }
}