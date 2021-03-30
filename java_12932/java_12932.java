package java_12932;

import java.util.ArrayList;

public class java_12932 {
    public static int[] solution(long n) {
        int[] answer = {};

        ArrayList<Integer> arr = new ArrayList<>();

        while(n > 0){
            arr.add((int)(n % 10));
            n /= 10;
        }

        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        solution(n);
    }
}
