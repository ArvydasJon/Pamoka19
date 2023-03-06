
/* 1. Sukurti klasę Moksleivis su kintamaisiais:id,vardas,pavarde,grupe.
    2.    Sukurti get'erius, set'erius, konstruktorių ir 5 objektus.
    Pabandyti pakeisti kiekvieno objekto požymius (pvz. grupę, vardą, pavardę). */

import java.sql.SQLOutput;

// Moksleivio klasės objekto sukūrimas
// Klasės pavadinimas - objekto pavadinimas - naujo objekto konstravimas
public class Pamoka19 {
    public static void main(String[] args) {
     // Stalas  myStalas=new Stalas();
     // myStalas.setKaina(345);
     //  myStalas.getKaina();
    //  myStalas.kaina;
    //   System.out.println( myStalas.getKaina());

    System.out.println("Pažintis su objektiniu programavimu");

    //  klase       objektas        kontruktorius be parametrų
        Moksleivis moksleivis  = new Moksleivis();
        moksleivis.setId(1);
        moksleivis.setVardas("Petras");
        moksleivis.setPavarde("Klupas");
        moksleivis.setGrupe("Agronomai");

        Moksleivis moksleivis1 = new Moksleivis(2, "Marytė", "Žiogaitė", "Agronomai");
        Moksleivis moksleivis2 = new Moksleivis(3, "Rapas", "Jonaitis", "Medkirčiai");
        System.out.println(moksleivis1.getVardas() + " įstojo į " + moksleivis1.getGrupe()+ " grupę, tačiau suprato, kad nori mokytis Medkirčių grupėje");
        moksleivis1.setGrupe("Medkirčiai");
        System.out.println(moksleivis1.getVardas() + " dabar mokosi grupėje "+ moksleivis1.getGrupe());

    }


}