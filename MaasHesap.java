/*
 * Ad Soyad: [Mehmet Kerem Küçük]
 * Ogrenci No: [250541097]
 * Tarih: [02.11.2025]
 * Aciklama: Gorev 3 - Maaş Hesabı

   
import java.util.Scanner;
 public class MaasHesap {
    public static void main(String[]args){
        //Scanner Objesi
        Scanner input=new Scanner(System.in);

        //Değişken Tanımı
        String ad,soyad;
        double bmaas;
        int csaati,msaati;

        //Sabitler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;




        //Kullanıcıdan Veri alımı
        System.out.println("==============");
        System.out.println("Hesap Biilgileri");
        System.out.println("==============");

        //Ad
        System.out.print("Ad Girin:");
        ad=input.nextLine();

        //Soyad
        System.out.print("Soyad Girin:");
        soyad=input.nextLine();

        //Brüt Maaş
        System.out.print("Brüt Maaş Girin(TL):");
        bmaas=input.nextDouble();

        //Çalışma Saati
        System.out.print("Haftalık Çalışma Saati Girin:");
        csaati=input.nextInt();

        //Mesai Saati
        System.out.print("Mesai Saati Sayısı Girin:");
        msaati=input.nextInt();

        //Gelirler
        double Mesai_Ucreti=(bmaas/160)*msaati*1.5;
        double Toplam_Gelir=bmaas+Mesai_Ucreti;

        //Kesintiler
        double SGK=Toplam_Gelir*0.14;
        double Gelir_Vergisi=Toplam_Gelir*0.15;
        double Damga_Vergisi= Toplam_Gelir*0.00759;
        double Toplam_Kesinti=SGK+Damga_Vergisi+Gelir_Vergisi;

        //Net Maaş
        double Net_Maas=Toplam_Gelir-Toplam_Kesinti;

        //İstatistikler
        double Kesinti_Orani=(Toplam_Kesinti/Toplam_Gelir)*100;
        double Saatlik_Net_Kazanc=Net_Maas/176;//22 gün x 8 saat = 176 saat
        double Gunluk_Net_Kazanc=Net_Maas/22;

        //Yazdırma
        System.out.println("=========================");
        System.out.println("      "+"MAAS BORDROSU");
        System.out.println("=========================");

        System.out.println("Çalışan:"+ad+""+soyad);
        System.out.println();
        System.out.println("Gelirler:");
        System.out.printf(" Brut Maaş                 = %.2f%n " , bmaas);
        System.out.printf("Mesai Ücreti              = %.2f ",Mesai_Ucreti);
        System.out.println();
        System.out.println(" ------------------------");
        System.out.printf(" Toplam Gelir              = %.2f%n",Toplam_Gelir);
        System.out.println();
        System.out.println("Kesintiler:");
        System.out.printf(" SGK Kesintisi (yüzde14.0) = %.2f%n",SGK);
        System.out.printf(" Gelir Vetgisi (yüzde15.0) = %.2f%n",Gelir_Vergisi);
        System.out.printf(" Damga Vegisi (yüzde0.8)   = %.2f%n",Damga_Vergisi);
        System.out.println("----------------------------");
        System.out.printf(" Toplam Kesinti            = %.2f%n",Toplam_Kesinti );
        System.out.printf("Net Maaş                   = %.2f%n",Net_Maas);
        System.out.println("----------------------------");
        System.out.printf(" Kesinti Oranı             = %.2f%n",Kesinti_Orani);
        System.out.printf(" Saatlik Net Kazanç        = %.2f%n",Saatlik_Net_Kazanc);
        System.out.printf(" Günlük Net Kazanç         = %.2f%n",Gunluk_Net_Kazanc);
        System.out.println("----------------------------");

        //Sistemi Kapatma
        input.close();








    }
}

