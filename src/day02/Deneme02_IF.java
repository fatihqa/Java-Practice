package day02;

import java.util.Scanner;

public class Deneme02_IF {
    public static void main(String[] args) {
        /*Kullaniciya
        * 1 = Gunde kac bardak cay ictigini,
        * 2 = Her bardak icin kac kup seker kullandigini sorup;
        kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
        * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
        (1 kup seker = 2.77 gr)
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Gunde kac bardak cay ıcıyorsunuz ?");
        double bardak= scan.nextByte();

        System.out.println("Gunde kac kup seker kullanıyorsunuz ?");
        double seker= scan.nextDouble();

        double yillikTuketimKG= bardak*seker*2.77*365*1000;
        double kirkyillikTuketimKG= yillikTuketimKG*40;

        if (seker==0){
            System.out.println("Aferin  boyle devam et :)");
        }else{
            System.out.println("Yillik seker tuketiminiz "+ yillikTuketimKG + " kg'dir\n "+
                    "40 yillik seker tuketiminiz "+kirkyillikTuketimKG + " kg'dir");
        }
    }
}

