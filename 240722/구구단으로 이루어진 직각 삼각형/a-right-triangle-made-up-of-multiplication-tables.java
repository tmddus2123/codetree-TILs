import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num-i+1; j++) {
                if(j != 1) {
                    System.out.print(" / ");
                }
                System.out.print(i + " * " + j + " = " + (i*j));
            }
            System.out.print("\n");
        }
    }
}