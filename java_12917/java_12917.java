package java_12917;

import java.util.Arrays;
import java.util.Collections;

public class java_12917 {
    public static String solution(String s) {
        String answer = "";

        String[] ans = s.split("");
        Arrays.sort(ans, Collections.reverseOrder());

        answer = String.join("", ans);
        return answer;
    }
    public static void main(String[] args) {
        String s = "Zbcdefg";
        solution(s);
    }
}
