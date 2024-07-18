class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n == 0){
            return 0;
        }
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i<=n; i++){
            // 큰 수를 넣을 경우 int와 long 타입의 범위를 넘어서
            // 값들은 문제 조건에 맞게 1234567로 나눈 나머지를 저장
          arr[i] = (arr[i-1]+arr[i-2])%1234567; 
        }
        
        answer = arr[n] %1234567;
        return answer;
    }
}