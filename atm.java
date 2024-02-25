package src;

import java.util.Scanner;
public class atm {
    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        String userName,password;
        int right=3,money;
        String job;
        int balance=2000,amount;
        while (right>0){
            System.out.print("Lütfen kullanıcı adını giriniz: ");
            userName=input.nextLine();
            System.out.print("lütfen şifrenizi giriniz: ");
            password=input.nextLine();
            if(userName.equals("User") && password.equals("Ps1234")){
                System.out.println("Giriş başarılı!");
                System.out.println("bankamıza hoşgeldiniz");
                System.out.println("lütfen yapmak istediğiniz işlemi seçniz:");
                System.out.println("1-para çekmek "+
                        "\n2-para yatırmak "+
                        "\n3-bakiye sorgulama "+
                        "\n4-çıkış yap");

                job=input.nextLine();
                switch (job) {
                    case "1":
                        System.out.print("lütfen çekmek istediğiniz miktarı giriniz: ");
                        money = input.nextInt();
                        if (money <= balance) {
                            amount = balance - money;
                            System.out.println("çekim işlemi başarılı");
                            System.out.println("kalan miktar: " + amount);
                        } else {
                            System.out.println("yetersiz bakiye!");
                        }break;
                    case "2":
                        System.out.print("lütfen yatırmak istediğiniz miktarı giriniz: ");
                        money = input.nextInt();
                        balance += money;
                        System.out.println("yatırma işlemi başarılı! güncel bakiyeniz: " + balance);
                        break;
                    case "3":
                        System.out.print("bakiyeniz: "+balance);
                        break;
                    case "4":
                        System.out.println("çıkış işlemi başarılı");
                        break;
                    default:
                        System.out.println("hatalı seçim yaptınız");
                        break;
                }
            }else{
                right--;
            }
                System.out.println("hatalı bilgiler!");
                if (right==0){
                    System.out.print("hesabınız bloke olmuştur lütfen bankayla iletişime geçiniz!");
                }else {
                System.out.println("kalan hakkınız: "+ right);
            }
        }
    }
}
