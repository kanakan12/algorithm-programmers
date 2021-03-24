package java_17680;

import java.util.ArrayList;

public class java_17680 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> lst = new ArrayList<>();

        for(int i = 0; i < cities.length; i++){
            String s = cities[i].toUpperCase();
            if(!lst.contains(s)){
                answer += 5;
                lst.add(s);

                if(lst.size() == cacheSize + 1) lst.remove(0);
            }
            else{
                answer += 1;
                int idx = lst.indexOf(s);
                lst.remove(idx);
                lst.add(s);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        // int cacheSize = 3;
        // String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        solution(cacheSize, cities);
    }
}
