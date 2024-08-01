import java.util.*;

class Position {
    int dis, number, rank;

    public Position(int dis, int number) {
        this.dis = dis;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Position[] p = new Position[num];

        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            x = (x > 0) ? x : -x;
            y = (y > 0) ? y : -y; 

            p[i] = new Position(x+y, i+1);
        }

        Arrays.sort(p, new Comparator<Position>() {
            @Override
            public int compare(Position a, Position b) {
                if(a.dis == b.dis) {
                    return a.number - b.number;
                } else {
                    return a.dis - b.dis;
                }
            }
        });

        for(int i=0; i<num; i++) {
            System.out.println(p[i].number);
        }
    }
}