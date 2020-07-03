import java.io.*;
import java.util.StringTokenizer;

public class Dec2015P2 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        int[] speed = new int[101];
        int[] cowspeed = new int[101];
        int  maxSpeed = 0;


        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());

        int counter = 1;
        for(int i = 0; i < n; i++){
            s = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(s.nextToken());
            int mph = Integer.parseInt(s.nextToken());
            for(int j = 1; j <= len; j++){
                speed[counter++] = mph;
            }
        }
        counter = 1;
        for(int i = 0; i < m; i++){
            s = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(s.nextToken());
            int mph = Integer.parseInt(s.nextToken());
            for(int j = 1; j <= len; j++){
                cowspeed[counter] = mph;
                counter++;
            }
        }

        for(int i = 1; i < 101; i++){
            if(cowspeed[i] > speed[i]){
                int temp = cowspeed[i] - speed[i];
                if(temp > maxSpeed){
                    maxSpeed = temp;
                }
            }
        }

        pw.print(maxSpeed);

        pw.close();
        br.close();
    }

}
