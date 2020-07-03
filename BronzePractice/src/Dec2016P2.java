import java.io.*;
import java.util.*;

public class Dec2016P2 {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String s ="";
        char[] arr = new char[2001];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String t1 = st.nextToken();
            String t2 = st.nextToken();
            String temp = t1 + t2;
            Set<String> dup = new HashSet<String>();
            for(int j = 0; j < temp.length(); j++){
                dup.add(temp.substring(j, j + 1));
            }
            for(String x: dup){
                s += x;
            }
        }
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        for(int i = 1; i <= 26; i++){
            int counter = 0;
            for(int j = 0; j < s.length(); j++){
                if((arr[j]) == i + 96){
                    counter++;
                }
            }
            pw.println(counter);
        }

        br.close();
        pw.close();
    }
}
