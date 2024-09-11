import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> m = new TreeMap<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            String s = sc.next();

            if(s.equals("add"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();

                m.put(a,b);
            }
            else if(s.equals("find"))
            {
                int a = sc.nextInt();

                if(m.get(a) == null)
                {
                    System.out.println("None");
                }
                else
                {
                    System.out.println(m.get(a));
                }
            }
            else if(s.equals("remove"))
            {
                int a = sc.nextInt();

                if(m.get(a) != null)
                    m.remove(a);
                else
                    System.out.println("None");
            }
            else if(s.equals("print_list"))
            {
                int index = 0;
                
                Iterator<Map.Entry<Integer, Integer>> it = m.entrySet().iterator();

                while(it.hasNext())
                {
                    index++;
                    Map.Entry<Integer, Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                }
                
                if(index == 0)
                {
                    System.out.println("None");
                }
                else{
                    System.out.println();
                }
            }
            


        }

        
    }
}