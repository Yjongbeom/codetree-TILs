import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> h = new HashMap<>();

        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(h.get(x) == null)
            {
                h.put(x, y);
            }
            else
            {
                int y2 = h.get(x);

                if(y < y2)
                {
                    h.put(x, y);
                }
                else
                {
                    h.put(x, y2);
                }
            }
        }

        for(int value : h.values())
        {
            sum += value;
        }

        System.out.println(sum);

        
    }
}