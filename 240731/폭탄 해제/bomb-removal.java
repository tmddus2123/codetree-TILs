import java.util.*;

class Bomb {
    String code;
    String color;
    int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bomb b = new Bomb(code, color, second);
        System.out.print("code : " + b.code + "\ncolor : " + b.color + "\nsecond : " + b.second);
    }
}