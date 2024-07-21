import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            if(i == 0 || i == num-1) {
                for(int j=0; j<num; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            } else {
                for(int j=0; j<num; j++) {
                    if(j == 0 || j == num-1) {
                        System.out.print("* ");
                    } else if(j < i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}