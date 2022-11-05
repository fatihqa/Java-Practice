package day05;

import java.util.Scanner;

public class Q1_BolmeOperatoruKullanmadanBolme {

    static   int bolum=0;

    public static void main(String[] args) {
        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfenn bolmek istediginiz sayiyi giriniz : ");
        int bolunen= scan.nextInt();
        System.out.println("Lutfenn bolen  giriniz : ");
        int bolen= scan.nextInt();

        System.out.println(bolunen + " / "+ bolen + " = "+ bol(bolunen,bolen));
        bol(bolunen,bolen);

    }

    private static int bol(int bolunen, int bolen) {


        while (bolunen>=bolen){
            bolunen-=bolen;

            bolum++;


        }

        return bolum;

    }
}
