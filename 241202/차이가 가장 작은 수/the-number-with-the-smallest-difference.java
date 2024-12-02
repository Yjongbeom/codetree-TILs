import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 99999999;

        for(int i=0; i<n; i++)
        {
            h.add(sc.nextInt());
        }

        for(int i=0; i<n; i++)
        {
            int a = h.first();
            int b = h.last();

            if(b - a >= m)
            {
                if(min > b-a)
                {
                    min = b-a;
                }
            }
            else
            {
                h.remove(h.last());
            }
        }

        System.out.println(min);

    }
}