import java.io.*;
import java.util.StringTokenizer;

public class Feb2016P3 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("balancing.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("balancing.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ans = n;
        int[] xcor = new int[n];
        int[] ycor = new int[n];

        for(int i = 0;  i < n; i++){
            st = new StringTokenizer(br.readLine());
            xcor[i] = Integer.parseInt(st.nextToken());
            ycor[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int xDiv = xcor[i] + 1;
                int yDiv = ycor[j] + 1;
                int ul = 0, ur = 0, dl = 0, dr = 0;
                for(int l = 0; l < n; l++){
                    if(xcor[l] < xDiv && ycor[l] < yDiv) {
                        dl++;
                    }
                    if(xcor[l] < xDiv && ycor[l] > yDiv) {
                        ul++;
                    }
                    if(xcor[l] > xDiv && ycor[l] < yDiv) {
                        dr++;
                    }
                    if(xcor[l] > xDiv && ycor[l] > yDiv) {
                        ur++;
                    }
                }
                int worstRegion = 0;
                if(ul > worstRegion) {
                    worstRegion = ul;
                }
                if(ur > worstRegion) {
                    worstRegion = ur;
                }
                if(dl > worstRegion) {
                    worstRegion = dl;
                }
                if(dr > worstRegion) {
                    worstRegion = dr;
                }
                if(worstRegion < ans) {
                    ans = worstRegion;
                }
            }
        }

        pw.println(ans);

        br.close();
        pw.close();
    }
}
