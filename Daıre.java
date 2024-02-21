package src;

import java.util.Scanner;
public class Daıre {
    public static void main(String[] args){
        Scanner len= new Scanner(System.in);
        double pı=3.14,a;
        int r;
        System.out.println("yarıçap:");
        r= len.nextInt();
        System.out.println("açı:");
        a= len.nextDouble();
        double b;

        b=(pı * (r*r) * a) / 360;
        System.out.println(b);
    }
}
