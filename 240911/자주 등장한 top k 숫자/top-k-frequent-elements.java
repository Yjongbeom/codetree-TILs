import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> h = new HashMap<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int num = sc.nextInt();
            h.put(num, h.getOrDefault(num, 0 ) + 1);
        }

        List<Map.Entry<Integer, Integer>> h_list = new ArrayList<>(h.entrySet());

        Collections.sort(h_list, (a,b) -> {
            if(a.getValue().equals(b.getValue()))
            {
                return b.getKey() - a.getKey();
            }
            else
            {
                return b.getValue() - a.getValue();
            }
        });

        for(int i=0; i<m; i++)
        {
            System.out.print(h_list.get(i).getKey() + " ");
        }
    }
}