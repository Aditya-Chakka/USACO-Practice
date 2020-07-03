import java.io.*;
import java.util.StringTokenizer;

public class Feb2016P2 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("cbarn.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] barn = new int[n * 2];
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int  num = Integer.parseInt(st.nextToken());
            barn[i] = num;
            barn[i + n] = num;
            sum += num;
        }

        for(int i = 0; i < n; i++){
            int tempsum = sum;
            int startLocation = i;
            int runsum = 0;
            for(int j = startLocation; j < startLocation + n; j++){
                int space = barn[j];
                tempsum -= space;
                runsum += tempsum;
            }
            if(runsum < ans){
                ans = runsum;
            }
        }

        pw.println(ans);

        br.close();
        pw.close();
    }
}
