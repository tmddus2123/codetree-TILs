import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        while(true) {
            if(n >= 1) {
                count++;
                n /= count;
            } else {
                break;
            }
        }

        System.out.print(count);
    }
}