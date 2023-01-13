package task3;

import java.util.Scanner;

class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println("Это четное число!");
        else
            System.out.println("Это нечетное число!");
    }
}