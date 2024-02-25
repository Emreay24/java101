package src;

import java.util.Scanner;
public class Basamaktoplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();

        int i = 0,sum=0;

        while(number != 0)
        {
            sum=(number%10)+sum;
            number /= 10;
            ++i;
        }
        System.out.println("istenilen sayının basamakları toplamı"+sum);
    }
}
