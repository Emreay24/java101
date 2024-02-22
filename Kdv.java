package src;

import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double orjınal=0, kdv=0;
        System.out.println("lütfen ücreti giriniz:");
        orjınal=input.nextDouble();
        kdv=orjınal;
        if (orjınal<=1000 && orjınal>0){
            kdv += (orjınal*0.18);
            System.out.println("orjinal ucret: "+orjınal+" ve %18 KDV eklenerek genel ücret: "+kdv);
        }
        else{
            kdv += (orjınal*0.8);
            System.out.println("orjinal ucret: "+orjınal+" ve %8 KDV eklenerek genel ücret: "+kdv);

        }
    }
}
