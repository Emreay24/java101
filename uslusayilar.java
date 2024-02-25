package src;

import java.util.Scanner;
public class uslusayilar {
    public static void main(String[]arg){

        Scanner input=new Scanner(System.in);
        int a,b,total=1,c;
        System.out.print("taban sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("üs sayıyı giriniz: ");
        b=input.nextInt();
        for (int i = 0; i < b; i++) {
            total *=a;
        }
        System.out.print(a+"^"+b+" sonucu= "+total);
    }
}
