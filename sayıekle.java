public class sayıekle {
        public static void main(String[] args) {
            int n = 20;
            recursiveMethod(n);
        }
        public static void recursiveMethod(int n) {
            if (n <= 0) {
                System.out.println("Son Değer: " + n);
                return;
            }
            System.out.println("Son Değer: " + n);
            recursiveMethod(n - 5);
            if (n <= 0) {
                recursiveMethod(n + 5);
            }
        }
}
