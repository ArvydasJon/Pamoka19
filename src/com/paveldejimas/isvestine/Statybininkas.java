/*
    Statybininkas.
    Sukurti interface 'Statybininkas' pakete 'com.paveldejimas.isvestine';
    Sukurti klasę 'StatybininkasImpl', realizuojančią interface 'Statybininkas', pakete 'com.paveldejimas.isvestine':
	stažas;
	išsilavinimas;
	specializacija;
	atlyginimas.
 */

package com.paveldejimas.isvestine;

public interface Statybininkas {
    double getStazas();
    String getIssilavinimas();
    String getSpecializacija();
    double getAtlyginimas();
    void setStazas(double stazas);
    void setIssilavinimas(String issilavinimas);
    void setSpecializacija(String specializacija);
    void setAtlyginimas(double atlyginimas);
}
