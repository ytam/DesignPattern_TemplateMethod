package com.company;

/**
 * Created by brusk on 21.04.2016.
 */
public abstract class  Dürüm {

    public final void dürümYap(){
        ekmegiHazırla();
        salataKoy();
        etKoy();
        baharatEkle();
        paketYap();

    }

    public void ekmegiHazırla(){
        System.out.println("Ekmek hazırlandı");
    }
    public void salataKoy(){
        System.out.println("Salata ekmeğin içine koyuldu");

    }
    abstract void etKoy();
    abstract void baharatEkle();
    public void paketYap(){
        System.out.println("Paket yapıldı. Afiyet olsun.");
    }
}
