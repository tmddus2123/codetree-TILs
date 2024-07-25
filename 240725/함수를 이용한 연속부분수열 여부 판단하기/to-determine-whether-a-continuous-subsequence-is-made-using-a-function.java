import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        for(int i=0; i<a; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<b; i++) {
            arr2[i] = sc.nextInt();
        }

        if(isContains(arr1, arr2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isContains(int[] n1, int[] n2) {
        for(int i=0; i<=n1.length - n2.length; i++) {
            int count = 0;
            for(int j=0; j<n2.length; j++) {
                if(n1[i + count] == n2[j]) {
                    count++;
                } else {
                    break;
                }
            }
            if(count == n2.length) {
                return true;
            }
        }
        return false;
    }
}