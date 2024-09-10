import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> si = new HashMap<>();
        HashMap<Integer, String> is = new HashMap<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            String s = sc.next();
            
            si.put(s, i);
            is.put(i, s);
        }

        for(int i=0; i<m; i++)
        {
            if(sc.hasNextInt())
            {
                int num = sc.nextInt();
                System.out.println(is.get(num));
            }
            else
            {

                String s = sc.next();
                
                System.out.println(si.get(s));
            }
        }
    }
}