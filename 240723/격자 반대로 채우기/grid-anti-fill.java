import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];

        int result = 1;
        for(int i=0; i<num; i++) {
            int pos = num-i-1;

            if(i%2 == 0) { //++
                for(int j=num-1; j>=0; j--) {
                    arr[j][pos] = result;
                    result++;
                }
            } else {
                for(int j=0; j<num; j++) {
                    arr[j][pos] = result;
                    result++;
                }
            }
        }

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}