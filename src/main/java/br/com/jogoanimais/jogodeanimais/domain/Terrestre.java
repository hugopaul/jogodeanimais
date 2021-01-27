package br.com.jogoanimais.jogodeanimais.domain;

public class Terrestre {

    private String verbo;
    private String nome;

    public Terrestre() {
    }

    public String getVerbo() {
        return verbo;
    }

    public void setVerbo(String verbo) {
        this.verbo = verbo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                ", verbo='" + verbo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
