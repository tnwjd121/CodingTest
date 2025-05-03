class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        //노란카펫 = (w-2)*(h-2)
        //높이는 = total/w
        for (int w=3; w<=total/3;w++){
            int h = total / w;
            if(yellow == (w-2)*(h-2)){
                answer[0]=w;
                answer[1]=h;
            }
        }
        
        return answer;
    }
}