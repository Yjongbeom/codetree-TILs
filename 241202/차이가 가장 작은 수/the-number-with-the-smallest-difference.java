import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (int num : h) {
            Integer higher = h.ceiling(num + m);
            if (higher != null) {
                found = true;
                min = Math.min(min, higher - num);
            }
        }

        System.out.println(found ? min : -1);
    }
}
