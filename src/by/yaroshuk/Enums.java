package by.yaroshuk;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Enums {
    enum Season{
    WINTER, SPRING, SUMMER, AUTUMM;
    }

    public static void main(String[] args) {
        Season s = Season.AUTUMM;
        System.out.println(s);
        System.out.println(Arrays.toString(Season.values()));

    }
}
