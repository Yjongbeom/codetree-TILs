import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            String str = sc.next();

            if(str.equals("add"))
            {
                int a = sc.nextInt();
                s.add(a);
            }
            else if(str.equals("largest"))
            {
                if(!s.isEmpty())
                {
                    System.out.println(s.last());
                }
                else
                {
                    System.out.println("None");
                }
            }
            else if(str.equals("smallest"))
            {
                if(!s.isEmpty())
                {
                    System.out.println(s.first());
                }
                else
                {
                    System.out.println("None");
                }
            }
            else if(str.equals("find"))
            {
                int a = sc.nextInt();

                if(s.contains(a))
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if(str.equals("lower_bound"))
            {
                int a = sc.nextInt();

                if(s.ceiling(a) != null)
                {
                    System.out.println(s.ceiling(a));
                }
                else
                {
                    System.out.println("None");
                }
            }
            else if(str.equals("upper_bound"))
            {
                int a = sc.nextInt();
                if(s.higher(a) != null)
                {
                    System.out.println(s.higher(a));
                }
                else
                {
                    System.out.println("None");
                }
            }
            else if(str.equals("remove"))
            {
                int a = sc.nextInt();
                s.remove(a);
            }

        }

    }
}