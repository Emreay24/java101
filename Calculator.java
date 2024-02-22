package src;

import javafx.scene.paint.Stop;

import java.util.Scanner;
public class Calculator {
    public static void main(String []args){
        int num1,num2,result;
        String oparator;
        Scanner input= new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz?: ");
        num1=input.nextInt();
        System.out.print("yapmak istediğiniz işlemi seçiniz (+ , -, * , /) ");
        oparator=input.next();
        System.out.print("ikinci sayıyı giriniz?: ");
        num2=input.nextInt();

        switch(oparator){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                if(num2 !=0){
                    result=num1/num2;
                }else {
                    System.out.print("sıfıra bölme hatası!");
                    return;
                }break;
            default:
                System.out.print("hatalı işlem yaptınız !");
                return;
        }System.out.print("işlem sonucunuz: "+result);
    }
}
