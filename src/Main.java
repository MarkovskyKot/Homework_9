import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] payments = {56200, 48570, 94720, 27090, 62100};
        int sumPayments = 0;
        for (int payment : payments) {
            sumPayments += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sumPayments + " рублей");
        System.out.println();
        //Задача 2
        int[] payments2 = Arrays.copyOf(payments, payments.length);
        int maxPayment = Integer.MIN_VALUE;
        for (int payment : payments2) {
            if (payment > maxPayment) {
                maxPayment = payment;
            }
        }
        int minPayment = Integer.MAX_VALUE;
        for (int payment : payments2) {
            if (payment < minPayment) {
                minPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +
                minPayment + " рублей. Максимальная сумма трат за неделю составила " +
                maxPayment + " рублей");
        System.out.println();
        //Задача 3
        int[] payments3 = Arrays.copyOf(payments, payments.length);
        double meanPayment;
        int sumPayments2 = 0;
        for (int payment : payments3) {
            sumPayments2 += payment;
        }
        meanPayment = sumPayments2 / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + meanPayment + " рублей");
        System.out.println();
        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}