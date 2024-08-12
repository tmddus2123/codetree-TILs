import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 0, y = 0;
        int max1 = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num-2; j++) {
                if(max1 <= arr[i][j] + arr[i][j+1] + arr[i][j+2]) {
                    max1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                    x = i;
                    y = j;
                }
            }
        }

        int max2 = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num-2; j++) {
                if(i == x && (j == y || j == y+1 || j == y+2 || j+1 == y || j+2 == y)) {
                    continue;
                }
                max2 = Math.max(max2, arr[i][j] + arr[i][j+1] + arr[i][j+2]);
            }
        }
        System.out.print(max1 + max2);
    }
}