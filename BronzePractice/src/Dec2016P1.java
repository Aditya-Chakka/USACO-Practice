import java.io.*;
import java.util.StringTokenizer;

public class Dec2016P1 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        if(maxX - minX > maxY - minY){
            pw.println((int)Math.pow(maxX - minX, 2));
        }
        else{
            pw.println((int)Math.pow(maxY - minY, 2));
        }

        br.close();
        pw.close();
    }
}
