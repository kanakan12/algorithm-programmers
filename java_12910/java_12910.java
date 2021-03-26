package java_12910;

import java.util.PriorityQueue;

public class java_12910 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                p.add(arr[i]);
            }
        }

        if(p.size() == 0) p.add(-1);
        answer = new int[p.size()];

        int idx = 0;
        while(p.size() > 0){
            answer[idx] = p.peek();
            p.poll();
            idx++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        solution(arr, divisor);
    }
}
