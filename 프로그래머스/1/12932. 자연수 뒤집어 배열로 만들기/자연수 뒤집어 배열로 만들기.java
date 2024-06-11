class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        int len = a.length();
        int[] answer = new int [len];

        for(int i=0;i<len; i++){
            answer[i] = Character.getNumericValue(a.charAt(len-i-1));
        }
        return answer;
    }
}