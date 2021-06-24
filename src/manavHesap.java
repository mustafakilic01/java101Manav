import java.util.Scanner;
public class manavHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutUcret, elmaUcret, domatesUcret, muzUcret, patlıcanUcret, toplamUcret;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;

        //Ürünlerin ücretleri:
        armutUcret = 2.14;
        elmaUcret = 3.67;
        domatesUcret = 1.11;
        muzUcret = 0.95;
        patlıcanUcret = 5.00;

        //Ürünlerin kilolarını müşteriden isteme
        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKilo = input.nextInt();

        //Müşteriden kiloları aldıktan sonra artık toplam fiyat hesaplanır.
        toplamUcret = (armutUcret*armutKilo) + (elmaUcret*elmaKilo) + (domatesUcret*domatesKilo) +
                (muzUcret*muzKilo) + (patlıcanUcret*patlıcanKilo);

        //En son toplam ücret ekrana yazdırılır.
        System.out.print("Toplam Tutar : " + toplamUcret + " TL");
    }
}
