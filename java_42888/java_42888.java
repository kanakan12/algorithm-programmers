package java_42888;

import java.util.ArrayList;
import java.util.HashMap;

public class java_42888 {
    public static String[] solution(String[] record) {
        String[] answer = {};
        
        HashMap<String, String> hs = new HashMap<>();

        for(int i = 0; i < record.length;i++){
            String[] s = record[i].split(" ");

            if(s.length == 3){
                hs.put(s[1], s[2]);
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] s = record[i].split(" ");

            if(s[0].equals("Enter")){
                ans.add(hs.get(s[1]) + "님이 들어왔습니다.");
            }
            else if(s[0].equals("Leave")){
                ans.add(hs.get(s[1]) + "님이 나갔습니다.");
            }
        }

        answer = ans.toArray(new String[ans.size()]);

        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", 
                           "Enter uid4567 Prodo",
                           "Leave uid1234",
                           "Enter uid1234 Prodo",
                           "Change uid4567 Ryan"};
        java_42888.solution(record);
    }
}
