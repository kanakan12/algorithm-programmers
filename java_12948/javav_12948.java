package java_12948;

public class javav_12948 {
    static class Solution {
        public String solution(String phone_number) {
            String answer = "";

            for(int i = 0; i < phone_number.length(); i++) {
                if(i > phone_number.length() - 5) answer += phone_number.charAt(i);
                else answer += "*"; 
            }

            return answer;
        }
    }
    public static void main(String[] args) {
        String phone_number = "01033334444";
        Solution sol = new Solution();
        sol.solution(phone_number);
    }
}
