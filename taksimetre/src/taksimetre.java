import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        int km;
        // perkm: km başına alınması gereken ücret anlamını taşıyor
        // startpice : başlanhıç ücreti anlamındadır
        double perkm = 2.20, total , startpice =10;

        Scanner input = new Scanner(System.in);
        System.out.print("MESAFEYİ KM CİNSİNDEN GİRİNİZ :");
        km = input.nextInt();

        total = (km * perkm);
        total += startpice;
        // total 20den küçükse benim total değerim 20 olsun değilse totalın kendisi olsun koşulu

        total = ( total< 20) ? 20 : total;
        System.out.print("TOPLAM TUTAR :" + total);





    }
}
