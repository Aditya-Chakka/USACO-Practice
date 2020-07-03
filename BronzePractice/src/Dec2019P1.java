import java.io.*;
import java.util.StringTokenizer;

public class Dec2019P1 {

    static int k, n;
    static int[][] arr = new int[10][20];

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
         k = Integer.parseInt(st.nextToken());
         n = Integer.parseInt(st.nextToken());
        int ans = 0;

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++ ){
                if(didBetter(i, j) == k){
                    ans++;
                }
            }
        }

        pw.println(ans);

        br.close();
        pw.close();
    }

    static int didBetter(int a, int b){
        int total = 0;
        for(int i = 0; i < k; i++){
            if(better(a, b, i)){
                total++;
            }
        }
        return total;
    }

    static boolean better(int a, int b, int round){
        int x = 0, y = 0;
        for(int i = 0; i < n; i++){
            if(arr[round][i] == a){
                x = i;
            }
            if(arr[round][i] == b){
                y = i;
            }
        }
        if(x == y){
            return false;
        }
        if(x > y){
            return false;
        }
        return true;
    }
}
