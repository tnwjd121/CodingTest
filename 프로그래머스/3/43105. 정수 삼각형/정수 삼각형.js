function solution(triangle) {
    
    // 삼각형 배열 복사, slice는 원본 보존하고, 작업용 배열 쓸 때 사용
  const tr = triangle.map(row => [...row]);

  //마지막 줄부터 최대값 업데이트 하기
  for(let i = tr.length-2; i >= 0; i--) {
    for(let j = 0; j < tr[i].length; j++) {
      tr[i][j] += Math.max(tr[i+1][j], tr[i+1][j+1]);
    }
  }
  
  return tr[0][0];
}