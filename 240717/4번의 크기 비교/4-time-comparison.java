import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i=0; i<4; i++) {
            int num = sc.nextInt();
            System.out.println((a>num) ? 1 : 0);
        }
    }
}