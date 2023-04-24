import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Number> nums = new ArrayList<Number>();
        while (true) {
            System.out.print("Digite um número ou 's' para sair: ");
            String value = input.next();
            if (value.equals("s")) {
                break;
            }
            try {
                Number num = Double.parseDouble(value);
                nums.add(num);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        double total = 0.0;
        for (Number num : nums) {
            total += num.doubleValue();
        }
        System.out.println("A soma total é: " + total);
    }
}
