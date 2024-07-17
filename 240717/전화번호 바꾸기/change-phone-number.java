import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String middle = num.substring(4, 8);
        String end = num.substring(9, 13);

        System.out.print("010-" + end + "-" + middle);
    }
}