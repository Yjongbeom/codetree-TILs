import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String arr[][] = new String[5][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            char a, b, c;
            String d = sc.nextLine();
            
            a = d.charAt(0);
            b = d.charAt(2);
            c = d.charAt(4);

            System.out.println((char)(a-32) + " " + (char)(b-32) + " " + (char)(c-32));
        }
    }
}