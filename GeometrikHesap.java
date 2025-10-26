/*
 * Ad Soyad: [Mehmet Kerem Küçük]
 * Ogrenci No: [250541097]
 * Tarih: [27.10.20025]
 * Aciklama: Gorev 2 - Geometrik Hesaplama



import  java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        //Scanner Objesi
        Scanner input = new Scanner(System.in);

        System.out.println("=================");

        //Değişkenler
        float yaricap,cap;
        double alan,cevre,yuzeyalani,hacim;



        //Yarıçap
        System.out.print("Yarıçap girin:");
        yaricap=input.nextFloat();

        //Pi değeri
        double pi=3.14;

        //Alam
        alan=pi*yaricap*yaricap;

        //Çevre
        cevre=2*pi*yaricap;

        //Çap
        cap=2*yaricap;

        //Yüzey Alanı
        yuzeyalani= 4*pi*yaricap*yaricap;

        //Hacim
         hacim= 1.33*pi*yaricap*yaricap*yaricap;



        //Yazdırma
        System.out.println();
        System.out.println("Daire Hesabı");
        System.out.println("================");
        System.out.printf("Alan: %.3f ",alan);
        System.out.println();
        System.out.printf("Çevre: %.3f ",cevre);
        System.out.println();
        System.out.printf("Çap: %.3f",cap);
        System.out.println();
        System.out.printf("Yüzey Alanı: %.3f ",yuzeyalani);
        System.out.println();
        System.out.printf("Hacim: %.3f ",hacim);

      
       input.close();









    }

}


   
