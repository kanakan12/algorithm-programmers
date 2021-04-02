package java_12947;

public class java_12947 {
    static class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            String s = String.valueOf(x);
            int val = 0;
            for(int i = 0; i < s.length(); i++) {
                val += Integer.parseInt(String.valueOf(s.charAt(i))); 
            }

            if(x % val != 0) answer = false;

            return answer;
        }
    }
    public static void main(String[] args) {
        int x = 10;
        Solution sol = new Solution();
        sol.solution(x);
    }
}
