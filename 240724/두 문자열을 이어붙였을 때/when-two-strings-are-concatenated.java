import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if((a+b).equals(b+a)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}