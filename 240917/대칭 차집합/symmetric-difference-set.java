import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet s1 = new HashSet<>();
        HashSet s2 = new HashSet<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int arr1[] = new int[a];
        int arr2[] = new int[b];

        for(int i=0; i<a; i++)
        {
            arr1[i] = sc.nextInt();
            s1.add(arr1[i]);
        }

        for(int i=0; i<b; i++)
        {
            arr2[i] = sc.nextInt();
            s2.add(arr2[i]);
        }

        for(int i=0; i<a; i++)
        {
            if(!s1.contains(arr2[i]))
            {
                count++;
            }
        }

        for(int i=0; i<b; i++)
        {
            if(!s2.contains(arr1[i]))
            {
                count++;
            }
        }

        System.out.println(count);



    }
}