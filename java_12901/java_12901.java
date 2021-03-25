package java_12901;

public class java_12901 {
    public static String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;

        for(int i = 0; i < a - 1; i++)
            ans += days[i];

        ans += b - 1;

        answer = week[ans % 7];

        return answer;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        solution(a, b);
    }
}
