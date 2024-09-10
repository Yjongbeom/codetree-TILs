import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> h = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            ArrayList<Character> s_list = new ArrayList<>();

            String s = sc.next();

            for(char ch : s.toCharArray())
            {
                s_list.add(ch);
            }

            Collections.sort(s_list);

            StringBuilder tmp = new StringBuilder();
            for(char ch : s_list)
            {
                tmp.append(ch);
            }

            h.put(tmp.toString(), h.getOrDefault(tmp.toString(), 0)+1);

        }

        List<Map.Entry<String, Integer>> h_list = new ArrayList<>(h.entrySet());

        Collections.sort(h_list, (a,b) -> {
            if(a.getValue().equals(b.getValue()))
                return b.getKey().compareTo(a.getKey());
            else
                return b.getValue() - a.getValue();
        });

        System.out.println(h_list.get(0).getValue());
    }
}