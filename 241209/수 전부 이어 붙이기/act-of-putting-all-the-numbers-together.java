import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();

        for(int i=0; i<n; i++)
        {
            s.append(sc.nextInt());
        }

        for(int i=0; i<s.length(); i++)
        {
            if((i+1) % 5 == 0 && i > 0)
            {
                System.out.println(s.substring(i, i+1));
            }
            else
            {
                System.out.print(s.substring(i, i+1));
            }
        }


        
        
        
    }
}