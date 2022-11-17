package basic_practice;

import java.util.Scanner;

public class Q10_KarekokHesaplama {
    /*
    Kullanıcıdan aldıgınız sayiyinin karekokunu hesaplayan bir program yaziniz
    Not: Virgulden sonra 3 baasamak gosterecek

    ORN: INPUT:9 OUTPUT:3,000
    ORN: INPUT:2 OUTPUT:1,414
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Pozitif bir tamsayi giriniz :");
        double sayi = scan.nextDouble();

        double karekok=1.0;

        for (int i = 1; i*i <= sayi ; i+=0.001) {
            karekok=i;

        }
        System.out.printf("%.f",karekok);
        // Virgulden sonra 3 basamak icin

    }
}
