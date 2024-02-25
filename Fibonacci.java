package src;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlamak istediğiniz sayıyı girin: ");
        int baslangic = scanner.nextInt();
        System.out.print("Kaç adet Fibonacci sayısı hesaplanacak: ");
        int adet = scanner.nextInt();

        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < adet; i++) {
            System.out.print(fibonacciHesapla(baslangic + i) + " ");
        }
    }

    public static int fibonacciHesapla(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, sonuc = 0;
        for (int i = 2; i <= n; i++) {
            sonuc = fib1 + fib2;
            fib1 = fib2;
            fib2 = sonuc;
        }
        return sonuc;
    }
}
