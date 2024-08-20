import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int budget = sc.nextInt();
        
        int[] price = new int[n];
        int[] fee = new int[n];

        for(int i=0; i<n; i++) {
            price[i] = sc.nextInt();
            fee[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            int[] salePrice = price.clone();

            salePrice[i] = salePrice[i]/2;
            
            for(int j=0; j<n; j++) {
                salePrice[j] += fee[j];
            }

            Arrays.sort(salePrice);
            int sum = 0;
            int count = 0;
            for(int j=0; j<n; j++) {
                sum += salePrice[j];
                if(sum > budget) {
                    break;
                }
                count++;
            }
            if(max < count) {
                max = count;
            }
        }
        System.out.print(max);
    }
}