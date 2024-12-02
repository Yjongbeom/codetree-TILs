import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        TreeSet<Integer> h = new TreeSet<>();
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++)
        {
            h.add(i+1);
        }

        int count = 0;

        for(int i=0; i<n; i++)
        {
            Integer p = h.floor(arr[i]);

            if(p != null)
            {
                h.remove(p);
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println(count);

    }   
}