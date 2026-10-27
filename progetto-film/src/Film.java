public class Film {
    private String titolo;
    private String regista;
    private int annoUscita;
    private int minuti;
    private float voto;

    public Film
            (String titolo,
             String regista,
             int annoUscita,
             int minuti,
             float voto) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.minuti = minuti;
        this.voto = voto;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return this.regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public int getAnnoUscita() {
        return this.annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    public int getMinuti() {
        return this.minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public float getVoto() {
        return this.voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }
}
