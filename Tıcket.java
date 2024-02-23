package ucakbileti;

import java.util.Scanner;

public class Tıcket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double range, price;
        int age, tripType;
        System.out.print("Lütfen mesafeyi kilometre türünden giriniz: ");
        range = scanner.nextDouble();
        System.out.print("lütfen yaşınızı giriniz: ");
        age = scanner.nextInt();
        System.out.println("Lütfen yolculuk türünü girin (1 yada 2)");
        tripType = scanner.nextInt();

        if((age > 0 && range > 0) && (tripType == 1 || tripType == 2)) {
            price = range * 0.1;
            double ageDiscount;
            if (age < 12 && tripType == 2)  {
                ageDiscount = age * 0.5;
                price = (price - ageDiscount) * 0.2;
                System.out.println("ücret = " + price);
            } else if (age < 12) {
                ageDiscount = age * 0.5;
                price = (price - ageDiscount);
                System.out.println("üscret = " + price);
            } else if (age <= 24 && tripType == 2) {
                ageDiscount = age * 0.1;
                price = ((price - ageDiscount) * 0.2);
                System.out.println("ücret = " + price);
            } else if (age <= 24) {
                ageDiscount = age * 0.1;
                price = (price - ageDiscount) ;
                System.out.println("ücret = " + price);
            } else if (age > 65 && tripType == 2) {
                ageDiscount = age * 0.3;
                price = (price - ageDiscount) * 0.2;
                System.out.println("ücret = " + price);
            } else if (age > 65) {
                ageDiscount = age * 0.3;
                price = (price - ageDiscount);
                System.out.println("ücret= " + price);
            }
        } else {
            System.out.println("Yanlış bilgi girdiniz.");
        }

    }
}