import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<n; i++)
        {
            int current = arr[i];
            int target = k - current;

            if(map.containsKey(target))
            {
                count += map.get(target);
            }

            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        System.out.println(count);

    }
}