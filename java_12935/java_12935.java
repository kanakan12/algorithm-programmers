package java_12935;

import java.util.ArrayList;

public class java_12935 {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> lst = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            lst.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
        }

        lst.remove(idx);

        if(lst.size() == 0){
            answer = new int[]{ -1 };
        } else {
            answer = new int[lst.size()];

            for(int i = 0; i < lst.size(); i++) {
                answer[i] = lst.get(i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        solution(arr);
    }
}
