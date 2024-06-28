import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 제일 큰숫자와 제일 작은 숫자 곱하기
        //A 오름차순
        Arrays.sort(A);
        
        // B 내림차순 list로 변경
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<B.length; i++){
            list.add(B[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        // 최솟값 만들기
        for(int i=0; i<A.length; i++){
            answer += list.get(i)*A[i];
        }

        return answer;
    }
    
}