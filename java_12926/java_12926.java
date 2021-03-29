package java_12926;

import java.util.Arrays;

public class java_12926 {
    public static String solution(String s, int n) {
        String answer = "";
        String[] STR = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i = 0; i < s.length(); i++){
            String ss = String.valueOf(s.charAt(i));

            if(Arrays.asList(STR).contains(ss)) {
                int idx = Arrays.asList(STR).indexOf(ss);
                answer += STR[(idx + n) % STR.length];

            } else if(Arrays.asList(str).contains(ss)) {
                int idx = Arrays.asList(str).indexOf(ss);
                answer += str[(idx + n) % STR.length];
            } else {
                answer += ss;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        solution(s, n);
    }
}
