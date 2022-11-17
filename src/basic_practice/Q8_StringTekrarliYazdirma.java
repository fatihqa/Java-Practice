package basic_practice;

import java.util.Scanner;

public class Q8_StringTekrarliYazdirma {
    /* Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi aliniz
Kelimenin son 2 harfini girilen sayi kadar yanyana yazdiran bir program yaziniz

ORN :

INPUT : Kelime = Mustafa  Sayi = 3
OUTPUT : fafafa
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir kelime giriniz");
        String kelime=scan.next();

        System.out.println("10'dan kucuk bır tamsayi giriniz");
        int sayi=scan.nextInt();

        String  son2Harf=kelime.substring(kelime.length()-2);

        for (int i = 0; i <sayi ; i++) {
            System.out.print(son2Harf);

        }

    }
}
