import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;

        boolean[] visited = new boolean[words.length];
        Queue<String[]> queue = new LinkedList<>();
        queue.offer(new String[]{begin, "0"});

        while (!queue.isEmpty()) {
            String[] cur = queue.poll();
            String word = cur[0];
            int depth = Integer.parseInt(cur[1]);

            if (word.equals(target)) return depth;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && diffOne(word, words[i])) {
                    visited[i] = true;
                    queue.offer(new String[]{words[i], String.valueOf(depth + 1)});
                }
            }
        }

        return 0;
    }

    private boolean diffOne(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) cnt++;
        return cnt == 1;
    }
}