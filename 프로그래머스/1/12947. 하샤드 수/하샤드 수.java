class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String y = Integer.toString(x);
        int sum = 0;
        for(int i=0; i<y.length(); i++){
            sum += y.charAt(i) -'0';
        }
        
        answer = x%sum==0?true:false;
        
        return answer;
    }
}