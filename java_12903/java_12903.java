package java_12903;

public class java_12903 {
    public static String solution(String s) {
        String answer = "";

        int idx = s.length() / 2;;
        if(s.length() % 2 == 1){
            answer = s.substring(idx, idx + 1);
        } else {
            answer = s.substring(idx - 1, idx + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "abcde";
        solution(s);
    }
}
