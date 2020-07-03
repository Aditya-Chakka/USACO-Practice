import java.io.*;
import java.util.StringTokenizer;

public class Dec2015P1 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        s = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(s.nextToken());
        int d = Integer.parseInt(s.nextToken());
        int ans = 0;
//        int a = 7, b = 10, c = 4, d = 8;

        int[] arr = new int[101];
        for(int i = a; i < b; i++){
            if(arr[i] != 1){
                arr[i] = 1;
            }
        }
        for(int i = c; i < d; i++){
            if(arr[i] != 1){
                arr[i] = 1;
            }
        }
        for(int i = 1; i < 101; i++){
            if(arr[i] == 1) {
                ans++;
            }
        }

//        System.out.println(ans);
        pw.print(ans);

        pw.close();
        br.close();
    }

}
