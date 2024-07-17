import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        // 모든 문자 소문자로 변환
        String[] arr = s.toLowerCase().split("");
        boolean toUpper = true;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                toUpper = true; 
            } else {
                if (toUpper && !arr[i].equals("")) {
                    arr[i] = arr[i].toUpperCase();
                    toUpper = false; 
                } 
            }
            answer += arr[i];
        }
        
        
        
        
        
        return answer;
    }
}