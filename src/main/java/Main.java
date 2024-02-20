package src;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        int matematık,fızık,kımya,turkce,tarıh,muzık;
        Scanner x= new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematık= x.nextInt();
        System.out.println("Matematik notunuz:"+matematık);

        System.out.print("Fizik notunuzu giriniz:");
        fızık= x.nextInt();
        System.out.println("Fızık notunuz:"+fızık);

        System.out.print("Kimya notunuzu giriniz:");
        kımya = x.nextInt();
        System.out.println("Kimya notunuz:"+kımya);

        System.out.print("Türkçe notunuzu giriniz:");
        turkce= x.nextInt();
        System.out.println("Türkçe notunuz:"+turkce);

        System.out.print("Tarih notunuzu giriniz:");
        tarıh= x.nextInt();
        System.out.println("Tarih notunuz:"+tarıh);

        System.out.print("Müzik notunuzu giriniz:");
        muzık= x.nextInt();
        System.out.println("Müzik notunuz:"+muzık);

        int ortalama=(matematık+fızık+kımya+turkce+tarıh+muzık)/6;
        System.out.println("ders ortalaması:"+ortalama);

        boolean sonuc= ortalama>=60;

        String q = sonuc? "Sınıfı geçti!" :"Sınıfta kaldı!";
        System.out.print(q);
    }
}
