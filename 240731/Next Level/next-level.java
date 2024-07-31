import java.util.*;

class User {
    String id;
    int lv;

    User() {
        this.id = "codetree";
        this.lv = 10;
    }

    User(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String id = sc.next();
        int lv = sc.nextInt();

        User u = new User();
        System.out.print("user " + u.id + " lv " + u.lv + "\n");

        u = new User(id, lv);
        System.out.print("user " + u.id + " lv " + u.lv);
    }
}