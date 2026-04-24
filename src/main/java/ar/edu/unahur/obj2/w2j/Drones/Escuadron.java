package ar.edu.unahur.obj2.w2j.Drones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.Ciudad.CiudadFuturista;
import ar.edu.unahur.obj2.w2j.Ciudad.Zona;

public class Escuadron {
    private Integer limite = CiudadFuturista.getInstance().getLimite();
    private List<Dron> drones = new ArrayList<>();

    public Escuadron(Integer limite) { this.limite = limite; }

    public Escuadron(Integer limite, List<Dron> drones) {
        this.limite = limite;
        this.drones = drones;
    }

    public Integer getLimite() { return limite; }

    public List<Dron> getDrones() { return drones; }

    public void agregarDron(Dron nuevoDron) { 
        if (drones.size() < limite) { this.drones.add(nuevoDron); }
        else { throw new RuntimeException("Supera la cantidad máxima definida por la ciudad"); }
        // no sé si estará bien usada está excepción acá
    }

    public Double capacidadOperativa() { return drones.stream().mapToDouble(d -> d.getEficiencia()).sum(); }

    public Boolean puedeOperarEnZona(Zona unaZona) { 
        return drones.stream().anyMatch(d -> d.esAvanzado()) && 
        this.capacidadOperativa() > (unaZona.getTamaño() * 2);
    }

    public void operarEnZona(Zona unaZona) {
        if (puedeOperarEnZona(unaZona)) {
            unaZona.registrarOperacion();
            drones.forEach(d -> d.reducirAutonomia(2.0));
        }
    }
}