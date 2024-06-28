class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int leftCount = 0;
        int rightCount = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                leftCount++;
            } else if (ch == ')') {
                rightCount++;
            }
            if(leftCount < rightCount) {
                return false;
            }
        }
        
        if(leftCount==rightCount){
              answer = true;
        }

        return answer;
    }
}