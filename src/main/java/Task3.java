import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите числовой массив через пробел: ");
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        StringBuilder result = new StringBuilder();

        String[] numsAsStringArr = arr.split(" ");
        for (String n : numsAsStringArr) {
            try {
                double nDouble = Double.parseDouble(n);
            if (nDouble % 3 == 0 && nDouble != 0) {
                result.append(n);
                result.append(" ");
            }
            } catch (NumberFormatException e) {
                System.out.println("Warning! Не численное значение: " + n);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
