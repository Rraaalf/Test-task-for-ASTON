import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();

        if (number > 7.0) {
            System.out.println("Привет");
        }
    }
}
