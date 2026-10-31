public class Animale {
    private String nome;
    private String specie;
    private String razza;
    private int eta;
    private float chilogrammi;

    public Animale
            (String nome, String specie, String razza, int eta, float chilogrammi) {
        this.nome = nome;
        this.specie = specie;
        this.razza = razza;
        this.eta = eta;
        this.chilogrammi = chilogrammi;
    }

    public String GetNome() {
        return this.nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String GetSpecie() {
        return this.specie;
    }

    public void SetSpecie(String specie) {
        this.specie = specie;
    }

    public String GetRazza() {
        return this.razza;
    }

    public void SetRazza(String razza) {
        this.razza = razza;
    }

    public int GetEta() {
        return this.eta;
    }

    public void SetEta(int eta) {
        this.eta = eta;
    }

    public float GetChilogrammi() {
        return this.eta;
    }

    public void SetChilogrammi(float chilogrammi) {
        this.chilogrammi = chilogrammi;
    }
}
