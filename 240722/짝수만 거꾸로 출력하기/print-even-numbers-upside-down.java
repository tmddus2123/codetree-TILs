import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        for(int i=0; i<num; i++) {
            int n = Integer.parseInt(arr[num - i - 1]);
            if(n % 2 == 0) {
                bw.write(n + " ");
            }
        }

        br.close();
        bw.close();
    }  
}