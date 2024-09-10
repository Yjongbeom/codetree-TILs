import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            String str = sc.next();
            
            if(str.equals("add"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();

                m.put(a, b);
            }
            else if(str.equals("find"))
            {
                int a = sc.nextInt();
                
                if(m.get(a) != null)
                    System.out.println(m.get(a));
                else
                    System.out.println("None");
            }
            else if(str.equals("remove"))
            {
                int a = sc.nextInt();

                m.remove(a);
            }

        }
    }
}