package by.yaroshuk;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Enums {
    enum Season{
    WINTER, SPRING, SUMMER, AUTUMM;
    }

    public static void main(String[] args) {
        Season s = Season.AUTUMM;

        switch (s) {
            case WINTER:
                System.out.println("Too cold!");
                break;
            case SPRING:
                System.out.println("Good!");
                break;
            case SUMMER:
                System.out.println("Hot!");
                break;
            case AUTUMM:
                System.out.println("Good?");
                break;
        }

    }
}
