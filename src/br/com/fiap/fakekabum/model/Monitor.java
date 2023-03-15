package br.com.fiap.fakekabum.model;

public class Monitor {
    private String polegadas;
    private double preco;
    private Fabricante fabricante;

    public Monitor(String polegadas,
                   double preco,
                   Fabricante fabricante) {
        this.polegadas = polegadas;
        this.preco = preco;
        this.fabricante = fabricante;
    }
    public String getPolegadas() { return polegadas; }
    public double getPreco() { return preco; }
    public Fabricante getFabricante() { return fabricante; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("polegadas='").append(polegadas).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", fabricante=").append(fabricante);
        sb.append('}');
        return sb.toString();
    }
}
