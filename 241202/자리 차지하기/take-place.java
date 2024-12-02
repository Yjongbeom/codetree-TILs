import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<a; i++)
        {
            int p = sc.nextInt();
            
            h.add(p);
        }
        System.out.println(h.size());
        
    }
}