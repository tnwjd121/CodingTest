class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean answerBoo = true;
        if(ineq.equals(">")&& eq.equals("=")){
            answerBoo = n>=m;
        }else if(ineq.equals("<")&& eq.equals("=")){
            answerBoo = n<=m;
        }else if(ineq.equals(">")&& eq.equals("!")){
            answerBoo = n>m;
        }else if(ineq.equals("<")&& eq.equals("!")){
            answerBoo = n<m;
        }
        
        if(answerBoo){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}