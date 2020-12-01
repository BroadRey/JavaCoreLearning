// Напишите программу, которая находила бы все простые числа в диапазоне от 2 до 100.

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            boolean isPrimeNumber = true;

            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber)
                System.out.println(number + "- простое число");
        }
    }
}
