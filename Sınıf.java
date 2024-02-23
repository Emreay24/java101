package src;

import java.util.Scanner;
public class Sınıf {
    public static void main(String []args){
        int mat,fizik,turkce,kimya,muzık;
        double ortalama;
        Scanner inp =new Scanner(System.in);

        System.out.print("Lütfen matematik notunu giriniz: ");
        mat=inp.nextInt();
        System.out.print("Lütfen fizik notunu giriniz: ");
        fizik=inp.nextInt();
        System.out.print("Lütfen türkçe notunu giriniz: ");
        turkce=inp.nextInt();
        System.out.print("Lütfen kimya notunu giriniz: ");
        kimya=inp.nextInt();
        System.out.print("Lütfen müzik notunu giriniz: ");
        muzık=inp.nextInt();

        ortalama=(mat+fizik+turkce+kimya+muzık)/5;
        if(ortalama >=55 && ortalama <=100){
            System.out.print("sınıfı geçmistir! Notunuz: " +ortalama);
        }else if (ortalama<55 && ortalama>0){
            System.out.print("snıfı geçemeiştir! Notunu: " +ortalama);
        }else {
            System.out.print("oralamanız 0 ve 100 arasında değil");
        }
    }
}
