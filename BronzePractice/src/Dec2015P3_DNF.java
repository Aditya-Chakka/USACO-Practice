import java.io.*;
import java.util.StringTokenizer;

public class Dec2015P3_DNF {

    static int[] person = new int[1001];
    static int[] milk = new int[1001];
    static int[] time =  new int[1001];
    static int[] personSick = new int[1001];
    static int [] timeSick = new int[1001];

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("badmilk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("badmilk.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= d; i++){
            st = new StringTokenizer(br.readLine());
            person[i] = Integer.parseInt(st.nextToken());
            milk[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= s; i++){
            st = new StringTokenizer(br.readLine());
            personSick[i] = Integer.parseInt(st.nextToken());
            timeSick[i] = Integer.parseInt(st.nextToken());
        }



        pw.println();

        pw.close();
        br.close();
    }

}
