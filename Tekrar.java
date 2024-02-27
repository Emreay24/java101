import java.util.*;

public class Tekrar {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10};

        Map<Integer, Integer> tekrarEdenler = new HashMap<>();


        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (tekrarEdenler.containsKey(sayi)) {
                    tekrarEdenler.put(sayi, tekrarEdenler.get(sayi) + 1);
                } else {
                    tekrarEdenler.put(sayi, 1);
                }
            }
        }

        // Tekrar eden çift sayıları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : tekrarEdenler.entrySet()) {
            if (entry.getValue() > 1) { // Tekrar sayısı 1'den büyükse
                System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}
