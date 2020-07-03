import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jan2016P3 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("mowing.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] step = new int[n];
        char[] dir = new char[n];
        int[][] grid = new int[2001][2001];
        for(int[] row: grid){
            Arrays.fill(row, -1);
        }
        grid[1000][1000] = 0;
        int total = 1, time = 10000;
        int curx = 1000, cury = 1000;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            dir[i] = st.nextToken().charAt(0);
            step[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int dx = 0, dy = 0;
            int dist = 0;
            if(dir[i] == 'N'){
                dy = -1;
            }
            if(dir[i] == 'S'){
                dy = 1;
            }
            if(dir[i] == 'E'){
                dx = 1;
            }
            if(dir[i] == 'W'){
                dx = -1;
            }
            dist = step[i];

            for(int j = 0; j < dist; j++){
                if(grid[curx + dx][cury + dy] != -1){
                    if(total - grid[curx + dx][cury + dy] < time){
                        time = total - grid[curx + dx][cury + dy];
                    }
                }
                grid[curx + dx][cury + dy] = total;
                curx += dx;
                cury += dy;
                total++;
            }
        }
        if(time == 10000){
            pw.println(-1);
        }
        else{
            pw.println(time);
        }

        pw.close();
        br.close();
    }
}
