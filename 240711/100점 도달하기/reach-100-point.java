import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        for(int i=score; i<= 100; i++) {
            String grade = "F";
            if(i >= 90) {
                grade = "A";
            } else if(i >= 80) {
                grade = "B";
            } else if(i >= 70) {
                grade = "C";
            } else if(i >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            bw.write(grade + " ");
        }

        br.close();
        bw.close();
    }
}