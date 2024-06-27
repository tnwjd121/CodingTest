class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0;
        int i2 = 0;
        String answer = "Yes";
        for(String str : goal) {
            if(i1<cards1.length && str.equals(cards1[i1])){
                i1++;
            }else if(i2<cards2.length && str.equals(cards2[i2])){
                i2++;
            }else {
                answer = "No";
            }
        }
        
        return answer;
    }
}