package java_12925;

public class java_12925 {
    public static int solution(String s) {
        int answer = 0;

        if(s.charAt(0) == '+') {
            s = s.substring(1);
            answer = Integer.parseInt(s);
        } else if(s.charAt(0) == '-') {
            s = s.substring(1);
            answer = Integer.parseInt(s);
            answer *= -1;
        }
        else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "-1234";
        solution(s);
    }
}
