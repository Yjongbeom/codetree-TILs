import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {         
        if(this.x != p.x)       
            return this.x - p.x;  
        else                             
            return this.y - p.y; 
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Pair> s = new TreeSet<>();


        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            s.add(new Pair(a, b));
        }
        
        for(int i=0; i<m; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Pair bf = s.ceiling(new Pair(a, b));

            if(bf != null)  
                System.out.println(bf.x + " "  + bf.y);
            else
                System.out.println(-1 + " " + -1);
        }
    }
}