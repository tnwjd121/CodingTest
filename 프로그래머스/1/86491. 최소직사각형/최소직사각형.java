class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int resultW = 0;
        int resultH = 0;
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0],sizes[i][1]);                 int h = Math.min(sizes[i][0],sizes[i][1]);
            resultW = Math.max(w, resultW);
            resultH = Math.max(h, resultH);
        }
        answer = resultW*resultH;
        
        return answer;
    }
}