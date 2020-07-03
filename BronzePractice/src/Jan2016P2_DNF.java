import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jan2016P2_DNF {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("angry.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] cows = new int[n];
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            cows[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cows);

        for(int i = 0; i < n; i++){
            int indexLeftMostCow = explosionIndex(cows, i, -1);
            int indexRightMostCow = explosionIndex(cows, i, 1);

            if((indexRightMostCow - indexLeftMostCow + 1) > maxCount){
                maxCount = indexRightMostCow - indexLeftMostCow + 1;
            }
        }

        pw.println(maxCount);

        pw.close();
        br.close();
    }

    static int explosionIndex(int[] arr, int location, int dir){
        int radius = 1;
        while(location >= 0 && location <= arr.length - 1){
            int nextLocation = location;
            while((nextLocation + dir >= 0 && nextLocation + dir <= arr.length - 1) && (Math.abs(arr[location] - arr[nextLocation]) <= radius)){
                nextLocation += dir;
            }
            if(nextLocation == location){
                break;
            }
            location = nextLocation;
            radius++;
        }
        return location;
    }
}
