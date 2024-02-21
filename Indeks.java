package src;

import java.util.Scanner;
public class Indeks {
    public static void main(String []args){
        Scanner gırıs =new Scanner(System.in);
        double a,b,c;
        System.out.print("boyunuz cm olarak giriniz:");
        a=gırıs.nextDouble()/100;
        System.out.print("kilonuzu giriniz:");
        b=gırıs.nextDouble();
        c=b/(a*a);
        System.out.println("vücut kitle indekiniz: "+c);
    }
}
