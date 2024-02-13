import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al

        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih +  muzik);
        double sonuc = toplam / 6.0;
        String durum = sonuc > 60 ? "Sınıfı geçtiniz" : "Maalesef sınıfta kaldınız";
        System.out.println("Ortalamamız : " + sonuc);
        System.out.println(durum);

    }
}