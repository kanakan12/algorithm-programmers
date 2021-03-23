package java_68644;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class java_68644 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                hs.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>(hs);
        Collections.sort(arr);

        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }
}
