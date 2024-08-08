import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        String[][] arr = new String[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.next();
            }
        }
        int count = 0;
        for(int i=1; i<r-1; i++) {
            for(int j=1; j<c-1; j++) {
                for(int n=i+1; n<r-1; n++) {
                    for(int m=j+1; m<c-1; m++) {
                        if(arr[i][j].equals("B") && arr[n][m].equals("W")) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}