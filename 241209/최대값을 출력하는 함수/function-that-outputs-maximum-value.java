import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -99999999;

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            if(max < a)
            {
                max = a;
            }
        }

        System.out.println(max);

        
    }
}