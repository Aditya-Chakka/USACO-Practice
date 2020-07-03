import java.io.*;
import java.util.StringTokenizer;

public class Open2016P1 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("diamond.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("diamond.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int max = 0;
            int val = arr[i];
            for(int j = 0; j < n; j++){
                if(Math.abs(val - arr[j]) <= k && arr[j] >= val){
                    max++;
                }
            }
            if(max > ans){
                ans = max;
            }
        }


        pw.println(ans);

        br.close();
        pw.close();
    }

}
