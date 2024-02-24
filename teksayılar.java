package src;

import java.util.Scanner;

public class teksayılar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,total = 0;
        while (true) {
            System.out.print("lütfen çift ve 4 ün katı sayı giriniz");
            num=inp.nextInt();
            if (num %4==0 ){
                total+=num;
            }if (num %2 !=0){
                break;
            }
        }System.out.println(total);
    }
}
