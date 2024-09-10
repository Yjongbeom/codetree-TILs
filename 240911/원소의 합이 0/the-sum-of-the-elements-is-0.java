import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int d[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            b[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            c[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            d[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> ab = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int sum = a[i]+b[j];

                ab.put(sum, ab.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int sum = c[i]+d[j];

                if(ab.get(-sum) != null)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}