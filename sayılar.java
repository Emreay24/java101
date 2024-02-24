package src;

import java.util.Scanner;
/*
3 ve 4 e tam buluna sayıların ortalamasını bulmak
 */

public class sayılar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       int num,total=0,amount=0;
       System.out.print("lütfen sayı giriniz");
        num=inp.nextInt();
        for (int a=1; a<=num; a++){
            if(a%3==0 && a%4==0){
                total += a;
                amount++;
            }
        }
        int average = total / amount;
        System.out.println(average);
    }
}
