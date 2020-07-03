import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class test {

    public static void main(String [] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = 3;

        String s ="";
        char[] arr = new char[2001];

        for(int i = 0; i < n; i++){
            String t1 = sc.next();
            String t2 = sc.next();
            String temp = t1 + t2;
            Set<String> dup = new HashSet<String>();
            for(int j = 0; j < temp.length(); j++){
                dup.add(temp.substring(j, j + 1));
            }
            for(String x: dup){
                s += x;
            }
            System.out.println(s);
        }
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
            System.out.println(arr[i]);
        }
        for(int i = 1; i <= 26; i++){
            int counter = 0;
            for(int j = 0; j < s.length(); j++){
                if((arr[j]) == i + 96){
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
}
