public class Yıldızproje {
    public static void main(String[] args) {
        // Boyutları 7x5 olan bir çok boyutlu dizi oluşturuyoruz
        boolean[][] bHarf = {
                {true, true, true, false, false},
                {true, false, false, true, false},
                {true, false, false, true, false},
                {true, true, true, false, false},
                {true, false, false, true, false},
                {true, false, false, true, false},
                {true, true, true, false, false}
        };

        // "B" harfini ekrana yazdırıyoruz
        for (int i = 0; i < bHarf.length; i++) {
            for (int j = 0; j < bHarf[i].length; j++) {
                if (bHarf[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
