import java.util.*;
public class AP_FindNthTerm {
    public static void main(String[] args) {
        int result = 0 ;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        result = a + (n-1)*d;
        System.out.println(result);

        sc.close();
    }
}
