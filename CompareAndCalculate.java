import java.util.Scanner;

public class CompareAndCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        int s = a + b;
        int d = a - b;
        int p = a * b;
        if (b != 0) {
            double n = (double) a / b;
            System.out.println("a / b = " + n);
        } else {
            System.out.println("Деление на 0 невозможно.");
        }
        System.out.println("a + b = " + s);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + p);
    }
}

