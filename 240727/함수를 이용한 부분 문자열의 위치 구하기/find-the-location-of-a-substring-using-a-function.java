import java.util.*;

public class Main {
    public static String str;
    public static String ck;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        str = sc.next();
        ck = sc.next();

        System.out.print(check());
    }

    public static int check() {
        return str.indexOf(ck);
    }
}