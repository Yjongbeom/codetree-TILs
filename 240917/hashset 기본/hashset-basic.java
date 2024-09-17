import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            int num = sc.nextInt();

            if(s.equals("find"))
            {
                System.out.println(h.contains(num));
            }
            else if(s.equals("add"))
            {
                h.add(num);
            }
            else
            {
                h.remove(num);
            }
        }

    }
}