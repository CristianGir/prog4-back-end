package co.edu.umanizales.grafo.model;

public class Vertice {
    private Object dato;
    private int codigo;

    public Vertice(Object dato, int codigo) {
        this.dato = dato;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}