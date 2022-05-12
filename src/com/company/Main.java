package com.company;

public class Main {

    public static void main(String[] args) {
        //№1
        System.out.println(" № 1");
        // Варіант for
        for (int f = 500; f <= 650; f = f + 10) {
            System.out.print(f + " ");
        }
        // Варіант while
        int f = 500;
        while (f <= 650) {
            System.out.println(f + " ");
            f = f + 10;
        }


        //Варіант do - while
        int v = 500;
        do {
            System.out.println(v);
            v = v + 10;
        } while (v <= 650);

        //№2
        System.out.println(" № 2");
        int d = 2;
        while (d <= 5000) {
            System.out.println(d + " ");
            d = 2 * d - 1;
        }

        //№3
        System.out.println(" № 3");
        int i = 10;
        for (int a = 1; a <= 10; a++) {
            if (i % a == 0) {
                System.out.println(a);
            }
        }

        //№4
        System.out.println(" № 4");
        // Метод while
        int y = 1;
        int g = 1;
        while (g <= 10) {
            y = y * g;
            System.out.println(y);
            g = g + 1;
        }

        // Метод for
        int h = 1;
        for (int j = 1; j <= 10; j = j + 1) {
            h = h * j;
            System.out.println(h);
        }
    }
}
