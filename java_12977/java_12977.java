package java_12977;

public class java_12977 {
    static class Solution {
        private boolean prime(int n) {
            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }

        public int solution(int[] nums) {
            int answer = 0;
            
            for(int i = 0; i < nums.length; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                    for(int k = j + 1; k < nums.length; k++) {
                        if(prime(nums[i] + nums[j] + nums[k])) {
                            answer++;
                        } 
                    }
                }
            }
    
            return answer;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution sol = new Solution();
        sol.solution(nums);        
    }
}
