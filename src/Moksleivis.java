public class Moksleivis {
    // 1 Klasės kintamieji (požymiai, argumentai, laukai)
    private int id;
    private String vardas;
    private String pavarde;
    private String grupe;

    // 2. Konstruktorius(ai)
    //Konstruktorius be parametrų
    public Moksleivis() {
    }

    // Konstruktoius su visais parametrais
    public Moksleivis(int id, String vardas, String pavarde, String grupe) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.grupe = grupe;
    }

    // 3. Geteriai ir seteriai
    // Geteris tai metodas, kuris grąžina ir yra be parametrų, nes norime tik gauti info
    // Seteris metodas kuris nieko negrąžina, ir yra su parametru.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getGrupe() {
        return grupe;
    }
    public void setGrupe(String grupe){
        this.grupe = grupe;
    }


}
