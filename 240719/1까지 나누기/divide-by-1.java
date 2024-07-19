import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        while(n > 1) {
            count++;
            n /= count;
        }

        System.out.print(count);
    }
}