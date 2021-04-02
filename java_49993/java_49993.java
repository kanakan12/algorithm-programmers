package java_49993;

public class java_49993 {
    static class Solution {
        // type 1
        public int solution(String skill, String[] skill_trees) {
            int answer = skill_trees.length;

            for(int i = 0; i < skill_trees.length; i++) {
                int idx = 0;
                int[] arr = new int[skill.length()];
                for(char sk : skill.toCharArray()) {
                    int val = skill_trees[i].indexOf(sk);
                    if(val == -1) arr[idx] = 99;
                    else arr[idx] = val;
                    idx++;
                }

                for(int j = 0; j < arr.length - 1; j++){
                    if(arr[j] > arr[j + 1]) {
                        answer--;
                        break;
                    }
                }
            }

            return answer;
        }

        // type 2
        // public int solution(String skill, String[] skill_trees) {
        //     int answer = skill_trees.length;

        //     for(int i = 0; i < skill_trees.length; i++) {
        //         String str = skill_trees[i].replaceAll("[^"+ skill + "]", "");
        //         int idx = skill.indexOf(str);
        //         if(idx != 0) answer--;
        //     }

        //     return answer;
        // }
    }
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        // String skill = "ABC";
        // String[] skill_trees = {"DEF"};
        Solution sol = new Solution();
        sol.solution(skill, skill_trees);
    }
}
