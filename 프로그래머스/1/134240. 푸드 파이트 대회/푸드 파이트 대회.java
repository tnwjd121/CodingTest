class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        for(int i=1; i<food.length; i++){
            int n = food[i]/2;
            for(int j=0; j<n; j++){
                str += i;
            }
        }
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        answer = str+"0"+reverse;
        
        
        return answer;
    }
}