class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // 2차원 배열 만들기
        String [] sArr1 = new String[n]; 
        String [] sArr2 = new String[n]; 
        //arr1, arr2 2진수로 변경하기
        for(int i=0; i<n; i++){
            String formatString = "%0" + n + "s";
            sArr1[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(' ', '0'); 
            
            sArr2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
        }
        // #으로 만들기
        for(int i=0; i<n; i++){
            String answerText = "";
            for(int j=0; j<n; j++){
                if(sArr1[i].charAt(j) == '0'&&sArr2[i].charAt(j)== '0'){
                    answerText += " ";
                }else{
                    answerText += "#";
                }
            }
            answer[i] = answerText;
        }
        return answer;
    }
}