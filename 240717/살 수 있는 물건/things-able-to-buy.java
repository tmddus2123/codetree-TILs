import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String thing = "no";

        if(num >= 3000) {
            thing = "book";
        } else if(num >= 1000) {
            thing = "mask";
        }

        System.out.print(thing);
    }
}