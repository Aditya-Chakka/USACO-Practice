import java.io.*;
import java.util.StringTokenizer;

public class Feb2016P1 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int xmax = m/x;
        int ymax = m/y;
        int ans = 0;

        for(int i = 0; i <= xmax; i++){
            for(int j = 0; j <= ymax; j++){
                if(i*x + j*y <= m){
                    ans = Math.max(ans, i*x + j*y);
                }
            }
        }

        pw.println(ans);

        br.close();
        pw.close();
    }
}
