import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathUtil mathUtil = new MathUtil();

        // Подсчет количества простых чисел от 1 до 1000
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (MathUtil.isPrime(i)) {
                counter++;
            }
        }
        System.out.println("amount of simple numbers from 1 to 1000: " + counter);

        // Пример использования статических методов
        System.out.print("Enter a number for simplicity check : ");
        int num = scanner.nextInt();
        System.out.println("Число " + num + " является простым : " + MathUtil.isPrime(num));

        System.out.print("Enter два числа для нахождения GCD: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + MathUtil.gcd(a, b));

        System.out.print("Enter два числа для нахождения LCM: ");
        System.out.println("LCM(" + a + ", " + b + ") = " + (a * b) / MathUtil.gcd(a, b));

        System.out.print("Enter число для нахождения n-го числа Фибоначчи: ");
        int fibIndex = scanner.nextInt();
        System.out.println("Fibonacci(" + fibIndex + ") = " + MathUtil.fibonacci(fibIndex));

        System.out.print("Enter число для вычисления факториала: ");
        int factorialNum = scanner.nextInt();
        System.out.println("Факториал(" + factorialNum + ") = " + MathUtil.factorial(factorialNum));

        // Пример использования нестатических методов
        System.out.print("Enter число для проверки на совершенное число: ");
        int perfectNum = scanner.nextInt();
        System.out.println("Число " + perfectNum + " является совершенным: " + mathUtil.isPerfectNumber(perfectNum));

        System.out.print("Enter число для вычисления суммы его цифр: ");
        int sumNum = scanner.nextInt();
        System.out.println("Сумма цифр числа " + sumNum + " = " + mathUtil.sumOfDigits(sumNum));

        System.out.print("Insert число для переворота: ");
        int reverseN = scanner.nextInt();
        System.out.println("Reversed number " + reverseN + " = " + mathUtil.reverseNumber(reverseN));

        System.out.print("Введите число для проверки на число Армстронга: ");
        int armstrong = scanner.nextInt();
        System.out.println("Number " + armstrong + " is indeed Armstrong NUmber: " + mathUtil.isArmstrongNumber(armstrong));

        System.out.print("Enter число для нахождения следующего простого числа: ");
        int nextPrimeN = scanner.nextInt();
        System.out.println("Next prime num after " + nextPrimeN + " = " + mathUtil.nextPrime(nextPrimeN));

        scanner.close();
    }
}
