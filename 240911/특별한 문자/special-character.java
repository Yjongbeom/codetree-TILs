import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        HashMap<Character, Integer> h = new HashMap<>();
        int min_index = 9999999;

        
        for(char ch : s.toCharArray())
        {
            h.put(ch, h.getOrDefault(ch, 0)+1);

        }

        List<Map.Entry<Character, Integer>> h_list = new ArrayList<>(h.entrySet());

        for(Map.Entry<Character, Integer> entry : h_list)
        {
            if(entry.getValue() == 1)
            {
                for(int j=0; j<s.length(); j++)
                {
                    if(entry.getKey() == s.charAt(j))
                    {
                        if(min_index > j)
                            min_index = j;
                    }
                }
            }
        }

        System.out.println(s.charAt(min_index));
        
    }
}