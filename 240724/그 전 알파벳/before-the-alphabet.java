import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if(ch == 'a') {
            System.out.print("z");
        } else {
            System.out.print((char)(ch-1));
        }
    }
}