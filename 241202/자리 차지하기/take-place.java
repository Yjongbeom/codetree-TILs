import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> chairs = new TreeSet<>();
        for (int i = 1; i <= m; i++) {
            chairs.add(i);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();

            Integer chair = chairs.ceiling(ai);
            if (chair != null && chair <= ai) 
            {
                chairs.remove(chair);
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