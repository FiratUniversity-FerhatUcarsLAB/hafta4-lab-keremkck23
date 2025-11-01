/*
 * Ad Soyad: [Mehmet Kerem Küçük]
 * Ogrenci No: [250541097]
 * Tarih: [27.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 


import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {
        //Scanner Objesi
        Scanner input = new Scanner(System.in);

        //Değişken Tanımı
        String ad,soyad;
        int ogrencino,yas;
        double gpa;

        //Kullanıcıdan Bilgi Alma
        System.out.println();
        System.out.println("Öğrenci Bilgi Sistemi");
        System.out.println("=================");

        //Ad
        System.out.print("Ad girin:");
        ad = input.next();

        //Soyad
        System.out.print("Soyad girin:");
        soyad = input.next();

        //Öğrenci No
        System.out.print("Öğrenci numarası  girin:");
        ogrencino = input.nextInt();

        //Yaş
        System.out.print("Yaş giriniz:");
        yas = input.nextInt();

        //GPA
        System.out.print("Gpa (0.00-4.00):");
        gpa = input.nextDouble();

        //Yazdır
        System.out.println();

        System.out.println("Öğrenci Bilgi Sistemi");
        System.out.println("=================");
     
        System.out.println("Ad Soyad:"+ad+(" ")+soyad);
        System.out.println("Öğrenci No: "+ogrencino);
     
        System.out.println("Yaş:"+yas);
        System.out.printf("GPA: %.2f",gpa);
     
        System.out.println();
        if (gpa>=3.00) {
            System.out.println("Durum: Başarılı");
        }else{
            System.out.println("Durum: Başarısız");}
     
     //Sistemi Kapatma
        input.close();



    }

}




