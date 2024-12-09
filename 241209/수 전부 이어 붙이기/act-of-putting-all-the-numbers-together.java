import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(i%2==1)
            {
                String s1 = arr[i-1].toString();
                String s2 = arr[i].toString();

                System.out.println(s1 + s2);
            }
            else if(i==n-1 && i%2 == 0)
            {
                String s1 = arr[i].toString();
                System.out.println(s1);
            }
        }
        
    }
}