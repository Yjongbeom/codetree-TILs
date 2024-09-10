import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();
        int maxs = -9999999;

        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i<n; i++)
        {
            String str = sc.next();

            if(h.get(str) == null)
            {
                h.put(str, 1);
                arr.add(str);
            }
            else
            {
                int num = h.get(str);
                h.put(str, num+1);
            }
        }

        for(String s : arr)
        {
            int num = h.get(s);
            if(num > maxs)
                maxs = num;
        }

        System.out.println(maxs);
    }
}