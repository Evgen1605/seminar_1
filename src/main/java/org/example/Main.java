package org.example;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       примитивные типы данных содержат числа
        int i = 'g'; // в одинарных кавычкахсодержится симво(число)
        long l;
        short s;
        byte b;
        char ch = 123; // содержит символ
        float f = .3456f;
        double d = .456;
        boolean aBoolean = false;

//        -----------------
//        ссылочные типы дданных
        int[] ints = new int[12];
        int[] temp = new int[ints.length];
        for (int j = 0; j < ints.length; j++) {
            temp[j]= ints[j];
        }
        temp = ints;

        String s1 = "Привет мир!";
        s1 += "!";


        System.out.println(s1);

        Random random = new Random();
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));

        }
}