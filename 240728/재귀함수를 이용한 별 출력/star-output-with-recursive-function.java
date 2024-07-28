import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        recur(num);
    }

    public static void recur(int num) {
        if(num == 0) {
            return;
        }

        recur(num-1);
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}