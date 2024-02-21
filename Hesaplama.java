package src;

import java.util.Scanner;
public class Hesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci kenarı giriniz: ");
        double b = scanner.nextDouble();
        System.out.print("Üçüncü kenarı giriniz: ");
        double c = scanner.nextDouble();

        double u=(a+b+c)/2;
        double Alan = Math.sqrt(u*(u-a)*u*(u-b)*u*(u-c));
        System.out.println(Alan);
    }
}
