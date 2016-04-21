package com.company;

public class Main {

    public static void main(String[] args) {

        Dürüm tantuni= new Tantuni();
        tantuni.dürümYap();
        System.out.println();
        Dürüm adana = new AdanaDürüm();
        adana.dürümYap();
        System.out.println();
        Dürüm tavukDürüm= new TavukDürüm();
        tavukDürüm.dürümYap();
        System.out.println();
        Dürüm ciğer= new CiğerDürüm();
        ciğer.dürümYap();


    }
}
