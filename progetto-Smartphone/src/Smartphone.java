public class Smartphone {
    private String marca;
    private String modello;
    private String memoria;
    private int schermo;
    private float prezzo;

    Smartphone(String marca,
               String modello,
               String memoria,
               int schermo,
               float prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.memoria = memoria;
        this.schermo = schermo;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMemoria() {
        return this.memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public int getschermo() {
        return this.schermo;
    }

    public void setSchermo(int schermo) {
        this.schermo = schermo;
    }

    public float getprezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
}











