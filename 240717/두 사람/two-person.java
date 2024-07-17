import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        String gen1 = sc.nextLine();

        if(age1 >= 19 && gen1.equals(" M")) {
            System.out.print("1");
            return;
        }
        
        int age2 = sc.nextInt();
        String gen2 = sc.nextLine();

        if(age2 >= 19 && gen2.equals(" M")) {
            System.out.print("1");
            return;
        }

        System.out.print("0");
    }
}