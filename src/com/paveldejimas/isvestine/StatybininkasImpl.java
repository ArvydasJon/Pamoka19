package com.paveldejimas.isvestine;
import com.paveldejimas.bazine.ZmogusImpl;

// Vaiko klasė StatybinkasImpl paveldi tevo klase ZmogusImpl ir realizuoja statybininkas interfeisą

public class StatybininkasImpl extends ZmogusImpl implements Statybininkas {
    double stazas;
    String issilavinimas;
    String specializacija;
    double atlyginimas;

    @Override
    public double getStazas() {
        return stazas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public void setStazas(double stazas) {
        this.stazas = stazas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }
    public StatybininkasImpl(){}

    public StatybininkasImpl( // išpradžiu perduodame tėvo parametrus
            String lytis, long asmensKodas, String vardas, String pavarde, int amzius, double svoris,
      double ugis, String plaukuSpalva,
        /* po to vaiko parametrus*/  double stazas,String issilavinimas,String specializacija,double atlyginimas){

        super(lytis,asmensKodas,vardas,pavarde,amzius,svoris,ugis,plaukuSpalva); // kviecia tėvo ZmogusImpl konstruktoių
        this.stazas=stazas;
        this.issilavinimas=issilavinimas;
        this.specializacija=specializacija;
        this.atlyginimas=atlyginimas;

    }

    @Override
    public String toString() {
        return "StatybininkasImpl{" +
                "stazas=" + stazas +
                ", issilavinimas='" + issilavinimas + '\'' +
                ", specializacija='" + specializacija + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }

}
