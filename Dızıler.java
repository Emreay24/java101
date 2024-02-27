import java.util.Arrays;

public class Dızıler {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;
        int closestSmaller = findClosestSmaller(array, number);
        int closestLarger = findClosestLarger(array, number);
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Girilen Sayı: " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }

    public static int findClosestSmaller(int[] array, int number) {
        int closest = Integer.MIN_VALUE;
        for (int value : array) {
            if (value < number && value > closest) {
                closest = value;
            }
        }
        return closest;
    }

    public static int findClosestLarger(int[] array, int number) {
        int closest = Integer.MAX_VALUE;
        for (int value : array) {
            if (value > number && value < closest) {
                closest = value;
            }
        }
        return closest;
    }
}
