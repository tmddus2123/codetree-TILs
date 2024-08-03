import java.util.*;

public class Main {

    public static int[][] rect = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x; j<x+8; j++) {
                for(int k=y; k<y+8; k++) {
                    rect[j][k] = 1;
                }
            }
        
        }  
        int sum = 0;
        for(int i=0; i<201; i++) {
            for(int j=0; j<201; j++) {
                sum += rect[i][j];
            }
        }
        System.out.print(sum);
    }
}