package co.edu.umanizales.grafo.controller;

import co.edu.umanizales.grafo.model.Arista;
import co.edu.umanizales.grafo.model.Vertice;
import co.edu.umanizales.grafo.service.GrafoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/grafo")
public class GrafoController {
    @Autowired
    private GrafoService GrafoService;
    @PostMapping (path="/agregarVertice")
    public void agregarVertice(@RequestBody Object dato, @RequestBody int codigo) {
        GrafoService.agregarVertice(dato, codigo);
    }
    @PostMapping (path="/agregarArista")
    public void agregarArista(@RequestBody int peso, @RequestBody int origen, @RequestBody int destino) {
        GrafoService.agregarArista(peso, origen, destino);
    }
    @GetMapping (path="/vertices")
    public List<Vertice> getVertices() {
        return GrafoService.getVertices();
    }
    @PostMapping (path="/setVertices")
    public void setVertices(@RequestBody List<Vertice> vertices) {
        GrafoService.setVertices(vertices);
    }
    @GetMapping (path="/aristas")
    public List<Arista> getAristas() {
        return GrafoService.getAristas();
    }
    @PostMapping (path="/setAristas")
    public void setAristas(@RequestBody List<Arista> aristas) {
        GrafoService.setAristas(aristas);
    }
}

