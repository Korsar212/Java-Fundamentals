// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

package com.epam.automation;

import java.util.*;

public class main_task_1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Welcome " + name);
        in.close();
    }
}
