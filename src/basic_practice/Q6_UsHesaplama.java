package basic_practice;

import java.util.Scanner;

public class Q6_UsHesaplama {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27
        //2  3 = 2*2*2=8


        Scanner scan= new Scanner(System.in);

        System.out.println("Iki tame sayi giriniz ");

        int taban= scan.nextInt();
        int kuvvet= scan.nextInt();

        long sonuc=1;

        while (kuvvet!=0){
            sonuc*=taban;

            kuvvet--;
        }
        System.out.println(taban + "'in istenen kuvvetş = "+ sonuc);


    }
}
