package java_42584;

public class java_42584 {
    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
    
            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    answer[i]++;
    
                    if (prices[i] > prices[j]) 
                        break;
                }
            }
    
            return answer;
        }
        // type 1.
        // public int[] solution(int[] prices) {
        //     int[] answer = new int[prices.length];

        //     int idx = 0;
        //     int c_idx = idx + 1;
        //     int cnt = 0;
        //     while(c_idx < prices.length) {
        //         if(prices[idx] <= prices[c_idx]) {
        //             cnt++;
        //             c_idx++;
        //         } else {
        //             answer[idx] = ++cnt;
        //             idx++;
        //             c_idx = idx + 1;
        //             cnt = 0;
        //             continue;
        //         }

        //         if(c_idx == prices.length) {
        //             answer[idx] = cnt;
        //             idx++;
        //             c_idx = idx + 1;
        //             cnt = 0;
        //         }
        //     }
        //     return answer;
        // }
    }
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Solution sol = new Solution();
        sol.solution(prices);
    }
}
