package src;

import java.util.Scanner;
public class Taksımetre {
    public static void main(String[] args){
        Scanner yol= new Scanner(System.in);
        double gidilen=0, birim=2.2,ucret=0;
        System.out.println("gidilen yol:");
        gidilen=yol.nextDouble();
        ucret=((gidilen*birim)+10.0);

        if (ucret <= 20){
            System.out.println("net ücret:"+20);
        }else{
            System.out.println("net ücret:"+ucret);
        }

    }
}
