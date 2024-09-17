import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> s = new TreeSet<>();

        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int m = sc.nextInt();

            for(int j=0; j<m; j++)
            {
                String str = sc.next();
                int a = sc.nextInt();

                if(str.equals("I"))
                {
                    s.add(a);
                }
                else if(str.equals("D") && a == 1)
                {
                    if(!s.isEmpty())
                    {
                        s.remove(s.last());
                    }
                }
                else if(str.equals("D") && a == -1)
                {
                    if(!s.isEmpty())
                    {
                        s.remove(s.first());
                    }
                }

            }

            if(!s.isEmpty())
            {
                System.out.println(s.last() + " " + s.first());
            }
            else
            {
                System.out.println("EMPTY");
            }
        }
    
    }
}