import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x1 = new int[num];
        int[] x2 = new int[num];

        for(int i=0; i<num; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }


        int[] result = new int[num];
        for(int i=0; i<num; i++) {
            for(int j=i+1; j<num; j++) {
                if((x1[i] < x1[j] && x2[i] > x2[j]) || (x1[i] > x1[j] && x2[i] < x2[j])) {
                    result[i]++;
                    result[j]++;
                }
            }
        }
        int count = 0;
        for(int i=0; i<num; i++) {
            if(result[i] == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}