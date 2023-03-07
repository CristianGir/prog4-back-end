package co.edu.umanizales.grafo.model;

import java.util.ArrayList;
import java.util.List;

public class Grafo{
    private List<Vertice> vertices;
    private List<Arista> aristas;
    private boolean direccionado;

    public List<Vertice> getVertices() {
        return vertices;
    }
    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }
    public List<Arista> getAristas() {
        return aristas;
    }
    public void setAristas(List<Arista> arista) {
        this.aristas = arista;
    }
    public boolean getDireccionado() {
        return this.direccionado;
    }
    public void setDireccionado(boolean direccionado) {
        this.direccionado = direccionado;
    }
    public void agregarVertice(Object dato, int codigo) {
        Vertice vertice = new Vertice(dato, codigo);
        if(validarVertice(vertice)) {
            vertices.add(vertice);
        }
    }
    public void agregarArista(int peso, int origen, int destino) {
        Arista arista = new Arista(peso, origen, destino);
        if(validarArista(arista)) {
            aristas.add(arista);
        }
    }
    public boolean validarVertice(Vertice vertice) {
        for (Vertice i: vertices) {
            if(i.getCodigo() == vertice.getCodigo()) {
                return false;
            }
        }
        return true;
    }
    public boolean validarArista(Arista arista) {
        for (Arista i: aristas) {
            if(i.getOrigen() == arista.getOrigen() && i.getDestino() == arista.getDestino()) {
                return false;
            }
        }
        return true;
    }
}