import java.util.Scanner;

public class JavaVariant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a: ");
        float a = scan.nextFloat();
        System.out.println("Enter b: ");
        float b = scan.nextFloat();
        System.out.println("Enter h: ");
        float h = scan.nextFloat();

        if (a <= 0 || b <= 0 || h <= 0) {
            System.out.println("Invalid figure!");
        }else {
            float S = (a + b) / 2 * h;
            System.out.println("S = " + S);
        }
    }
}