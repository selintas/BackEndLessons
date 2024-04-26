package Week1;

import java.util.Scanner;

public class KullaniciGiris2 {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullancı adı: ");
        userName = inp.nextLine();
        System.out.println("şifre: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Giriş başarılı !");
        } else {
            System.out.println("Bilgileriniz hatalı, bilgilerimi sıfırla. (Evet/Hayır) : ");

            String resetChoice = inp.nextLine();

            if (resetChoice.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword = inp.nextLine();

                // Yeni şifrenin eski şifre ile aynı olmadığını kontrol et
                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Yeni şifre eski şifre ile aynı olamaz. Lütfen farklı bir şifre girin.");
                }
            } else {
                System.out.println("Tekrar deneyin.");
            }
        }



            }
        }






