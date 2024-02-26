import java.util.Scanner;

public class asal {

    public static boolean asalMi(int sayi, int sayac) {
        if (sayi > 1 && sayac != 1) {
            if (sayi % sayac == 0) {
                return false;
            } else {
                return asalMi(sayi, sayac - 1);
            }
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        if (asalMi(sayi, sayi - 1)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
