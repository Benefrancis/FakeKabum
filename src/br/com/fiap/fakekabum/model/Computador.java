package br.com.fiap.fakekabum.model;

public class Computador {
    private Fabricante fabricante;
    private Monitor monitor;
    private double preco;
    private int memoriaRam;
    private int ssd;
    private String processador;
    private String placaDeVideo;
    private String placaMae;
    private boolean placaDeVideoDedicada;

    public Computador() {
    }

    public Computador(Fabricante fabricante, String processador, String placaMae) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public Computador(
            Fabricante fabricante,
            Monitor monitor,
            double preco,
            int memoriaRam,
            int ssd,
            String processador,
            String placaDeVideo,
            String placaMae,
            boolean placaDeVideoDedicada) {
        this.fabricante = fabricante;
        this.monitor = monitor;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.ssd = ssd;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.placaMae = placaMae;
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    }


    public Fabricante getFabricante() {
        return fabricante;
    }

    public Computador setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computador setMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public Computador setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public Computador setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public int getSsd() {
        return ssd;
    }

    public Computador setSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Computador setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Computador setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public Computador setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
        return this;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public Computador setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        this.placaDeVideoDedicada = placaDeVideoDedicada;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append("fabricante=").append(fabricante);
        sb.append(", monitor=").append(monitor);
        sb.append(", preco=").append(preco);
        sb.append(", memoriaRam=").append(memoriaRam);
        sb.append(", ssd=").append(ssd);
        sb.append(", processador='").append(processador).append('\'');
        sb.append(", placaDeVideo='").append(placaDeVideo).append('\'');
        sb.append(", placaMae='").append(placaMae).append('\'');
        sb.append(", placaDeVideoDedicada=").append(placaDeVideoDedicada);
        sb.append('}');
        return sb.toString();
    }
}
