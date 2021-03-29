package java_12930;

public class java_12930 {
    public static String solution(String s) {
        String answer = "";

        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                answer += ' ';
                idx = 0;
            } else {
                if(idx % 2 == 0) answer += Character.toUpperCase(s.charAt(i));
                else answer += Character.toLowerCase(s.charAt(i));
                idx++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "tr hello world";
        solution(s);
    }
}
