package java_12921;

import java.util.ArrayList;

public class java_12921 {
    // type 1
    // public static int solution(int n) {
    //     int answer = 0;

    //     for(int i = 2; i <= n; i++){
    //         answer += 1;
    //         for(int j = 2; j * j <= i; j++){
    //             if(i % j == 0){
    //                 answer -= 1;
    //                 break;
    //             }
    //         }
    //     }

    //     return answer;
    // }

    // type 2
    public static int solution(int n) {
        int answer = 0;

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(i == 2) lst.add(i);

            boolean chk = true;
            for(int j = 0; lst.get(j) * lst.get(j) <= i && lst.size() > j; j++){
                if(i % lst.get(j) == 0){
                    chk = false;
                    break;
                }
            }

            if(chk && i != 2) lst.add(i);
        }

        answer = lst.size();
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        solution(n);
    }
}
