package java_42583;

import java.util.LinkedList;
import java.util.Queue;

public class java_42583 {
    // type 2.
    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> q = new LinkedList<>();

            int time = 0, count = 0, bridge = 0;

            while (count < truck_weights.length) {
                if (q.size() == bridge_length) {
                    bridge -= q.poll();
                }
    
                if (bridge + truck_weights[count] <= weight) {
                    bridge += truck_weights[count];
                    q.offer(truck_weights[count]);
                    count++;
                } else {
                    q.offer(0);
                }
                time++;
            }
            time += bridge_length;

            return time;
        }
    }
    // type 1.
    // static class Solution {
    //     public int solution(int bridge_length, int weight, int[] truck_weights) {
    //         int answer = 1;

    //         Queue<Integer> q = new LinkedList<>();

    //         int idx = 0;
    //         int cur = 0;
    //         int[] arrived = new int[truck_weights.length];

    //         while(idx < truck_weights.length) {
    //             int next = truck_weights[idx];
    //             if(cur + next <= weight) {
    //                 cur += next;
    //                 q.offer(idx);
    //                 idx++;
    //             }

    //             answer++;
    //             int size = q.size();
    //             for(int i = 0; i < size; i++) {
    //                 int cnt = q.poll();
    //                 arrived[cnt]++;
    //                 if(arrived[cnt] == bridge_length) {
    //                     cur -= truck_weights[cnt];
    //                 } else {
    //                     q.offer(cnt);
    //                 }
    //             }
    //         }
    //         answer += bridge_length - arrived[truck_weights.length - 1];

    //         return answer;
    //     }
    // }
    public static void main(String[] args) {
        // int bridge_length = 2;
        // int weight = 10;
        // int[] truck_weights = {7, 4, 5 ,6};
        int bridge_length = 5;
        int weight = 5;
        int[] truck_weights = {2, 2, 2, 2, 1, 1, 1, 1, 1};
        Solution sol = new Solution();
        sol.solution(bridge_length, weight, truck_weights);
    }
}