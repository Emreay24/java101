package src;

import java.util.Scanner;
public class Alısverıs {
    public static void main(String[]args){
        Scanner urun =new Scanner(System.in);
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5;
        System.out.print("kaç kilo Armut ?: ");
        Armut *= urun.nextDouble();
        System.out.print("kaç kilo Elma ?: ");
        Elma *= urun.nextDouble();
        System.out.print("kaç kilo Domates ?: ");
        Domates *= urun.nextDouble();
        System.out.print("kaç kilo Muz ?: ");
        Muz *= urun.nextDouble();
        System.out.print("kaç kilo Patlıcan ?: ");
        Patlıcan *= urun.nextDouble();
        double odenecek=Armut+Elma+Domates+Muz+Patlıcan;
        System.out.print("Toplam tutar: "+odenecek+"TL");
    }
}
