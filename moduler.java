public class moduler {
    public static void main(String[] args) {
        double[] numbers = {2, 4, 6, 8, 10};
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonic Mean: " + harmonicMean);
    }

    public static double calculateHarmonicMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += 1 / number;
        }
        return numbers.length / sum;
    }
}
