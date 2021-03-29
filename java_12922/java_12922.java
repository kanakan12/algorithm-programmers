package java_12922;

public class java_12922 {
    public static String solution(int n) {
        String answer = "";

        String[] s = {"수", "박"};
        for(int i = 0; i < n; i++){
            answer += s[i % 2];
        }

        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        solution(n);
    }
}
