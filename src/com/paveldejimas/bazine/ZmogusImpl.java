package com.paveldejimas.bazine;


/*
lytis; asmens kodas[nekeičiama]; vardas; pavardė; amžius; svoris; ūgis; plaukų spalva.
2.2. Sukurti metodus pasiimti ir pakeisti kintamųjų reikšmes ir konstruktorių (su parametrais).
2.3. Sukurti 6 skirtingus objektus (žmones).
2.4. Pabandyti pakeisti objektų kintamuosius per metodus ir atspausdinti vartotojui duomenis apie objektą.
 */

// Klasė ZmogusImpl realizuoja(įgyvendina(suteikia kamienus) visus metodus) interfeisą Zmogus

/* 1.1. Išvestinė (vaiko) klasė 'StatybininkasImpl' turi paveldėti bazinę (tėvo) klasę 'ZmogusImpl'
1.2. Sukurti 4 objektus išvestinės ir 4 objektus bazinės klasės.
1.3. Sudėti objektus į sąrašą ir atspausdinti kiek uždirba statybininkai.
 */
public class ZmogusImpl implements Zmogus{
  //  private String lytis;
    private boolean lytis;
    private long asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;

    /* public String getLytis() {
        return lytis;
    } */
    public boolean isVyr(){return lytis;}
  /*public void setLytis(boolean lytis) {
        this.lytis = lytis;
    } */

    public void setLytis(String lytis) {
        if(lytis.equals("Vyr")){
            this.lytis=true;
        }
        else{
            this.lytis=false;
        }

    }
   public long getAsmensKodas() {
        return asmensKodas;
    }
    public String getVardas() {
        return vardas;
    }
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
    public int getAmzius() {
        return amzius;
    }
    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }
    public double getSvoris() {
        return svoris;
    }
    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }
    public double getUgis() {
        return ugis;
    }
    public void setUgis(double ugis) {
        this.ugis = ugis;
    }
    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }
    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }
    public ZmogusImpl(){}
    public ZmogusImpl(String lytis, long asmensKodas, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva ){
       // this.lytis=lytis;

        if(lytis.equals("Vyr")){
            this.lytis=true;
        }
        else{
            this.lytis=false;
        }

        this.asmensKodas=asmensKodas;
        this.vardas=vardas;
        this.pavarde=pavarde;
        this.amzius=amzius;
        this.svoris=svoris;
        this.ugis=ugis;
        this.plaukuSpalva=plaukuSpalva;
    }

    @Override
    public String toString() {
        return
                "lytis='" +(isVyr() ? "Vyr":"Mot") + '\'' +
                ", asmensKodas=" + asmensKodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", svoris=" + svoris +
                ", ugis=" + ugis +
                ", plaukuSpalva='" + plaukuSpalva + '\'';
    }

}
