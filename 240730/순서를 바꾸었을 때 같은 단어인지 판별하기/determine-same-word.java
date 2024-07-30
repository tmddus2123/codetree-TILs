import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        a = new String(arr1);
        b = new String(arr2);

        if(a.equals(b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}