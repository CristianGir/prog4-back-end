package co.edu.umanizales.grafo.model;

public class Arista{
    private int peso;
    private int origen;
    private int destino;

    public Arista(int peso, int origen, int destino) {
        this.peso = peso;
        this.origen = origen;
        this.destino = destino;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getOrigen() {
        return origen;
    }
    public void setOrigen(int origen) {
        this.origen = origen;
    }
    public int getDestino() {
        return destino;
    }
    public void setDestino(int destino) {
        this.destino = destino;
    }
}