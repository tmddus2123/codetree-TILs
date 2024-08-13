import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<num; i++) { // 시작점
            for(int j=i; j<num; j++) {

                int sum = 0;
                for(int k=i; k <= j; k++) {
                    sum += arr[k];
                }

                double avg = (double)sum / (j-i+1);
                boolean result = false;
                for(int k=i; k <= j; k++) {
                    if(avg == arr[k]) {
                        result = true;
                    }
                }

                if(result) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}