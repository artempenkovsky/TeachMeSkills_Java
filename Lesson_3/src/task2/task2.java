package task2;

import java.util.Scanner;

class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру месяца!");
        int month = scanner.nextInt();
        if (month / 3 == 1)
            System.out.println("Это весна!");
        else if (month / 3 == 2)
            System.out.println("Это лето!");
        else if (month / 3 == 3)
            System.out.println("Это осень");
        else
            System.out.println("Это зима!");
        }

    }
