package com.edu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int N = sc.nextInt();
        ListElement first = null;
        for (int i = 0; i < N; i++) {
            System.out.println("Введите число №" + (i + 1));
            int ins = sc.nextInt();
            first = ListUtils.insert(first, ins);
        }
        ListUtils.reduce(first,1);
    }

}
