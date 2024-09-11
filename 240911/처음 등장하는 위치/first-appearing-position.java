import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> m = new TreeMap<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            if(!m.containsKey(a))
            {
                m.put(a, i+1);
            }
        }

        List<Map.Entry<Integer, Integer>> m_list = new ArrayList<>(m.entrySet());

        Collections.sort(m_list, Map.Entry.comparingByKey());

        for(Map.Entry<Integer,Integer> entry : m_list)
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}