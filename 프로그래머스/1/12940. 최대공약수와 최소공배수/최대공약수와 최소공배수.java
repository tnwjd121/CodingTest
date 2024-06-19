class Solution {
    // 최대공약수(유클리드 호제법)
    public int gcd(int a, int b) {
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    // 최소공배수
    public int lcm(int a, int b){
        return Math.abs(a*b) / gcd(a,b);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
}