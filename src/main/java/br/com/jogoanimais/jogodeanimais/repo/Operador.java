package br.com.jogoanimais.jogodeanimais.repo;

import br.com.jogoanimais.jogodeanimais.domain.Aquatico;
import br.com.jogoanimais.jogodeanimais.domain.Terrestre;

import java.util.ArrayList;
import java.util.List;

public class Operador {

    private Aquatico aquatico = new Aquatico();
    private Terrestre terrestre = new Terrestre();

    private List<Aquatico> aquaticos = new ArrayList<>();

    private List<Terrestre> terrestres = new ArrayList<>();

    public void adicionarAquatico(Aquatico aq) {
        this.aquaticos.add(aq);
    }
    public void adicionarTerrestre(Terrestre ter) {
        this.terrestres.add(ter);
    }

    public void prePercistAquatico(){
        aquatico.setNome("Tubarão");
        aquatico.setVerbo("");
        this.aquaticos.add(aquatico);
    }
    public void prePercistTerrestre(){
        terrestre.setNome("Macaco");
        terrestre.setVerbo("");
        this.terrestres.add(terrestre);
    }

    public List<Aquatico> getAquaticos() {
        return aquaticos;
    }

    public void setAquaticos(List<Aquatico> aquaticos) {
        this.aquaticos = aquaticos;
    }

    public List<Terrestre> getTerrestres() {
        return terrestres;
    }

    public void setTerrestres(List<Terrestre> terrestres) {
        this.terrestres = terrestres;
    }

    public Aquatico getAquatico() {
        return aquatico;
    }

    public void setAquatico(Aquatico aquatico) {
        this.aquatico = aquatico;
    }

    public Terrestre getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(Terrestre terrestre) {
        this.terrestre = terrestre;
    }
}
