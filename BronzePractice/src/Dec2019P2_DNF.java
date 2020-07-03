import java.io.*;
import java.util.StringTokenizer;

public class Dec2019P2_DNF {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        for(int i = 1; i <= n; i++ ){
            boolean check = true;
            for(int j = 0; j + i < n; j++){
                for(int l = 1; l < j; l++){
//                    if(){
//
//                    }
                }
            }
            if(check){
                break;
            }
        }

        pw.println();

        br.close();
        pw.close();
    }

}
