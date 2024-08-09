import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for(int i=0; i<num; i++) {

            for(int j = i+1; j<num; j++) {

                for(int k = j+1; k<num; k++) {
                    int n1 = arr[i];
                    int n2 = arr[j];
                    int n3 = arr[k];
                    boolean result = true;
                    while(n1 > 10 || n2 > 10 || n3 > 10) {
                        if(10 < (n1 % 10) + (n2 % 10) + (n3 % 10)) {
                           result = false;
                            break;
                        }
                        n1 /= 10;
                        n2 /= 10;
                        n3 /= 10;
                    }
                    if(result) {
                        max = Math.max(max, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
        System.out.print(max);
    }
}