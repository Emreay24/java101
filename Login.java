package src;

import java.util.Scanner;
public class Login {
    public static void main(String []args){
        String username, password,job,newPassword;

        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adını giriniz: ");
        username=inp.nextLine();
        System.out.print("lütfen şifrenizi giriniz: ");
        password=inp.nextLine();
        if(username.equals("User") && password.equals("Ps1234")){
            System.out.print("Giriş başarılı!");
        }else {
            System.out.print("bilgileriniz hatalı şifrenizi yenilemk ister misiniz\n1-hayır\n2-evet\n");
            job=inp.nextLine();
            switch (job){
                case "1":
                    break;
                case "2":
                    System.out.print("lütfen yeni şifrenizi giriniz: ");
                    newPassword=inp.nextLine();

                    if(!newPassword.equals("Ps1234")){
                        System.out.print("Şifre oluşturuldu");

                    }else{
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } 
            }
        }
    }
}
