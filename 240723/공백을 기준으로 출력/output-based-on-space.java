import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = String.join("", s1.split(" "));
        s2 = String.join("", s2.split(" "));

        System.out.print(s1 + s2);
    }
}