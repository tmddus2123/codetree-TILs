import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i=0; i<num; i++) {

            for(int j=0; j<num; j++) {
                if(i==0 || j==0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
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