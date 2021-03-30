package java_12933;

import java.util.Arrays;

public class java_12933 {
    public static long solution(long n) {
        long answer = 0;
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);

        for(int i = c.length - 1; i >= 0; i--) {
            answer += Long.parseLong(String.valueOf(c[i])) * (Math.pow(10, i));
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;
        solution(n);
    }
}
