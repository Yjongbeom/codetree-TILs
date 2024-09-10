import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> h = new HashMap<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();

            if(h.get(a) == null)
            {
                h.put(a, 1);
            }
            else
            {
                int num = h.get(a);
                h.put(a, num+1);
            }
            
        }

        for(int i=0; i<m; i++)
        {
            int a = sc.nextInt();

            if(h.get(a) == null)
            {
                System.out.print(0 + " ");
            }
            else
            {
                System.out.print(h.get(a) + " ");
            }
        }
        
    }
}