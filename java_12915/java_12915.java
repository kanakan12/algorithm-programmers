package java_12915;

import java.util.Arrays;

public class java_12915 {
    public static String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i++){
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        solution(strings, n);
    }
}
