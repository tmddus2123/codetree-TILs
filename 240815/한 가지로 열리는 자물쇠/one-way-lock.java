import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int count =0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=n; k++) {
                    if(Math.abs(x-i) <= 2 || Math.abs(y-j) <= 2 || Math.abs(z-k) <= 2){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}