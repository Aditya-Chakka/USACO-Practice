import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Open2016P3 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("reduce.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("reduce.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        coord[] cows1 = new coord[n];
        coord[] cows2 = new coord[n];


        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            cows1[i] = new coord(x1, y1);
            cows2[i] = new coord(x1, y1);
        }
        Arrays.sort(cows1);
        yCompare ycomp = new yCompare();
        Arrays.sort(cows2, ycomp);
        int a1, a2, a3, a4;
        if(cows1[n-1].y == cows2[n-1].y){
            a1 = (cows1[n - 2].x - cows1[0].x)*(cows2[n - 2].y - cows2[0].y);
        }
        else{
            a1 = (cows1[n - 2].x - cows1[0].x)*(cows2[n - 1].y - cows2[0].y);
        }

        if(cows1[0].y == cows2[0].y){
            a2 = (cows1[n - 1].x - cows1[1].x)*(cows2[n - 1].y - cows2[1].y);
        }
        else{
            a2 = (cows1[n - 1].x - cows1[1].x)*(cows2[n - 1].y - cows2[0].y);
        }

        if(cows2[n - 1].x == cows1[n - 1].x){
            a3 = (cows1[n - 2].x - cows1[0].x)*(cows2[n - 2].y - cows2[0].y);
        }
        else{
            a3 = (cows1[n - 1].x - cows1[0].x)*(cows2[n - 2].y - cows2[0].y);
        }

        if(cows2[0].x == cows1[0].x){
            a4 = (cows1[n - 1].x - cows1[1].x)*(cows2[n - 1].y - cows2[1].y);
        }
        else{
            a4 = (cows1[n - 1].x - cows1[0].x)*(cows2[n - 1].y - cows2[1].y);
        }

        int ans = Math.min(Math.min(a1, a2), Math.min(a3, a4));



        pw.println(ans);

        br.close();
        pw.close();
    }
    static class coord implements Comparable<coord>{
        int x,y;
        public coord(int a, int b){
            x = a;
            y = b;
        }

        public int getx(){
            return x;
        }
        public int gety(){
            return y;
        }

        @Override
        public int compareTo (coord a){
            return this.x - a.x;
        }
    }
     static class yCompare implements Comparator<coord>{
        public int compare(coord a, coord b){
            return a.gety() - (b.gety());
        }
    }
}
