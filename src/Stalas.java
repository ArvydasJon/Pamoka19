/*
1. Sukurti klasę Stalas su kintamaisiais:
	pavadinimas;
	svoris;
	pagaminimoMedziaga;
	kojuSkaicius;
	kaina.

Sukurti konstruktorius, get'erius ir set'erius.

 */

public class Stalas {
    private String pavadinimas;
    private double svoris;
    private String pagaminimoMedziaga;
    private int kojuSkaicius;
   // private double kaina=200;
    private double kaina;
    public Stalas() {
    }

   public Stalas(String pavadinimas, double svoris, String pagaminimoMedziaga, int kojuSkaicius, double kaina) {
        this.pavadinimas = pavadinimas;
        this.pagaminimoMedziaga = pagaminimoMedziaga;
        this.kojuSkaicius = kojuSkaicius;
        this.svoris = svoris;
        this.kaina = kaina;

    }

    public static void main(String[] args) {
        Stalas myStalas = new Stalas();
        myStalas.setKaina(78);
        myStalas.setPavadinimas("Staliuks");
        System.out.println(myStalas.getKaina());
        System.out.println(myStalas.getPavadinimas());
        System.out.println(myStalas.getSvoris());
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public String getPagaminimoMedziaga() {
        return pagaminimoMedziaga;
    }
    public int getKojuSkaicius() {
        return kojuSkaicius;
    }
    public double getSvoris() {
        return svoris;
    }
    public double getKaina() {
        return kaina;
    }
    public void setKaina(double newKaina) {
        this.kaina = newKaina;
    }
    public void setPavadinimas(String newPavadinimas) {
        this.pavadinimas = newPavadinimas;
    }
}