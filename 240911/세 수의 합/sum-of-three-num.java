import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> h = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i=0; i<n-2; i++)
        {
            int left = i + 1;
            int right = n-1;

            while(left < right)
            {
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == k)
                {
                    count++;
                    left++;
                }

                else if(sum < k)
                {
                    left++;
                }
                else
                {
                    right--;
                }

            }
        }

        System.out.println(count);


    }
}