package day02;

public class Deneme01_Magules {
    public static void main(String[] args) {


         /*
    76453 sayısının her bır basamagını konsolda alt alta yazdırı.

    input : 76453
    output: 7
            6
            4
            5
            3
     */
        int sayi = 76453;

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;

        System.out.println(onbinler+"\n"+ binler+"\n"+ yuzler+"\n"+onlar+"\n"+birler+
        "\n");





        }
    }


