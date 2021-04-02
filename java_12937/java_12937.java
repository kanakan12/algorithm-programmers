package java_12937;

public class java_12937 {
    public static String solution(int num) {
        String answer = "";

        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";

        return answer;
    }

    public static void main(String[] args) {
        int num = 3;
        solution(num);
    }
}