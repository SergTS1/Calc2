package com.company;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static String calc(String input) throws IOException {
        String[] arr = input.split(" ");

        if (arr.length != 3)
            throw new IOException("Введено неподходящее количество чисел!");

        String a = arr[0];
        String b = arr[1];
        String c = arr[2];

        Count built = new Count(a, b, c);
        built.setFirst(Count.toArabic(a));
        built.setSign(b);
        built.setSecond(Count.toArabic(c));

        int result = Count.calculation(Count.parseString(built.getFirst()), b, Count.parseString(Count.getSecond()));
        built.setFirst(a);
        built.setSecond(c);
        Count.checkingNotation(built.getFirst(), Count.getSecond());
        return Count.isRoman(result);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        System.out.println("Output:\n" + calc(x));
    }
}
