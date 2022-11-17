package basic_practice;

import java.util.Scanner;

public class Q9_Faktoriyel {
    /* Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi aliniz
    Kelimenin son 2 harfini girilen sayi kadar yanyana yazdiran bir program yaziniz

    ORN :

    INPUT : Kelime = Mustafa  Sayi = 3
    OUTPUT : fafafa
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime giriniz :");
        String kelime = scan.next();

        System.out.print("10'dan kucuk bir tamsayi giriniz :");
        int sayi = scan.nextInt();

        String son2Harf = kelime.substring(kelime.length() - 2);

        // System.out.print(son2Harf.repeat(sayi));

        for (int i = 0; i < sayi; i++) {
            System.out.print(son2Harf);
        }
    }
}
