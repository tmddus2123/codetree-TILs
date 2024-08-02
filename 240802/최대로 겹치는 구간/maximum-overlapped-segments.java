import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] line = new int[201];

        for(int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=a; j<b; j++) {
                line[j + 100]++;
            }
        }

        int max = line[0];
        for(int i=1; i<201; i++) {
            if(max < line[i]) {
                max = line[i];
            }
        }
        System.out.print(max);
    }
}