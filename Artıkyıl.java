package src;

import java.util.Scanner;

public class Artıkyıl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen ılı giriniz: ");
        int year = scanner.nextInt();
        String result = "";
        if(year % 100 == 0) {
            if (year % 400 == 0) {
                result = year + " artık yıl";
            } else {
                result = year + " artık yıl değil";
            }
        } else if (year % 4 == 0) {
            result = year + " artık yıl";
        } else {
            result = year + " artık yıl değil";
        }
        System.out.println(result);
    }
}