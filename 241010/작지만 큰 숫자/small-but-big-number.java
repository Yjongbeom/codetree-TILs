import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> s = new TreeSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            s.add(sc.nextInt());
        }

        for(int i=0; i<m; i++)
        {
            int a = sc.nextInt();

            if(s.lower(a+1) != null)
            {
                System.out.println(s.lower(a+1));
                s.remove(s.lower(a+1));
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}