import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet h = new HashSet<>();
        
        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();

            h.add(a);
        }

        int m = sc.nextInt();

        for(int i=0; i<m; i++)
        {
            int a = sc.nextInt();

            if(h.contains(a))
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0)
;            }
        }
    }
}