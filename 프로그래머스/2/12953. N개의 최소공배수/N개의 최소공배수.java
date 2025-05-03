class Solution {
    
    // 최대공약수 구하기
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
      return a;
    }
    // 두 수 최소공배수 구하기
    public static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
    
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 1) return arr[0];
        answer = lcm(arr[0], arr[1]);
        if(arr.length > 2) {
            for(int i = 2; i<arr.length; i++){
                answer = lcm(answer, arr[i]);
            }
        }
        return answer;
    }
}