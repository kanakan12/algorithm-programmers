package java_17679;

public class java_17679 {
    private static String[][] set(String[][] arr, int m, int n){
        for(int j = 0; j < n; j++){
            for(int i = m - 1; i > 0; i--){
                if(arr[i][j] != " "){
                    continue;
                }
                else{
                    int idx = i;
                    while(idx > -1){
                        if(arr[idx][j] != " "){
                            arr[i][j] = arr[idx][j];
                            arr[idx][j] = " ";
                            break;
                        }
                        idx--;
                    }
                }
            }
        }

        return arr;
    }
    private static boolean check(String[][] arr, int i, int j){
        String A = arr[i][j];
        String B = arr[i][j+1];
        String C = arr[i+1][j];
        String D = arr[i+1][j+1];

        if(A.equals(B) && B.equals(C) && C.equals(D) && !A.equals(" "))
           return true;

        return false;
    }

    private static boolean[][] init (boolean[][] b, int m, int n){
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                b[i][j] = false;
        return b;
    }

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        String[][] arr = new String[m][n];
        boolean[][] chk = new boolean[m][n];
        chk = init(chk, m, n);
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = board[i].substring(j, j + 1);

        boolean wch = true;
        while(wch)
        {
            wch = false;
            for(int i = 0; i < m - 1; i++)
                for(int j = 0; j < n - 1; j++)
                    if(check(arr, i, j)){
                        chk[i][j] = true;
                        chk[i][j + 1] = true;
                        chk[i + 1][j] = true;
                        chk[i + 1][j + 1] = true;
                        wch = true;
                    }
            
            if(wch){
                for(int i = 0; i < m; i++)
                    for(int j = 0; j < n; j++)
                        if(chk[i][j]){
                            arr[i][j] = " ";
                            answer++;
                        }

                arr = set(arr, m, n);
                chk = init(chk, m, n);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        solution(m, n, board);
    }
}
