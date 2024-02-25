package src;
import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        int num,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        num=input.nextInt();
        for (int i=1; i<num;i++){
            if(num %i==0){
                total+=i;

            }
        }if(num==total){
            System.out.print(num+" mükemmel bir sayıdır.");
        }else{
            System.out.print(num+" mükemme bir sayı değildr");
        }
    }
}