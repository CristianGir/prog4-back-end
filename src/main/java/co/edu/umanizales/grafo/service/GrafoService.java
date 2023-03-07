package co.edu.umanizales.grafo.service;

import co.edu.umanizales.grafo.model.Arista;
import co.edu.umanizales.grafo.model.Grafo;
import co.edu.umanizales.grafo.model.Vertice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrafoService {
    private Grafo grafo;

    public String agregarVertice(Object dato, int codigo) {
        grafo.agregarVertice(dato, codigo);
        return "Agregado con éxito";
    }
    public String agregarArista(int peso, int origen, int destino) {
        grafo.agregarArista(peso, origen, destino);
        return "Agregada con éxito";
    }
    public List<Vertice> getVertices() {
        return grafo.getVertices();
    }
    public String setVertices(List<Vertice> vertices) {
        grafo.setVertices(vertices);
        return "Realizado con éxito.";
    }
    public List<Arista> getAristas() {
        return grafo.getAristas();
    }
    public String setAristas(List<Arista> aristas) {
        grafo.setAristas(aristas);
        return "Realizado con éxito.";
    }
}
