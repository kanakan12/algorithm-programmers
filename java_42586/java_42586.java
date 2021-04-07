package java_42586;

// import java.util.LinkedList;
// import java.util.Queue;
import java.util.ArrayList;

public class java_42586 {
    public static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};
            int temp = 0;
            int cnt = 0;
            ArrayList<Integer> lst = new ArrayList<>();
    
            while(true) {
                for (int i = 0; i < progresses.length; i++) {
                    progresses[i] += speeds[i];
                }
    
                while(temp < progresses.length && progresses[temp] >= 100) {
                    cnt++;
                    temp++;
                }
    
                if(cnt != 0) lst.add(cnt);
                cnt = 0;
    
                if (temp == progresses.length) break;
            }

            answer = new int[lst.size()];
            for(int i = 0; i < lst.size(); i++) {
                answer[i] = lst.get(i);
            }
    
            return answer;
        }
    }

    // type 1.
    // static class Solution{
    //     public int[] solution(int[] progresses, int[] speeds) {
    //         int[] answer = {};

    //         Queue<Integer> qp = new LinkedList<>();
    //         Queue<Integer> qs = new LinkedList<>();
    //         ArrayList<Integer> lst = new ArrayList<>();
    //         for(int i = 0; i < progresses.length; i++) {
    //             qp.offer(progresses[i]);
    //             qs.offer(speeds[i]);
    //         }

    //         while(qp.size() != 0) {
    //             int size = qp.size();
    //             int idx = 0;
    //             for(int i = 0; i < size; i++) {
    //                 int np = qp.poll();
    //                 int ns = qs.poll();

    //                 qp.offer(np + ns);
    //                 qs.offer(ns);
    //             }

    //             while(qp.peek() >= 100) {
    //                 qp.poll();
    //                 qs.poll();
    //                 idx++;

    //                 if(qp.size() == 0) break;
    //             }
    //             if(idx != 0) lst.add(idx);
    //         }

    //         answer = new int[lst.size()];
    //         for(int i = 0; i < lst.size(); i++) {
    //             answer[i] = lst.get(i);
    //         }

    //         return answer;
    //     }
    // }
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        Solution sol = new Solution();
        sol.solution(progresses, speeds);
    }
}