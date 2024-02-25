package src;

import java.util.Scanner;
/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.*/
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1,a1=1,num2,a2=1,num3,a3=1,b1,b2,b3;
        System.out.print("lütfen sayı giriniz");
        num1=inp.nextInt();
        System.out.print("lütfen sayı giriniz");
        num2=inp.nextInt();
        num3=num1-num2;
        for (int ı1=1; ı1<=num1; ı1++) {
            a1*=ı1;
        }b1 = a1;
        for (int ı2 = 1; ı2 <= num2; ı2++) {
                a2 *= ı2;
        }b2 = a2;
        for (int ı3 = 1; ı3 <= num3; ı3++) {
            a3 *=ı3;
        }
        b3=a3;
        //formül C(n=num1,r=num2) = n! / (r! * (n-r)!)
        System.out.print(b1 / (b2 * b3));
    }
}
