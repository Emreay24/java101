import java.util.HashMap;
import java.util.Map;

public class Tekrar1 {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer, Integer> tekrarlar = new HashMap<>();
        for (int sayi : dizi) {
            if (tekrarlar.containsKey(sayi)) {
                tekrarlar.put(sayi, tekrarlar.get(sayi) + 1);
            } else {
                tekrarlar.put(sayi, 1);
            }
        }
        System.out.println("Tekrar Sayıları:");
        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}
