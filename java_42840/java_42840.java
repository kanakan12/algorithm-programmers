package java_42840;

import java.util.ArrayList;

public class java_42840 {
    public static int check(int[] answers, int[] tester){
        int cnt = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i % answers.length] == tester[i % tester.length]){
                cnt++;
            }
        }
        return cnt;
    }
    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] fst = {1,2,3,4,5};
        int[] snd = {2,1,2,3,2,4,2,5};
        int[] trd = {3,3,1,1,2,2,4,4,5,5};

        int f = check(answers, fst);
        int s = check(answers, snd);
        int t = check(answers, trd);

        int max = Math.max(f, Math.max(s, t));

        ArrayList<Integer> ans = new ArrayList<>();
        if(max == f) ans.add(1);
        if(max == s) ans.add(2);
        if(max == t) ans.add(3);

        answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
            
        return answer;
    }
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        solution(answers);
    }
}
