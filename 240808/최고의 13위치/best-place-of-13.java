import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] map = new int[num][num];

        int max = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                map[i][j] = sc.nextInt();
            }
        }


        for(int i=0; i<num; i++) {
            for(int j=0; j<num-2; j++) {
                max = Math.max(max, map[i][j] + map[i][j+1] + map[i][j+2]);
            }
        }
        System.out.print(max);
    }
}