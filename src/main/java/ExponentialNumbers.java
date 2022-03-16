import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int k;
        int result = 1;
        System.out.println("Insert number for exponential calculation: ");
        k=scanner.nextInt();

        for (int i = 1; i <=k ; i++) {
            result *=k;
        }
        System.out.println("Total: " + result);

    }
}
