package java_12934;

public class java_12934 {
    public static long solution(long n) {
        long answer = -1;

        if(Math.pow((int)Math.sqrt(n), 2) == n){
            return (long)Math.pow((int)Math.sqrt(n) + 1, 2);
        }

        return answer;
    }
    public static void main(String[] args) {
        long n = 121;
        solution(n);
    }
}
