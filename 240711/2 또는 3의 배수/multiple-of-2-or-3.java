import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i<=num ; i++) {
            if(i % 2 == 0 || i % 3 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }


        }
    }
}