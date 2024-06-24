package org.example.hw_30_05_2024;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int third = scanner.nextInt();
        scanner.close();

        int max = findMax(first, second, third);
        System.out.println("Максимум из трех чисел: " + max);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
