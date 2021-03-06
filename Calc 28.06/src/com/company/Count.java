package com.company;

import java.io.IOException;

class Count {
    private static String first;
    private static String sign;
    private static String second;

    public Count(String first, String sign, String second) {
        Count.first = first;
        Count.sign = sign;
        Count.second = second;
    }

    public void setFirst(String first) {
        Count.first = first;
    }
    public String getFirst() {
        return first;
    }
    public void setSign(String sign) {
        Count.sign = sign;
    }
    public String getSign() {
        return sign;
    }
    public void setSecond(String second) {
        Count.second = second;
    }
    public static String getSecond() {
        return second;
    }

    public static String toArabic(String x) throws IOException {

        if (x.equals("I") || x.equals("II") || x.equals("III") || x.equals("IV") || x.equals("V") || x.equals("VI") || x.equals("VII") || x.equals("VIII") || x.equals("IX") || x.equals("X")
                || x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5") || x.equals("6") || x.equals("7") || x.equals("8") || x.equals("9") || x.equals("10")) {

            switch (x) {
                case "I":
                    return "1";
                case "II":
                    return "2";
                case "III":
                    return "3";
                case "IV":
                    return "4";
                case "V":
                    return "5";
                case "VI":
                    return "6";
                case "VII":
                    return "7";
                case "VIII":
                    return "8";
                case "IX":
                    return "9";
                case "X":
                    return "10";
            }
        }
        else {
            throw new IOException("Введено неподходящее число!");
        }
        return x;
    }

    public static int parseString(String a) {
        return Integer.parseInt(a);
    }

    public static int calculation(int a, String b,int c) throws IOException {
        int answer = 0;

        if(b.equals("+") || b.equals("-") || b.equals("*") || b.equals("/")) {

            if (b.equals("+"))
                answer = a + c;
            if (b.equals("-"))
                answer = a - c;
            if (b.equals("*"))
                answer = a * c;
            if (b.equals("/"))
                answer = a / c;
        }
        else{
            throw new IOException("Введен не верный знак!");
        }
        return answer;
    }

    public static String romanAnswer(int a) throws IOException {

        if(a < 1) {
            throw new IOException("в римской системе нет отрицательных чисел и нуля");
        }

        String e;
        String x = null;
        String y = null;

        if (a == 1)
            e = "I";
        else if (a == 2)
            e = "II";
        else if (a == 3)
            e = "III";
        else if (a == 4)
            e = "IV";
        else if (a == 5)
            e = "V";
        else if (a == 6)
            e = "VI";
        else if (a == 7)
            e = "VII";
        else if (a == 8)
            e = "VIII";
        else if (a == 9)
            e = "IX";
        else if (a == 10)
            e = "X";
        else if (a == 100)
            e = "C";


        else {
            if (a > 10 && a / 10 == 1)
                x = "X";
            if (a > 10 && a / 10 == 2)
                x = "XX";
            if (a > 10 && a / 10 == 3)
                x = "XXX";
            if (a > 10 && a / 10 == 4)
                x = "XL";
            if (a > 10 && a / 10 == 5)
                x = "L";
            if (a > 10 && a / 10 == 6)
                x = "LX";
            if (a > 10 && a / 10 == 7)
                x = "LXX";
            if (a > 10 && a / 10 == 8)
                x = "LXXX";
            if (a > 10 && a / 10 == 9)
                x = "XC";
            if (a > 10 && a % 10 == 1)
                y = "I";
            if (a > 10 && a % 10 == 2)
                y = "II";
            if (a > 10 && a % 10 == 3)
                y = "III";
            if (a > 10 && a % 10 == 4)
                y = "IV";
            if (a > 10 && a % 10 == 5)
                y = "V";
            if (a > 10 && a % 10 == 6)
                y = "VI";
            if (a > 10 && a % 10 == 7)
                y = "VII";
            if (a > 10 && a % 10 == 8)
                y = "VIII";
            if (a > 10 && a % 10 == 9)
                y = "IX";
            if (a > 10 && a % 10 == 0)
                y = "";

            e = x + y;
        }
        return e;
    }

    public static String isRoman(int a) throws IOException {
        String e;
        if (first.equals("I") || first.equals("II") || first.equals("III") || first.equals("IV") || first.equals("V") || first.equals("VI") || first.equals("VII") || first.equals("VIII") || first.equals("IX") || first.equals("X")) {
            e = romanAnswer(a);
        }
        else{
            e = String.valueOf(a);
        }
        return e;
    }

    public static boolean checkingNotation(String a, String b) throws IOException {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        String[] arr = new String[10];
        arr[0] = "I";
        arr[1] = "II";
        arr[2] = "III";
        arr[3] = "IV";
        arr[4] = "V";
        arr[5] = "VI";
        arr[6] = "VII";
        arr[7] = "VIII";
        arr[8] = "IX";
        arr[9] = "X";

        String[] arr1 = new String[10];
        arr1[0] = "1";
        arr1[1] = "2";
        arr1[2] = "3";
        arr1[3] = "4";
        arr1[4] = "5";
        arr1[5] = "6";
        arr1[6] = "7";
        arr1[7] = "8";
        arr1[8] = "9";
        arr1[9] = "10";

        for (String s : arr) {
            for (String c : arr) {
                if(s.equals(a))
                    one = true;
                if(c.equals(b))
                    two = true;
            }
        }

        for (String i : arr1) {
            for (String j : arr1) {
                if (i.equals(a))
                    three = true;
                if (j.equals(b))
                    four = true;
            }
        }
        if (one && two || three && four)
            return true;
        else{
            throw new IOException("используются одновременно разные системы счисления");
        }
    }
}
