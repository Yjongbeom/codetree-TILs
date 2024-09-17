import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet s = new HashSet<>();

        int n = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();

            if(s.contains(a))
            {
                continue;
            }
            else
            {
                count++;
                s.add(a);
            }
        }

        System.out.println(count);
        
    }
}