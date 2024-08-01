import java.util.*;

class Position implements Comparable<Position>{
    int x, y, dis, number, rank;

    public Position(int x, int y, int dis, int number) {
        this.x = x;
        this.y = y;
        this.dis = dis;
        this.number = number;
    }

    public void toRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Position p) {
        if(this.dis == p.dis) {
            return this.number - p.number;
        }
        return this.dis - p.dis ;
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

            p[i] = new Position(x, y, x+y, i+1);
        }

        Arrays.sort(p);

        for(int i=0; i<num; i++) {
            p[i].rank = i+1;
        }

        Arrays.sort(p, new Comparator<Position>() {
            @Override
            public int compare(Position a, Position b) {
                return a.number - b.number;
            }
        });

        for(int i=0; i<num; i++) {
            System.out.println(p[i].rank);
        }
    }
}