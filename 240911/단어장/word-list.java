import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> m = new TreeMap<>();

        for(int i=0; i<n; i++)
        {
            String s = sc.next();

            m.put(s, m.getOrDefault(s, 0)+1);

            
        }

        for(Map.Entry<String,Integer> entry : m.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}