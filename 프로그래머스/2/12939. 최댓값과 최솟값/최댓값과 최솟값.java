import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer>  list = new ArrayList<>();
        
        String[] strarr = s.split(" ");
        for(String str : strarr) {
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list);
        
        int len = list.size();
        answer = Integer.toString(list.get(0)) + " " +Integer.toString(list.get(len-1));
        
        return answer;
    }
}