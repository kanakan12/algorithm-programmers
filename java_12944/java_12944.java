package java_12944;

public class java_12944 {
    static class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for(int i = 0; i < arr.length; i++){
                answer += arr[i];
            }

            answer /= arr.length;

            return answer;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution sol = new Solution();
        sol.solution(arr);
    }
}
