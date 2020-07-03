import java.io.*;
import java.util.StringTokenizer;

public class Jan2016P1 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("promote.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int g1 = Integer.parseInt(st.nextToken());
        int g2 =Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int pf = p2 - p1;
        int gf = g2 - g1 + p2 - p1;
        int sf = s2 - s1 + g2 - g1 + p2 - p1;

        pw.println(sf);
        pw.println(gf);
        pw.println(pf);

        pw.close();
        br.close();
    }

}
