import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isTrue(num)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isTrue(int num) {
        int a0 = num%10;
        int a1 = num/10;

        if(num % 2 == 0 && (a0 + a1)%5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}