import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> s = new TreeSet<>();

        int n = sc.nextInt();
        s.add(0);
        int min_len = 9999999;
        
        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();

            if(s.higher(x) != null)
            {
                if(min_len > s.higher(x) - x)
                    min_len = s.higher(x) - x;
                
            }

            if(min_len > x - s.lower(x))
                min_len = x - s.lower(x);
            
            s.add(x);
            System.out.println(min_len);
        }
    }
}