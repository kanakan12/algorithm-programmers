package java_42890;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    private static boolean check(List<Integer> lst, int bit){
        for(int i = 0; i < lst.size(); i++){
            if ((lst.get(i) & bit) == lst.get(i)) 
                return false;
        }
        return true;
    }
    public static int solution(String[][] relation) {
        int row = relation.length;
        int col = relation[0].length;

        List<Integer> ans = new ArrayList<Integer>();

        for(int i = 1; i < (1<<col); i++){
            HashSet<String> hsstr = new HashSet<String>();
            for(int j = 0; j < row; j++){
                String s = "";
                for(int k = 0; k < col; k++){
                    if( (i & (1<<k)) > 0 ){
                        s += relation[j][k] + "_";
                    }
                }
                hsstr.add(s);
            }
            if(hsstr.size() == row && check(ans, i) ){
                ans.add(i);
            }
        }
        return ans.size();
    }
    public static void main(String[] args) {
        String[][] relation = {{"100", "ryan", "music", "2"},
                                    {"200", "apeach", "math", "2"},
                                    {"300", "tube", "computer", "3"},
                                    {"400", "con", "computer", "4"},
                                    {"500", "muzi", "music", "3"},
                                    {"600", "apeach", "music", "2"}};
        solution(relation);
    }
}
