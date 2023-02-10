import java.util.Scanner;

public class DeseneGoreMetot {
     int sayi = 0;

     static int desen(int sayi, int toplam,int sayac) {
        if (sayi > 0 && sayi <= toplam && sayac == 0) {
            System.out.println(sayi - 5);
            return desen(sayi - 5, toplam,sayac);
        } else if ((sayi > 0 || sayi <= 0) && sayi <= toplam) {
            if (sayi == toplam) {
                sayac++;
                return desen(sayi + 5, toplam,sayac);
            } else {
                sayac++;
                System.out.println(sayi + 5);
                return desen(sayi + 5, toplam,sayac);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Sayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int sayac = 0;
        int toplam = sayi;
        desen(sayi, toplam,sayac);
    }
}
