import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat,kdvOrani,kdvTutari, kdvliFiyat;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücretinizi giriniz: ");
        fiyat = input.nextDouble();



        if (fiyat>0 && fiyat <= 1000){
           kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutari = fiyat * kdvOrani;
        kdvliFiyat = fiyat +kdvTutari;

        System.out.println("KDV'siz fiyat : " + fiyat);
        System.out.println("KDV oranı : " + kdvOrani);
        System.out.println("KDV'li fiyat : " + kdvliFiyat);
        System.out.println("KDV tutarı : " + kdvTutari);
        }
    }
