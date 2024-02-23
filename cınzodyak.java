package src;

import java.util.Scanner;

public class cınzodyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen doğum yılınızı giriniz: ");
        int birthYear = scanner.nextInt();
        String result = "";
        if(birthYear % 12 == 0) {
            result = "maymun";
        } else if (birthYear % 12 == 1) {
            result = "hindi";
        } else if (birthYear % 12 == 2) {
            result = "köpek";
        } else if (birthYear % 12 == 3) {
            result = "domuz";
        } else if (birthYear % 12 == 4) {
            result = "fare";
        } else if (birthYear % 12 == 5) {
            result = "öküz";
        } else if (birthYear % 12 == 6) {
            result = "kaplan";
        } else if (birthYear % 12 == 7) {
            result = "tavşan";
        } else if (birthYear % 12 == 8) {
            result = "ejderha";
        } else if (birthYear % 12 == 9) {
            result = "yılan";
        } else if (birthYear % 12 == 10) {
            result = "at";
        } else if (birthYear % 12 == 11) {
            result = "koyun";
        }
        System.out.println(result);
    }
}
