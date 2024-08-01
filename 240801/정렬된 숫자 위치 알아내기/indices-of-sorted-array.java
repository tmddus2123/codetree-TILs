import java.util.*;

class Data{
    int element, number, pos;
    
    public Data(int element, int number) {
        this.element = element;
        this.number = number;
    }
}


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Data[] d = new Data[num];

        for(int i=0; i<num; i++) {
            int el = sc.nextInt();

            d[i] = new Data(el, i+1);
        }

        Arrays.sort(d, new Comparator<Data>() {
            @Override
            public int compare(Data a, Data b) {
                return a.element - b.element;
            }
        });

        for(int i=0; i<num; i++) {
            d[i].pos = i+1;
        }

        Arrays.sort(d, new Comparator<Data>() {
            @Override
            public int compare(Data a, Data b) {
                return a.number - b.number;
            }
        });

        for(Data d1 : d) {
            System.out.print(d1.pos + " ");
        } 
    }
}