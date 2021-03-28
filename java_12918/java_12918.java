package java_12918;

public class java_12918 {
    public static boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6)
            return false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                answer = false;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "a234";
        solution(s);
    }
}
