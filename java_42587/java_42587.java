package java_42587;

import java.util.LinkedList;
import java.util.Queue;

public class java_42587 {
    static class st{
        int value;
        int location;
    }
    static class Solution {
        public int solution(int[] priorities, int location) {
            int[] ans = new int[priorities.length];
            int idx = 0;

            Queue<st> q = new LinkedList<>();
            for(int i = 0; i < priorities.length; i++) {
                st s = new st();
                s.value = priorities[i];
                s.location = i;
                q.offer(s);
            }

            while(q.size() != 0) {
                st cur = q.poll();
                int size = q.size();
                int max = Integer.MIN_VALUE;
                for(int i = 0; i < size; i++) {
                    st now = q.poll();
                    if(max < now.value) max = now.value;
                    q.offer(now);
                }

                if(cur.value < max) {
                    q.offer(cur);
                } else {
                    ans[cur.location] = ++idx;
                }
            }

            return ans[location];
        }
    }
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 3;
        Solution sol = new Solution();
        sol.solution(priorities, location);
    }
}
