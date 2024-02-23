package src;
import java.util.Scanner;
public class Heat {
    public static void main(String []args){
        int heat;
        Scanner inp =new Scanner(System.in);

        System.out.print("lütfen sıcaklık giriniz: ");;
        heat=inp.nextInt();

        if(heat <=5){
            System.out.print("kayak yapabilirsiniz.");
        } else if (heat>5 && heat<=15) {
            System.out.print("sinemaya giebilirsiniz.");
        } else if (heat >15 && heat <=25) {
            System.out.print("piknik yapabilirsiniz.");
        } else if (heat>25) {
            System.out.print("yüzmeye gidebilirsiniz.");
        }
    }
}
