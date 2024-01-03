import java.util.Scanner;
public class CountDigitsOfaNumber {
    public static void main(String[] args) {
        int count = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = sc.nextInt();

        //logic
        while(number > 0) {
            number = number / 10;
            count = count+1;
        }
        System.out.print(count);

        sc.close();
    }
}
