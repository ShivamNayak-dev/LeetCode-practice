import java.util.*;

public class NimGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of stones

        if (n % 4 == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        sc.close();
    }
}
