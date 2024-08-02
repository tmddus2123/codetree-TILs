import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        m1 = h1 * 60 + m1;
        m2 = h2 * 60 + m2;

        System.out.print(m2-m1);
    }
}