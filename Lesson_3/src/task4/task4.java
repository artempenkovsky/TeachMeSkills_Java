package task4;

import java.util.Scanner;

class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int t = scanner.nextInt();
        if (t> -5){
            System.out.println("Тепло");
        } else if (t >= -5 || t <= -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}