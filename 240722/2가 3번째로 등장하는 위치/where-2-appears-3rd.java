import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;
        int pos = 0;

        for(int i=1; i<=num; i++) {
            int n = sc.nextInt();
            if(n == 2) {
                result++;
                if(result == 3) {
                    pos = i;
                }
            }
        }
        System.out.print(pos);
    }
}