import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> s = new TreeSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=m; i++)
        {
            s.add(i);
        }

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();

            if(s.ceiling(a) != null)
                s.remove(a);
                System.out.println(s.last());
        }
    }
}