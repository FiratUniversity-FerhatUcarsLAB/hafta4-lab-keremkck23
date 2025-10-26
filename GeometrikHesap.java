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
        final float pi;



        //Yarıçap
        System.out.print("Yarıçap girin:");
        yaricap=input.nextFloat();

        //Pi değeri
        pi=3.14f;

        //Alam
        alan=pi*yaricap*yaricap;

        //Çevre
        cevre=2*pi*yaricap;

        //Çap
        cap=2*yaricap;

        //Yüzey Alanı
        yuzeyalani= 4*pi*yaricap*yaricap;

        //Hacim
         hacim= 4.0/3.0*pi*yaricap*yaricap*yaricap;



        //Yazdırma
        System.out.println();
        System.out.println("Daire Hesabı");

        System.out.println("================");
        System.out.printf("Alan       : %.2f ",alan);

        System.out.println();
        System.out.printf("Çevre      : %.2f ",cevre);

        System.out.println();
        System.out.printf("Çap        : %.2f",cap);

        System.out.println();
        System.out.printf("Yüzey Alanı: %.2f ",yuzeyalani);

        System.out.println();
        System.out.printf("Hacim      : %.2f ",hacim);
        
        //Sistemi Kapatma
        input.close();
        









    }

}









    




   
