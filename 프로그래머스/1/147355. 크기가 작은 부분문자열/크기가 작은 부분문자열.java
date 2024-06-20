class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String sub = t.substring(i, i + p.length());
            long a = Long.parseLong(sub);
            
            if(a<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}