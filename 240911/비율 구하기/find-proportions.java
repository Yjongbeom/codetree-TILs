import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> m = new TreeMap<>();
       
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            m.put(s, m.getOrDefault(s, 0) + 1);
        }

        Iterator<Map.Entry<String, Integer>> it = m.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<String, Integer> entry = it.next();

            System.out.printf("%s %.4f\n", entry.getKey(), (entry.getValue()/(float)(n))*100.0);
        }
    }
}