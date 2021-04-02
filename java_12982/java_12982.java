package java_12982;

import java.util.Arrays;

public class java_12982 {
    static class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            Arrays.sort(d);

            int cnt = 0;
            for(int i = 0; i < d.length; i++) {
                cnt += d[i];
                if(cnt <= budget) answer++;
                else break;
            }

            return answer;
        }
    }
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        Solution sol = new Solution();
        sol.solution(d, budget);
    }
}