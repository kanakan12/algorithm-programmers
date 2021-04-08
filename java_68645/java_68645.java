package java_68645;

public class java_68645 {
    static class Solution {
        public int[] solution(int n) {
            int[] answer = new int[(n * (n + 1 ) / 2)];
            int[][] arr = new int[n][n];

            int x = -1, y = 0;
            int val = 1;

            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    if(i % 3 == 0) {
                        x++;
                    } else if(i % 3 == 1) {
                        y++;
                    } else if(i % 3 == 2) {
                        x--;
                        y--;
                    }
                    arr[x][y] = val++;
                }
            }

            int idx = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == 0) break;
                        answer[idx++] = arr[i][j];
                }
            }

            return answer;
        }
        // type 1.
        // public int[] solution(int n) {
        //     int[] answer = {};

        //     int[][] arr = new int[n][n];
        //     int val = 1;
        //     int total = (n * (n + 1)) / 2;
        //     int x = 0, y = 0;

        //     while(val <= total) {
        //         while(x < n) {
        //             if(arr[x][y] != 0) break;
        //             arr[x++][y] = val++;
        //         }
        //         x--;
        //         y++;

        //         while(y < n) {
        //             if(arr[x][y] != 0) break;
        //             arr[x][y++] = val++;
        //         }
        //         y--;

        //         if(x <= 0 && y <= 0) continue;

        //         while(arr[--x][--y] == 0) {
        //             arr[x][y] = val++;
        //         }
        //         x += 2;
        //         y++;
        //     }

        //     answer = new int[total];
        //     int idx = 0;

        //     for(int i = 0; i < n; i++) {
        //         for(int j = 0; j < n; j++) {
        //             if(arr[i][j] != 0)
        //                 answer[idx++] = arr[i][j];
        //         }
        //     }
            
        //     return answer;
        // }
    }
    public static void main(String[] args) {
        int n = 5;
        Solution sol = new Solution();
        sol.solution(n);
    }
}
