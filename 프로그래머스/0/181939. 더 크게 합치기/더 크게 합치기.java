class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int case1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int case2 = Integer.parseInt(Integer.toString(b)+Integer.toString(a));

        answer = Math.max(case1, case2);
        
        return answer;
    }
}