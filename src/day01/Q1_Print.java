package day01;

public class Q1_Print{

    /*
    Konsolda :
    "hello"\ / 'World'"
    yazdırınız.
     */

    /*
    /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */


    public static void main(String[] args) {

        System.out.println("\"hello\"\\ / 'World'\"");   //println tamamını yazdırıyor
        System.out.println('\'');                        // tek tırnagı yazdırmak ıcın ters slah
        System.out.println("\"hello\"\\ / 'World'\"");  // Ctrl D kopyaladı//

        /*
        *********************************
               "ATM'ye Hosgeldiniz"

         1- Bakiye Sorgulama    // kürsöru alt tusuna basıl asagı cekersek her satıra aynı sey yazılabılır
         2- Para Yatırma
         3- Para Çekme
         4- Menu'den Cıkıs
       *********************************
         */

        System.out.println("*********************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\"" +
                "\n\n\t1- Bakiye Sorgulama\n\t" +
                "2- Para Yatırma\n\t" +
                "3- Para Çekme\n\t" +
                "4- Menu'den Cıkıs" +
                "\n*********************************");   // \n alt satıra gecmıs gibi yazdırır

       System.out.println(3+7); // topkama   10
       System.out.println("ali"+ "ayse"); //aliayse concatination


    }






}
