import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sifre,k_adi,sifre2,k_adi2,k,sifre3;
k="e";
        int i=1,a=0,m=1,t=1;
        Scanner input=new Scanner(System.in);
               sifre = "ulku07";
               k_adi="ulku";
        while (i==1) {
            System.out.println("lütfen kullanıcı adi giriniz");
            k_adi2 = input.nextLine();
            System.out.println("lütfen sifrenizi giriniz");
            sifre2 = input.nextLine();
            if (k_adi2.equals(k_adi)&&sifre2.equals(sifre)) {
                System.out.println("sifre dogru");
                i=0;
                t=0;
            }while((k.equals("e")||k.equals("h")&&i==1)&&t==1) {
                           {
                    System.out.print("bilgileri yanlıs girdiniz şifrenizi sıfırlamak istermisiniz?e\\h?");
                    k = input.nextLine();
                }
                if (k.equals("h")) {
                    System.out.println("cikmak istediniz programdan cıkılıyor...");
                    i = 0;
                } else if (k.equals("e")) {
                    System.out.println("yeni şifre oluşturmak istediniz ");
                    while (m==1) {
                        System.out.println("lütfen yeni sifrenizi giriniz");
                        sifre3 = input.nextLine();
                        if (sifre3.equals(sifre2) || sifre3.equals(sifre)) {
                            System.out.println("daha önceki sifrenizi girdiniz");
                        }
                        else{
                            System.out.println("sifre basariyla olusturuldu");
                            m=0;
                            t=0;
                            i=0;
                        }
                    }
                }
            }
        }
    }
}
