package java_42862;

public class java_42862 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            ans[i]++;
        for(int i = 0; i < lost.length; i++)
            ans[lost[i] - 1]--;
        for(int i = 0; i < reserve.length; i++)
            ans[reserve[i] - 1]++;

        for(int i = 0; i < n; i++){
            if(ans[i] < 1 && i + 1 < n){
                if(ans[i + 1] > 1){
                    ans[i]++;
                    ans[i + 1]--;
                }
            }
            if(ans[i] < 1 && i - 1 >= 0){
                if(ans[i - 1] > 1){
                    ans[i]++;
                    ans[i - 1]--;
                }
            }
        }

        for(int i = 0; i < n; i++)
            if(ans[i] > 0) answer++;

        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        solution(n, lost, reserve);
    }
}
