/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru;

/**
 **
 *
 * @author hydon
 */
/**Soru:***Geometri isminde bir sinif tanimlayiniz.bu sinifin;kenar1,kenar2,kenar3 ve alan isimlli tam sayı tipinde 4 özelligu bulunmaktadir.
 Bu sınıfın ayrica cevre adinda bir adet tam sayi tipinde private degiskeni bulunmalidir.
Bu sınııf OOP nin özelliklerini karsilayacak sekilde yapici ve cokbicimlilik barindiran  3 adet methoda sahip olmalidir.
 Bu methodlar geometri adinda geriye tam sayi degeri donduren public method ve
alan adinda geriye tam bir sayi degeri donderen  private bir method olsun.
 geometri methodunuz gonderilen degiskenin sayisina bagli olarak 3 kenar gonderildiyse ucgenin cevresini hesaplama islemini yapmasi isteniyor.
eger degisken olarak iki kenar gonderildiyse geriye dikdortgenin cevresini hesaplayip döndürülmesi  isteniyor.
 Ayrıca alan goster, cevre goster adinda iki adet public method tanimlayip cevre ve alanlarin gosterilmesi isteniyor
geometri sinifindan türetilmis soru isminde baska bir sinif daha bulunmaktadir.bu sınıfın kenaruzunlugu hesapla adinda bir methodu bulunmaktadir 
 bu method geometri sinifindan turetilen dikdortgen olan bir nesnenin kenar uzunlugunu 
 hesaplamaktadır.olusturulan nesnelerin alan ve cevre hesaplariyla.Olusturulan dikdortgen bir nesnenin kenar uzunlugunu hesaplayip ekrana yazdiran programı kodlayiniz
 
**/

class Geometri

{
int kenar1,kenar2,kenar3,alan;
        private int cevre;


public int Geometri(int knr1,int knr2)
{
    
    this.cevre=2*(knr1+knr2);
    return cevre;
    
}

public int Geometri(int knr1,int knr2,int knr3)
{
    
    this.cevre=knr1+knr2+knr3;
    return cevre;
    
}

private int alan(int knr1, int knr2)
{
    this.alan=knr1*knr2;
    return alan;
}


public int getalan()
{
    return alan;
}
public void setAlan(int knr1, int knr2)
{
    this.alan= alan(knr1, knr2);
    
}


public void cevregoster()
{
    System.out.println("girdiginiz geometrik seklin cevresi="+cevre);
}
public void alangoster()
{
    System.out.println("girdiginiz geometrik seklin alani="+alan);
}

}


public class Soru extends Geometri {


        public static void kenaruzunluk(double kenar,double kenar2)
            
    {
      double kenaruzunluk= Math.sqrt((Math.pow(kenar, 2))+Math.pow(kenar2, 2));
        System.out.println("girilen dikdortgenin kenar uzunluğu="+kenaruzunluk );
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    Geometri nesne1=new Geometri();
    nesne1.Geometri(12, 12);
    nesne1.cevregoster();
    nesne1.Geometri(12,13,14);
    nesne1.cevregoster();
    nesne1.setAlan(23, 34);
    nesne1.alangoster();
      nesne1.kenar1=5;
     nesne1.kenar2=3;
        kenaruzunluk(nesne1.kenar1,nesne1.kenar2);
    }
   
   
}

