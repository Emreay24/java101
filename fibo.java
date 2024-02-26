package src;
public class fibo {

    // Recursive olarak fibonacci serisinin n. terimini bulan metot
    public static int fibonacci(int n) {
        // Taban durum
        if (n == 0 || n == 1) {
            return n; // n'i döndür
        }
        // Recursive durum
        else {
            return fibonacci(n - 1) + fibonacci(n - 2); // n-1. ve n-2. terimlerin toplamını döndür
        }
    }

    // Ana metot
    public static void main(String[] args) {
        // 0'dan 10'a kadar olan fibonacci terimlerini ekrana yazdıralım
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
