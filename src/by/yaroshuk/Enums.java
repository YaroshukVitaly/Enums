package by.yaroshuk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Enums {
    enum Season{
    WINTER, SPRING, SUMMER, AUTUMM;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        Season season = Season.valueOf(l.trim().toUpperCase());
        System.out.println("Result - " + season);



    }
}
