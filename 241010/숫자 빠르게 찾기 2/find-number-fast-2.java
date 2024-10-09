import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> s = new TreeSet<>();

        for(int i=0; i<n; i++)
            s.add(sc.nextInt());

        for(int i=0; i<m; i++)
        {
            int x = sc.nextInt();

            if(s.ceiling(x) == null)
                System.out.println(-1);
            else
                System.out.println(s.ceiling(x) + " ");
        }
    }
}