import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet h1 = new HashSet<>();
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
            h1.add(arr1[i]);
        }

        int m = sc.nextInt();
        
        for(int i=0; i<m; i++)
        {
            int a = sc.nextInt();

            if(h1.contains(a))
            {
                System.out.print(1 + " ");
            }
            else
            {
                System.out.print(0 + " ");
            }
        }
    }
}