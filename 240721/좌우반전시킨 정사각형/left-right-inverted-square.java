import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=num; j>=1; j--) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}