package java_12943;

public class java_12943 {
    static class Solution {
        public long solution(long num) {
            long answer = 0;

            while(answer < 500 && num != 1) {
                if(num % 2 == 0) num /= 2;
                else num = (num * 3) + 1;

                answer++;
            }

            if(answer == 500) answer = -1;

            return answer;
        }
    }
    public static void main(String[] args) {
        long num = 6;
        Solution sol = new Solution();
        sol.solution(num);
    }
}
