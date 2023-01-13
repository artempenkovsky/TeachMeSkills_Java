package task1;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру месяца!");
        int month = scanner.nextInt();
        if (month > 12) {
            System.out.println("Введено некорректное значение месяца");
        }
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень!");
                break;
        }
    }
}
