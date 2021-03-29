package java_12931;

public class java_12931 {
    public static int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n = 123;
        solution(n);
    }
}
