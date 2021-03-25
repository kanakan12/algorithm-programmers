package java_68935;

import java.util.ArrayList;

public class java_68935 {
    // type 1
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(n != 0){
            arr.add(n % 3);
            n /= 3;
        }

        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i) * Math.pow(3, arr.size() - i - 1);
        }

        return answer;
    }

    // type 2 속도 느림
    // public static int solution(int n) {
    //     String s = "";

    //     while(n != 0){
    //         s += n % 3;
    //         n /= 3;
    //     }

    //     return Integer.parseInt(s, 3);
    // }
    public static void main(String[] args) {
        int n = 45;
        solution(n);
    }
}
