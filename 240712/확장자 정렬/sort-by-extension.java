import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();

        for(int i=0; i<num; i++) {
            String fileName = br.readLine();

            int index = fileName.indexOf(".");
            String ext = fileName.substring(index + 1, fileName.length());

            Integer cnt = 0;
            if(map.containsKey(ext)) {
                cnt = map.get(ext);
            }
            map.put(ext, ++cnt);
        }

        for ( String key : map.keySet() ) {
            bw.write(key + " " + map.get(key) + "\n");
        }

        br.close();
        bw.close();
    
    }
}