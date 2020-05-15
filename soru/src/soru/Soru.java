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

//Soru:sizden  geometri ve soru adi altinda iki tane sinif olusturulmaniz isteniyor.Geometri sinifi  kalitim yapacağınız sinifiniz soru sinifi ise ana sinifiniz olacaktir.girilen kenar sayisi en az 2 ve en fazla 3 olacaktir.
//cokbicimlilik kullanarak ilgi sinifin adina bagli olarak kenar uzunluklarina gore ucgen ve dikdortgenin cevresini,dikdortgenin alanini hesaplayan.Temel siniftada dikdortgenin koseyen uzunlugunu bulan methodu kodlayiniz
//Onemli:cevre degiskeni ve alan methodu private tanimlanacaktir  
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

