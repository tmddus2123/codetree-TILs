import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= 1) {
            for(int i=0; i<b; i++) {
                System.out.print(String.valueOf(a));
            }
        } else {
            System.out.print(0);
        }
    }
}