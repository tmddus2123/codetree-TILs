import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();


        int min = 1000;
        int max = 0;

        int[] taArr = new int[n];
        int[] tbArr = new int[n];
        for(int i=0; i<n; i++) {
            taArr[i] = sc.nextInt();
            tbArr[i] = sc.nextInt();

            min = Math.min(min, taArr[i]);
            max = Math.max(max, tbArr[i]);
        }

        int result = 0;
        for(int i=min-1; i<=max+1; i++) {
            
            int amount = 0;
            for(int j=0; j<n; j++) {
                if(i < taArr[j]) {
                    amount += c;
                } else if(taArr[j] <= i && i <= tbArr[j]) {
                    amount += g;
                } else if(tbArr[j] < i) {
                    amount += h;
                }
            }

            result = Math.max(amount, result);
        }
        System.out.print(result);
    }
}