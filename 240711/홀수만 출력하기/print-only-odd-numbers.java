import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num % 3 == 0) {
                bw.write(num + "\n");
            }
        }

    
        br.close();
        bw.close();
    }
}