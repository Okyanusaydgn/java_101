
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int kenar1, kenar2;
        System.out.println("Dik üçgenin ilk kenar uzunluğunu girin:");
        kenar1 = girdi.nextInt();
        System.out.println("Dik üçgenin ikinci kenar uzunluğunu girin:");
        kenar2 = girdi.nextInt();

        double hipotenus = Math.sqrt( kenar1 * kenar1 + kenar2 * kenar2 );
        System.out.println(" Hipotenüs: " + hipotenus);

        double u = (double) (kenar1 + kenar2) / 2;
        double alan = Math.sqrt(u*(u - kenar1) * (u - kenar2) * (u - hipotenus));
        System.out.println("Üçgenin Alanı: " + alan);
        }
    }
