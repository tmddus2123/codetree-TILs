import java.util.*;

public class Main {

    public static int[] line = new int[2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int stand = 1000;
        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            String dir = sc.next();


            if(dir.equals("R")) {
                for(int j=stand; j<stand + x; j++) {
                    line[j]++;
                }
                stand += x;
            } else if(dir.equals("L")) {
                for(int j=stand - x; j<stand; j++) {
                    line[j]++;
                }
                stand -= x;
            }
        }

        int count = 0;
        for(int i=0; i<2001; i++) {
            if(line[i] >= 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}