package java_42839;

import java.util.ArrayList;

public class java_42839 {
    static class Solution {
        private void check(ArrayList<String> lst, String s, int cnt, int total) {
            if(s.length() == cnt) {
                lst.add(s);
                return;
            }

            for(int i = 0; i < total; i++) {
                if(!s.contains(String.valueOf(i))) {
                    s += String.valueOf(i);
                    check(lst, s, cnt, total);
                    s = s.substring(0, s.length() - 1);
                }
            }
        }

        private boolean isPrime(int n) {
            if(n == 0 || n == 1) return false;
            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }

        public int solution(String numbers) {
            int answer = 0;

            ArrayList<String> lst = new ArrayList<>();

            int cnt = 1;
            while(cnt <= numbers.length()) {
                check(lst, "", cnt, numbers.length());
                cnt++;
            }

            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < lst.size(); i++) {
                int val = 0;
                for(int j = 0; j < lst.get(i).length(); j++) {
                    int idx = Integer.parseInt(String.valueOf(lst.get(i).charAt(j)));
                    val += Integer.parseInt(String.valueOf(numbers.charAt(idx))) * Math.pow(10, j);
                }

                if(isPrime(val) && !ans.contains(val)) {
                    ans.add(val);
                }
            }

            answer = ans.size();

            return answer;
        }
    }
    public static void main(String[] args) {
        String numbers = "011";
        Solution sol = new Solution();
        sol.solution(numbers);
    }
}