import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            if(i % 3 == 0) {
                System.out.print("0 ");
            } else if(String.valueOf(i).indexOf("3") > -1) {
                System.out.print("0 ");
            } else if(String.valueOf(i).indexOf("6") > -1) {
                System.out.print("0 ");
            } else if(String.valueOf(i).indexOf("9") > -1) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}