package java_12940;

public class java_12940 {
    public static class Solution{
        public int[] solution(int n, int m) {
            int[] answer = new int[2];
    
            int min = check(n, m);
    
            answer[0] = min;
            answer[1] = n * m / min;
    
            return answer;
        }

        private int check(int a, int b) {
            return (a % b == 0) ? b : check(b, a % b);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        Solution sol = new Solution();
        sol.solution(n, m);
    }
}
