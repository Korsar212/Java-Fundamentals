//4. Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

package com.epam.automation;

import java.util.Scanner;

public class main_task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {
            sum = sum + value % 10;
            com *= value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);
        System.out.println("Произведение введённых чисел: " + com);
    }
}